package Chap04_Implementation;

import java.util.Scanner;

public class prob04 {
	int[] dx = {0, 1, 0, -1};
	int[] dy = {-1, 0, 1, 0};
	
	public int solution(int[] info, int[][] map) {
		int answer = 0;
		int x = info[0];
		int y = info[1];
		int d = info[2];

		while(true) {
			answer++;
			map[x][y] = 1;

			// 네 방향 모두 이미 가본 칸이거나 바다로 되어있는 칸인 경우
			if(map[x][y-1]==1 && map[x+1][y]==1 && map[x][y+1]==1 && map[x-1][y] ==1)
				break;
			
			for(int i=0; i<4; i++) {
				// 1.회전
				if(d != 0) d--;
				else d = 3;	
				
				// 2. 가려는 곳이 비어있으면 전진한다.
				int nx = x + dx[d];
				int ny = y + dy[d];
				if(map[nx][ny] == 0) {
					x = nx;
					y = ny;
					break;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] info = new int[3];
		for(int i=0; i<3; i++) {
			info[i] = kb.nextInt();
		}
		
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(info, map));
	}

}
