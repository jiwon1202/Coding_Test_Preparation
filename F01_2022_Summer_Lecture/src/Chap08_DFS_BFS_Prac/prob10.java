package chap08;

import java.util.Scanner;

public class prob10 {
	static int answer = 0;
	static int[][] board;
	static int[][] move = {{0, -1}, {1, 0}, {0, 1}, {-1,0}};
	
	public void DFS(int i, int j) {
		if(i==6 && j==6) {
			answer++;
			return;
		}
		else {
			for(int[] d : move) {
				int nx = i + d[0];
				int ny = j + d[1];
				if(nx>=0 && nx<7 && ny>=0 && ny<7) {
					if(board[nx][ny] == 0) {
						board[i][j] = 1;
						DFS(nx, ny);
						board[i][j] = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		prob10 T = new prob10();
		Scanner kb = new Scanner(System.in);

		board = new int[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		// 시작점을 1로 초기화 하는 것 까먹지 말기!
		board[0][0] = 1;
		T.DFS(0, 0);
		System.out.println(answer);
	}

}
