package review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
	public int vex;
	public int cost;
	public Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}

public class ch09_p07_pq {

	public static void main(String[] args) {
		ch09_p07_pq T = new ch09_p07_pq();
		Scanner kb = new Scanner(System.in);

		int v = kb.nextInt();
		int e = kb.nextInt();
		int[] ch = new int[v+1];
		
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
		for(int i=0; i<=e; i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		
		int answer = 0;
		PriorityQueue<Edge> PQ = new PriorityQueue<>();
		PQ.offer(new Edge(1, 0));
		
		while(!PQ.isEmpty()) {
			Edge cur = PQ.poll();
			int ev = cur.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += cur.cost;
				for(Edge ob : graph.get(ev)) {
					if(ch[ob.vex] == 0) {
						PQ.offer(new Edge(ob.vex, ob.cost));
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}
