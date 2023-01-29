package chap07;

import java.util.Scanner;

public class prob10 {
	static int n, m, answer;
	static int[] ch;
	static int[][] graph;
	
	public void DFS(int num) {
		if(num == n) {
			answer++;
		}
		else {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0 && graph[num][i] == 1) {
					ch[i] = 1;
					DFS(i);
					ch[i]=0;
				}
			}	
		}
	}

	public static void main(String[] args) {
		prob10 T = new prob10();
		Scanner kb = new Scanner(System.in);
		
		answer = 0;
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			graph[kb.nextInt()][kb.nextInt()] = 1;
		}
		
		ch = new int[n+1];
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
