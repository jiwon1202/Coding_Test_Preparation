package Chap02_Array;

public class q09_SkyLine {
	public int solution(int[][] board) {
		int answer = 0;
		int n = board.length;
		
		// 각 행과 열의 원소 값들 중 최댓값을 저장하는 두 배열
		int[] row = new int[n];
		int[] col = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				row[i] = Math.max(row[i], board[i][j]);
				col[j] = Math.max(col[j], board[i][j]);
			}
		}
		
		// 현재 지점에 해당하는 행과 열의 최댓값 중, 더 작은 값을 기준으로 라인을 맞춰준다.
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				answer += Math.min(row[i], col[j]) - board[i][j];
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q09_SkyLine T = new q09_SkyLine();
		
		int[][] arr1 = {{2, 5, 7, 3},
					   {6, 8, 9 ,7},
					   {3, 2, 4, 5},
					   {7, 2, 5, 8}};
		System.out.println(T.solution(arr1));
		
		int[][] arr2 = {{3, 7, 6, 2},
				   		{5, 3, 8 ,7},
				   		{3, 2, 5, 7},
				   		{7, 7, 5, 3}};
	System.out.println(T.solution(arr2));
	}
}
