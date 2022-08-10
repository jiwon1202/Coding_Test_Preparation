package Chap02_Array;

public class q08_FindPeak {
	// 좌, 상, 우, 하
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public int solution(int[][] board) {
		int answer = 0;
		int n = board.length;
		
		for(int i = 0; i < n; i++) {			// (1) 행
			for(int j = 0; j < n; j++) {		// (2) 열
				boolean flag = true;
				
				for(int k = 0; k < 4; k++) {	// (3) 현재 지점의 값이 상하좌우 값보다 큰 경우 flag=true 상태로 반복문 탈출
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					// 봉우리가 아니면 (3) 반복문을 멈추고 다시 위의 과정 반복
					if((0 <= nx) && (nx < n) && (0 <= ny) && (ny < n) && (board[nx][ny] >= board[i][j])){
						flag = false;
						break;
					}
				}
				// 봉우리라면 해당 지점까지 도달하여 answer++
				if (flag)
					answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q08_FindPeak T = new q08_FindPeak();
		int[][] arr={{5, 3, 7, 2, 3}, 
					 {3, 7, 1, 6, 1}, 
					 {7, 2, 5, 3, 4}, 
					 {4, 3, 6, 4, 1}, 
					 {8, 7, 3, 5, 2}};
		System.out.println(T.solution(arr));
	}
}
