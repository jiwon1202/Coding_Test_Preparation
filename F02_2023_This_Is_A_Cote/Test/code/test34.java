package Chap08_DP;

import java.util.*;

public class test34 {
	public int solution(int n, int[] heights) {
		int[] dp = new int[n];
		for(int i=0; i<n; i++)	dp[i] = 1;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if (heights[j] < heights[i])
					dp[i] = Math.max(dp[i], dp[j]+1);
			}
		}
		
		int max = -1;
		for(int num : dp)
			max = Math.max(max, num);
		
		return n - max;
	}

	public static void main(String[] args) {
		test34 T = new test34();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] heights = new int[n];
		for(int i=0; i<n; i++)
			heights[i] = kb.nextInt();
		
		System.out.println(T.solution(n, heights));
	}

}
