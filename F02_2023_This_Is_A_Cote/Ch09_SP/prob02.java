package Chap09_SP;

import java.util.Scanner;

public class prob02 {
	static int n;
	static int[][] graph;
	
	public void FloydWarshall() {
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		int m = kb.nextInt();
		graph = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j)	graph[i][j] = 0;
				else		graph[i][j] = 9999999;
			}
		}
		
		for(int i=0; i<m; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			int d = kb.nextInt();
			graph[s][e] = d;
		}
		
		T.FloydWarshall();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}

}
