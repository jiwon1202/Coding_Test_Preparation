package Chap04_Implementation;

import java.util.Scanner;

public class prob04 {
	int[] dx = {0, 1, 0, -1};
	int[] dy = {-1, 0, 1, 0};
	static int[][] map, ch;
	
	public int solution(int[] info) {
		int answer = 0;
		int x = info[0];
		int y = info[1];
		int d = info[2];
		
		int turn_time = 0;
		while(true) {
			// 1. 회전 후 바라보는 방향의 좌표를 nx, ny에 저장
			d = (d == 0) ? 3 : d-1;
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			// 2-1. 다음 좌표가 육지이면서 가보지 않은 칸인 경우 이동
			if(map[nx][ny] == 0 && ch[nx][ny] == 0) {
				answer++;
				ch[nx][ny] = 1;
				x = nx;
				y = ny;
				turn_time = 0;
				continue;
			}
			// 2-2. 그렇지 않은 경우(바다 or 가본 칸) 회전만 한다.
			else {
				turn_time++;
			}
			
			// 3. 네 방향 모두 갈 수 없는 경우
			if(turn_time == 4) {
				nx = x - dx[d]; // 뒤로 가는 경우 x - dx 를 해주면 된다는 사실을 알게 되었다.
				ny = y - dy[d]; // 복잡하게 인덱를 다시 계산할 이유가 없었다!
				
				// 3-1. 뒤가 육지인 경우
				if(map[nx][ny] == 0) {
					x = nx;
					y = ny;
					turn_time = 0;
				}
				// 3-2. 뒤가 바다인 경우 종료
				else 
					break;
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
		
		map = new int[n][m];
		ch = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = kb.nextInt();
				ch[i][j] = map[i][j];
			}
		}
		
		System.out.println(T.solution(info));
	}

}
