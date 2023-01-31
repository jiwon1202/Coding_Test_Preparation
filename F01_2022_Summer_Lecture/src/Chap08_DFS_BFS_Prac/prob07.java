package chap08;

import java.util.Scanner;

public class prob07 {
	static int n, r;
	static int[][] fibo;
	int cnt = 0;
	
	public int DFS(int n, int r) {
		if(fibo[n][r] > 0)
			return fibo[n][r];
		
		if(r == 1) {
			return fibo[n][r] = n;
		}
		else if (r == n) {
			return fibo[n][r] = 1;
		}
		else {
			return fibo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}
	
	public static void main(String[] args) {
		prob07 T = new prob07();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		r = kb.nextInt();
		fibo = new int[n+1][r+1];
		
		System.out.println(T.DFS(n, r));
	}

}
