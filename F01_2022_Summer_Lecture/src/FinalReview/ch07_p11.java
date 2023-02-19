package review;

import java.util.Scanner;
import java.util.ArrayList;

public class ch07_p11 {
	static int[] ch;
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	
	public void BFS(int num) {
		if (num == n) {
			answer++;
		}
		else {
			for(int x : graph.get(num)) {
				if(ch[x] == 0) {
					ch[x] = 1;
					BFS(x);
					ch[x] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		ch07_p11 T = new ch07_p11();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		m = kb.nextInt();
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		
		ch[1]=1;
		T.BFS(1);
		System.out.println(answer);
	}

}
