package chap07;

import java.util.Scanner;

public class prob04 {
	static int[] fibo;
	
	public int DFS(int n) {
		if(fibo[n] > 0)
			return fibo[n];
		
		if (n == 1 || n == 2) {
			return fibo[n] = 1;
		}
		else {
			return fibo[n] = DFS(n-2) + DFS(n-1);
		}
	}

	public static void main(String[] args) {
		prob04 T  = new prob04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		fibo = new int[n+1];
		
		T.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

}
