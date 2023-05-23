package Chap08_DP;

import java.util.*;

public class test31 {
	public int solution(int n, int m, int[][] gold) {
		int answer = 0;
		
		for(int j=1; j<m; j++) {
			for(int i=0; i<n; i++) {
				int left_up, left_down, left;
				
				if (i==0)	left_up = 0;
				else		left_up = gold[i-1][j-1];
				
				if(i==n-1)	left_down = 0;
				else		left_down = gold[i+1][j-1];
				
				left = gold[i][j-1];
				
				gold[i][j] = gold[i][j] + Math.max(left_up, Math.max(left_down ,left));
			}
		}
		
		for(int i=0; i<n; i++) {
			answer = Math.max(answer, gold[i][m-1]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test31 T = new test31();
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();
		
		for(int cnt=0; cnt<t; cnt++) {
			int n = kb.nextInt();
			int m = kb.nextInt();
			int[][] gold = new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					gold[i][j] = kb.nextInt();
				}
			}
			System.out.println(T.solution(n, m, gold));
		}
	}

}
