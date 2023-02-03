package chap08;

import java.util.Scanner;

public class prob13_DFS {
	static int n, answer = 0;
	static int[][] board;
	static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public void DFS(int x, int y) {
		board[x][y] = 0;
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(board[nx][ny]== 1) {
					DFS(nx, ny);	
				}
			}
		}
	}

	public static void main(String[] args) {
		prob13_DFS T = new prob13_DFS();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					T.DFS(i, j);
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}

}
