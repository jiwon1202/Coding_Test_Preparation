package chap08;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class prob13_BFS {
	static int n, answer = 0;
	static int[][] board;
	static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Point cur = Q.poll();
				for(int j=0; j<8; j++) {
					int nx = cur.x + dx[j];
					int ny = cur.y + dy[j];
					if(nx>=0 && nx<n && ny>=0 && ny<n) {
						if(board[nx][ny] == 1) {
							board[nx][ny] = 0;
							Q.offer(new Point(nx, ny));
						}
					}
				}
			}
		}
	}
	
	public void solution() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					board[i][j] = 0;
					BFS(i, j);
					answer++;
				}
			}
		}
	}

	public static void main(String[] args) {
		prob13_BFS T = new prob13_BFS();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		T.solution();
		System.out.println(answer);
	}
}
