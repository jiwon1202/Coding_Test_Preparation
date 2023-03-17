package Chap05_DFS_BFS;

import java.util.Scanner;

public class prob01 {
	static int n, m;
	static int[][] arr;
	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public void DFS(int x, int y) {
		arr[x][y] = 1;
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny] == 0) {
				DFS(nx, ny);
			}
		}
	}
	
	public int solution(int[][] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) {
					DFS(i, j);
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(arr));
	}

}
