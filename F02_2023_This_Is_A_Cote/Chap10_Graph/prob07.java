package Chap10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class prob07 {
	static int[] time, indegree;
	static ArrayList<ArrayList<Integer>> graph;
	
	public int[] topology_sort() {
		int[] answer = time.clone();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=1; i<time.length; i++)
			if(indegree[i] == 0)
				pq.offer(i);
		
		while(!pq.isEmpty()) {
			int now = pq.poll();
			
			for(int x : graph.get(now)) {
				answer[x] = Math.max(answer[x], answer[now] + time[x]);
				indegree[x] -= 1;
				if(indegree[x] == 0)	pq.offer(x);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob07 T = new prob07();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		indegree = new int[n+1];
		time = new int[n+1];
		graph = new ArrayList<>();
		for(int i=0; i<=n; i++)	graph.add(new ArrayList<>());
		
		for(int i=1; i<=n; i++) {
			time[i] = kb.nextInt();
			
			while(true) {
				int num = kb.nextInt();
				if(num == -1)	break;
				indegree[i] += 1;
				graph.get(num).add(i);
			}
		}
		
		for(int x : T.topology_sort())
			System.out.println(x);
		
	}

}
