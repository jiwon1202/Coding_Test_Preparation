package chap08;

import java.util.Scanner;

public class prob09 {
	static int n, m;
	static int[] ch, pm;
	static int[][] dy;
	
	public void DFS(int L, int s) {
		if(L==m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i=s; i<=n; i++) {
				pm[L] = i;
				DFS(L+1, s+i);
			}
		}
	}

	public static void main(String[] args) {
		prob09 T = new prob09();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		ch = new int[n+1];
		pm = new int[m];
		dy = new int[n+1][n+1];
		
		T.DFS(0, 1);
	}

}
