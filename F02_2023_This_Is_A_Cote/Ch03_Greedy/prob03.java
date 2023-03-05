package Chap03_Greedy;

import java.util.Scanner;

public class prob03 {
	static int n, m;
	static int[][] arr;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public void DFS(int x, int y) {
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny]==0) {
				arr[nx][ny] = 1;
				DFS(nx, ny);
			}
		}
	}
	
	public int solution() {
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
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution());
	}

}
