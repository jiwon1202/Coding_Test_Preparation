package review;

import java.util.Scanner;

public class ch07_p04 {
	static int[] fibo;
	
	public int DFS(int L) {
		if(fibo[L] > 0)
			return fibo[L];
		
		if(L==0 || L==1) {
			return fibo[L] = 1;
		}
		else {
			return fibo[L] = DFS(L-1) + DFS(L-2);
		}
	}

	public static void main(String[] args) {
		ch07_p04 T = new ch07_p04();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		fibo = new int[n];
		
		T.DFS(n-1);
		for(int x : fibo) {
			System.out.print(x + " ");
		}
	}

}
