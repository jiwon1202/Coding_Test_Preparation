package Chap10;

import java.util.Scanner;

public class prob02 {
	public int find_parent(int[] parent, int x) {
		if (parent[x] != x)
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
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		int v = kb.nextInt();
		int[] parent = new int[v+1];
		for (int i=1; i<=v; i++)	parent[i] = i;
		
		int e = kb.nextInt();
		boolean cycle = false;
		for (int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			if (T.find_parent(parent, a) == T.find_parent(parent, b)) {
				cycle = true;
				break;
			}
			else
				T.union_parent(parent, a, b);
		}
		
		if (cycle)	System.out.println("사이클 발생");
		else		System.out.println("사이클 없음");
	}

}
