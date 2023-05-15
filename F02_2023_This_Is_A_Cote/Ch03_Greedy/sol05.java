package Chap03_Greedy;

import java.util.Scanner;

public class sol05 {
	public int solution(int n, int m, int[] weights) {
		int answer=0;
		
		for(int i=1; i<=m; i++) {
			n -= weights[i];
			answer += weights[i] * n;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		sol05 T = new sol05();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] weights = new int[11];
		for(int i=0; i<n; i++)
			weights[kb.nextInt()] += 1;
		
		System.out.println(T.solution(n, m, weights));
	}

}
