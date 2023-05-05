package Chap10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Edge implements Comparable<Edge>{
	int s, e, d;
	
	public Edge(int s, int e, int d) {
		this.s = s;
		this.e = e;
		this.d = d;
	}
	
	@Override
	public int compareTo(Edge o) {
		return this.d - o.d;
	}
}

public class prob03 {
	public int find_parent(int[] parent, int x) {
		if(parent[x] != x)
			parent[x] = find_parent(parent, parent[x]);
		return parent[x];
	}

	public void union_parent(int[] parent, int a, int b) {
		a = find_parent(parent, a);
		b = find_parent(parent, b);
		if (a < b)	parent[b] = a;
		else		parent[a] = b;
	}
	
	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		int v = kb.nextInt();
		int[] parent = new int[v+1];
		for(int i=1; i<v; i++)	parent[i] = i;
		
		int e = kb.nextInt();
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Edge(a, b, d));
		}
		Collections.sort(arr);
		
		int dis = 0;
		for(Edge edge : arr) {
			if (T.find_parent(parent, edge.s) != T.find_parent(parent, edge.e)) {
				T.union_parent(parent, edge.s, edge.e);
				dis += edge.d;
			}		
		}
		System.out.println(dis);
	}

}
