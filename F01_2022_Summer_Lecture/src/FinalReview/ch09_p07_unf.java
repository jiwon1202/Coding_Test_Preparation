package review;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable<E> {
	int v1, v2, cost;
	public E(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	public int compareTo(E o) {
		return this.cost - o.cost;
	}
}

public class ch09_p07_unf {
	static int[] unf;
	static int answer;
	static ArrayList<E> arr;
	
	public int Find(int v) {
		if (v == unf[v]) {
			return v;
		}
		else {
			return unf[v] = Find(unf[v]);
		}
	}
	
	public void Union(E edge) {
		int f1 = Find(edge.v1);
		int f2 = Find(edge.v2);
		if (f1 != f2) {
			unf[f1] = f2;
			answer += edge.cost;
		}
	}
	
	public static void main(String[] args) {
		ch09_p07_unf T = new ch09_p07_unf();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		unf = new int[n+1];
		for(int i=1; i<=n; i++) {
			unf[i] = i;
		}

		int m = kb.nextInt();
		arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new E(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		Collections.sort(arr);
		
		for(E edge : arr) {
			T.Union(edge);
		}
		
		System.out.println(answer);
	}

}
