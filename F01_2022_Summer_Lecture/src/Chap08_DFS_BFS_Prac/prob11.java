package chap08;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class prob11 {
	static int s = 7;
	static int[][] board, dis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		
		while(!Q.isEmpty()) {
			Point cur = Q.poll();
			for(int j=0; j<4; j++) {
				int nx = cur.x + dx[j];
				int ny = cur.y + dy[j];
					
				if(nx>=0 && nx<7 && ny>=0 && ny<7) {
					if(board[nx][ny] == 0) {
						board[nx][ny] = 1;
						Q.offer(new Point(nx, ny));
						dis[nx][ny] = dis[cur.x][cur.y] + 1; 
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob11 T = new prob11();
		Scanner kb = new Scanner(System.in);
		
		board = new int[s][s];
		dis = new int[s][s];
		for(int i=0; i<s; i++) {
			for(int j=0; j<s; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		T.BFS(0, 0);
		if(dis[6][6] == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(dis[6][6]);
		}
	}
}
