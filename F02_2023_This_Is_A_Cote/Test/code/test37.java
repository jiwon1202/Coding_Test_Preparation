package Chap09_SP;

import java.util.*;

class Bus{
	int a, b, c;
	public Bus(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class test37 {
	static int MAX = 100001;

	public static void main(String[] args) {
		test37 T = new test37();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] cost = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i!=j) {
					cost[i][j] = MAX;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			
			cost[a][b] = Math.min(cost[a][b], c);
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
				}
			}
		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(cost[i][j] + " ");
			}
			System.out.println();
		}
	}
}
