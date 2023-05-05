package Chap10;

import java.util.Scanner;

public class prob01 {
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
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		int v = kb.nextInt();
		int[] parent = new int[v+1];
		for(int i=1; i<=v; i++)	parent[i] = i;
		
		int e = kb.nextInt();
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			T.union_parent(parent, a, b);
		}
		
		System.out.print("각 원소가 속한 집합: ");
		for(int i=1; i<=v; i++)	System.out.print(T.find_parent(parent, i) + " ");
		
		System.out.print("\n부모 테이블: ");
		for(int i=1; i<=v; i++)	System.out.print(parent[i] + " ");
	}

}
