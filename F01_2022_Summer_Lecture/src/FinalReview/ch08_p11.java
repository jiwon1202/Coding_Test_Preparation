package review;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Point{
	int x, y, dis;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ch08_p11 {
	static int[][] board, dis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public void BFS(int x, int y) {
		board[x][y] = 1;
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		
		while(!Q.isEmpty()) {
			Point cur = Q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				if (nx>=0 && nx<7 && ny>=0 && ny<7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[cur.x][cur.y] + 1; 
				}
			}
		}
	}

	public static void main(String[] args) {
		ch08_p11 T = new ch08_p11();
		Scanner kb = new Scanner(System.in);

		dis = new int[7][7];
		board = new int[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
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
