package chap09;

import java.util.*;

class Edge2 implements Comparable<Edge2> {
	public int vex;
	public int cost;
	Edge2(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge2 o) {
		return this.cost - o.cost;
	}
}

public class prob05_lecture {
	static int n, m;
	static ArrayList<ArrayList<Edge2>> graph;
	static int[] dis;
	
	public void solution(int v) {
		PriorityQueue<Edge2> pQ = new PriorityQueue<>();
		pQ.offer(new Edge2(v, 0));
		dis[v] = 0;
		
		while(!pQ.isEmpty()) {
			Edge2 tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			
			if(nowCost > dis[tmp.vex])
				continue;
			
			for(Edge2 ob : graph.get(tmp.vex)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge2(ob.vex, nowCost + ob.cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		prob05_lecture T = new prob05_lecture();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		graph  = new ArrayList<ArrayList<Edge2>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge2>());
		}
		
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			int c = kb.nextInt();
			graph.get(s).add(new Edge2(e, c));
		}
		
		T.solution(1);
		for(int i=2; i<=n; i++) {
			System.out.print(i + " : ");
			if(dis[i] == Integer.MAX_VALUE)
				System.out.println("impossible");
			else
				System.out.println(dis[i]);
		}
	}

}
