package Chap08_DP;

import java.util.Scanner;

public class prob03 {
	static int answer = Integer.MAX_VALUE;
	
	public void solution(int n, int L) {
		if (L > answer)	return;
		if (n==1) {
			answer = L;
			return;
		}
		
		if (n%5 == 0)	solution(n/5, L+1);
		if (n%3 == 0)	solution(n/3, L+1);
		if (n%2 == 0)	solution(n/2, L+1);
		solution(n-1, L+1);
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n, 0);
		System.out.println(answer);
	}

}
