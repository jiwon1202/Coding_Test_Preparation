package chap09;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Edge implements Comparable<Edge> {
	public int v1;
	public int v2;
	public int cost;
	Edge(int v1, int v2, int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}

public class prob07_unf {
	static int answer;
	static ArrayList<Edge> arr;
	
	static int[] unf;
	
	public int Find(int v) {
		if(v == unf[v]) 
			return v;
		else
			return unf[v] = Find(unf[v]);
	}
	
	public void Union(Edge e) {
		int f1 = Find(e.v1);
		int f2 = Find(e.v2);
		if(f1 != f2) {
			unf[f1] = f2;
			answer += e.cost;
		}
	}

	public static void main(String[] args) {
		prob07_unf T = new prob07_unf();
		Scanner kb = new Scanner(System.in);

		int v = kb.nextInt();
		int e = kb.nextInt();
		
		unf = new int[v+1];
		for(int i=1; i<=v; i++) {
			unf[i] = i;
		}
		
		arr = new ArrayList<>();
		for(int i=0; i<e; i++) {
			arr.add(new Edge(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		
		Collections.sort(arr);
		
		for(Edge edge : arr) {
			T.Union(edge);
		}
		
		System.out.println(answer);
	}

}
