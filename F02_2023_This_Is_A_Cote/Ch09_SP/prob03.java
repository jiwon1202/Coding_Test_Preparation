package Chap09_SP;

import java.util.Scanner;

public class prob03 {
	static int[][] graph;
	static int n;
	static int max = 999999;
	
	public void FloyWarshall() {
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		graph = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {			
			for(int j=1; j<=n; j++) {
				if(i==j)	continue;
				graph[i][j] = max;
			}
		}
		
		int m = kb.nextInt();
		for(int i=0; i<m; i++) {
			int n1 = kb.nextInt();
			int n2 = kb.nextInt();
			graph[n1][n2] = 1;
			graph[n2][n1] = 1;
		}
		
		T.FloyWarshall();
		
		int x = kb.nextInt();
		int k = kb.nextInt();
		int dis = graph[1][k] + graph[k][x];
		if (dis >= max)	System.out.println(-1);
		else			System.out.println(dis);
	}

}
