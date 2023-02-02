package chap08;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class prob12 {
	static int m, n, max, sum, answer = 0;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] box;
	static Queue<Point> Q = new LinkedList<>();
	
	public void BFS(int x, int y) {
		while(!Q.isEmpty()) {
			int tmp = sum;
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Point cur = Q.poll();
	
				for(int j=0; j<4; j++) {
					int nx = cur.x + dx[j];
					int ny = cur.y + dy[j];
					if(nx>=0 && nx<n && ny>=0 && ny<m) {
						if(box[nx][ny] == 0) {
							box[nx][ny] = 1;
							sum += 1;
							Q.offer(new Point(nx, ny));
						}
					}
				}
			}
			answer++;

			if(tmp == sum) {
				answer = -1;
				break;
			}
			if(sum == max) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		prob12 T = new prob12();
		Scanner kb = new Scanner(System.in);

		m = kb.nextInt();
		n = kb.nextInt();
		box = new int[n][m];
		
		sum = 0;
		max = m * n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				box[i][j] = kb.nextInt();
				if(box[i][j] == 1) {
					sum += 1;
					Q.offer(new Point(i, j));
				}
				else if(box[i][j] == -1) {
					max -= 1;
				}
			}
		}
		
		T.BFS(0, 0);
		System.out.println(answer);
	}

}
