package review;

import java.util.Scanner;

public class ch08_p08 {
	static int n, f;
	static int[] b, p, ch;
	static int[][] dy = new int[35][35];
	static boolean flag = false;
	
	public int combi(int n, int r) {
		if(dy[n][r] > 0) {
			return dy[n][r];
		}
		
		if(r == 0 || r == n) {
			return dy[n][r] = 1;
		}
		else if(r == 1) {
			return dy[n][r] = n;
		}
		else {
			return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
		}
	}
	
	public void DFS(int L, int sum) {
		if(flag)
			return;
		
		if(L > n) {
			return;
		}
		else if(L==n && sum == f) {
			for(int x : p) {
				System.out.print(x + " ");
			}
			flag = true;
		}
		else {
			for(int i=0; i<n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i+1;
					DFS(L+1, sum+(b[L] * p[L]));
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		ch08_p08 T = new ch08_p08();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		ch = new int[n];
		p = new int[n];
		b = new int[n];
		for(int i=0; i<n; i++) {
			b[i] = T.combi(n-1, i);
		}
		f = kb.nextInt();
		
		T.DFS(0, 0);
	}

}
