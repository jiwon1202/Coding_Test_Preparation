package Chap10;

import java.util.*;

public class prob06 {
	public int find(int[] map, int x) {
		if(map[x] != x)
			map[x] = find(map, map[x]);
		return map[x];
	}
	
	public void union(int[] map, int a, int b) { 
		a = find(map, a);
		b = find(map, b);
		if(a < b)	map[b] = a;
		else		map[a] = b;
	}
	
	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] map = new int[n+1];
		for(int i=1; i<=n; i++)	map[i] = i;
		
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge(a, b, c));
		}
		Collections.sort(arr);
		
		int answer = 0;
		int last = 0;
		for(Edge E : arr) {
			if (T.find(map, E.s) != T.find(map, E.e)) {
				answer += E.d;
				T.union(map, E.s, E.e);
				last = E.d;
			}
		}
		answer -= last;
		System.out.println(answer);
	}

}

