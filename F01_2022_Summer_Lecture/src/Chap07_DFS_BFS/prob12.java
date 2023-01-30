package chap07;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class prob12 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(v);
		ch[v] = 1;
		// dis[v] = 0;
		int L = 0;

		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int parent = Q.poll();
				for(int nv : graph.get(parent)) {
					if(ch[nv] == 0) {
						ch[nv] = 1;
						dis[nv] = L+1;
						//dis[nv] = dis[parent] + 1;
						Q.offer(nv);
					}
				}	
			}
			L++;
		}
	}
	
	public static void main(String[] args) {
		prob12 T = new prob12();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1]; 
		dis = new int[n+1];
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			graph.get(kb.nextInt()).add(kb.nextInt());
		}
		
		T.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
