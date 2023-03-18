package Chap05_DFS_BFS;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Point{
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class prob02 {
	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int BFS(int n, int m, int[][] map) {
		int answer = -1;
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(1, 1));
		map[1][1] = 0;
		
		while(!Q.isEmpty()) {
			Point cur = Q.poll();
			if(cur.x == n && cur.y == m) {
				break;
			}
			answer++;
			
			for(int i=0; i<4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				if(nx>0 && nx<=n && ny>0 && ny<=m && map[nx][ny] == 1) {
					Q.offer(new Point(nx, ny));
					map[nx][ny] = 0;
				}
			}
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] map = new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				map[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.BFS(n, m, map));
	}
}
