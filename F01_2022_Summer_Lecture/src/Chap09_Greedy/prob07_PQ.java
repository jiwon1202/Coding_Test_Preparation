package chap09;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

class Edge3 implements Comparable<Edge3> {
	public int vex;
	public int cost;
	public Edge3(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	public int compareTo(Edge3 o) {
		return this.cost - o.cost;
	}
}

public class prob07_PQ {
	static int v;

	public static void main(String[] args) {
		prob07_PQ T =new prob07_PQ();
		Scanner kb = new Scanner(System.in);
		
		int v = kb.nextInt();
		int e = kb.nextInt();
		int[] ch = new int[v+1];
		
		ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
		for(int i=0; i<=v; i++) {
			graph.add(new ArrayList<Edge3>());
		}
		
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge3(b, c));
			graph.get(b).add(new Edge3(a, c));
		}
		
		int answer = 0;
		PriorityQueue<Edge3> pQ = new PriorityQueue<>();
		pQ.offer(new Edge3(1, 0));
		
		while(!pQ.isEmpty()) {
			Edge3 tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge3 ob : graph.get(ev)) {
					if(ch[ob.vex]==0) {
						pQ.offer(new Edge3(ob.vex, ob.cost));
					}
				}
			}
		}
		
		System.out.println(answer);
	}

}
