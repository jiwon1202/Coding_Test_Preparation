package Chap02_Array;

import java.util.ArrayList;

public class q10_Election {
	public ArrayList<Integer> solution(int n, int[][] votes, int k) {
		ArrayList<Integer> answer = new ArrayList<>();
		// 개표 결과를 저장하는 배열: 행 - 투표를 한 사람 / 열 - 표를 받은 사람
		int[][] report = new int[n][n];
		// k개 이상의 표를 받았는지 저장하는 배열
		int[] candidate = new int[n];
		
		for(int[] v : votes) {
			report[v[0]][v[1]] =  1;
			candidate[v[1]]++;
		}
		
		for(int i=0; i<n; i++) {
			candidate[i] = candidate[i] >= k ? 1 : 0;
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 0;
			for(int j=0; j<n; j++) {
				if(report[i][j] == 1 && candidate[j] == 1) {
					cnt++;
				}
			}
			answer.add(cnt);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q10_Election T = new q10_Election();

		int[][] arr = {{0, 1},
					   {0, 3},
					   {1, 2},
					   {2, 0},
					   {2, 3},
					   {3, 0}};
		System.out.print(T.solution(4, arr, 2));
	}
}
