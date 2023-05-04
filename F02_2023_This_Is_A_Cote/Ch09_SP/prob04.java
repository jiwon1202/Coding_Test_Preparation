package Chap09_SP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class prob04 {
	static int[] dis;
	static ArrayList<ArrayList<Node>> arr;
	
	public void dijkstart(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		dis[start] = 0;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int d = node.distance;
			int now = node.idx;
			
			if(dis[now] < d)	continue;
			
			for(int i=0; i<arr.get(now).size(); i++) {
				int cost = dis[now] + arr.get(now).get(i).distance;
				if(dis[arr.get(now).get(i).idx] > cost) {
					dis[arr.get(now).get(i).idx] = cost;
					pq.offer(new Node(arr.get(now).get(i).idx, cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int c = kb.nextInt();
		
		dis = new int[n+1];
		for(int i=1;i<=n; i++)	dis[i] = Integer.MAX_VALUE;
		
		arr = new ArrayList<>();
		for(int i=0; i<=n; i++)	arr.add(new ArrayList<Node>());
		
		for(int i=0; i<m; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			int d = kb.nextInt();
			arr.get(s).add(new Node(e, d));
		}
		
		T.dijkstart(c);
		
		int cnt = 0;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(dis[i] != Integer.MAX_VALUE && i != c) {
				cnt += 1;
				sum += dis[i];
			}
		}
		System.out.println(cnt + " " + sum);
	}

}
