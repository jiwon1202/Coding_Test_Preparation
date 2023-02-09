package chap09;

import java.util.*;

class Edge {
	int s, e, c;
	public Edge(int s, int e, int c) {
		this.s = s;
		this.e = e;
		this.c = c;
	}
}

public class prob05_mine {
	static int n, m;
	static int[] dis;
	
	public void solution(ArrayList<Edge> arr) {
		for(Edge graph : arr) {
			int e = graph.e;
			int s = graph.s;
			int c = graph.c;

			if(dis[s] != Integer.MAX_VALUE) {
				dis[e] = Math.min(dis[e], dis[s] + c);
			}
		}
	}

	public static void main(String[] args) {
		prob05_mine T = new prob05_mine();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		dis = new int[n+1];
		for(int i=2; i<=n; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i=0; i<m; i++) {
			arr.add(new Edge(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		
		T.solution(arr);
		
		for(int i=2; i<=n; i++) {
			System.out.print(i + " : ");
			if(dis[i] == Integer.MAX_VALUE)
				System.out.println("impossible");
			else
				System.out.println(dis[i]);
		}
	}

}
