package chap08;

import java.util.Scanner;

public class prob02 {
	static int c, n, max = Integer.MIN_VALUE;
	static int[] weight;
	
	public void DFS(int L, int sum) {
		if(sum > c) {
			return;
		}
		
		if(L==n) {
			max = Math.max(max, sum);
		}
		else {
			DFS(L+1, sum + weight[L]);
			DFS(L+1, sum);
		}
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		c = kb.nextInt();
		n = kb.nextInt();
		weight = new int[n];
		for(int i=0; i<n; i++) {
			weight[i] = kb.nextInt();
		}
		
		T.DFS(0, 0);
		System.out.println(max);
	}

}
