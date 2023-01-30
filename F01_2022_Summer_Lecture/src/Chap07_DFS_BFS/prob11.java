package chap07;

import java.util.Scanner;
import java.util.ArrayList;

public class prob11 {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) {
			answer++;
		}
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob11 T = new prob11();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			graph.get(kb.nextInt()).add(kb.nextInt());
		}
		ch[1] = 1;
		
		T.DFS(1);
		System.out.println(answer);
	}

}
