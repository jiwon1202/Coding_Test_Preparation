package chap08;

import java.util.Scanner;

public class prob04 {
	static int[] pm;
	static int n, m;
	
	public void DFS(int L) {
		if(L == m) {
			System.out.println(pm[0] + " " + pm[1]);
		}
		else {
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		
		T.DFS(0);
		
	}

}
