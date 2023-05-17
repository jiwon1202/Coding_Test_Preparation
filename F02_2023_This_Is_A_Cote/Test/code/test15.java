package Chap05_DFS_BFS;

import java.util.*;

public class test15 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int k = kb.nextInt();
		int x = kb.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		int[] dis =new int[n+1];
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
			dis[i]=-1;
		}
		
		for(int i=0;i<m;i++) {
			graph.get(kb.nextInt()).add(kb.nextInt());
		}

		dis[x]=0;
		Queue<Integer> q=new LinkedList<>();
		q.offer(x);
		while(!q.isEmpty()) {
			int now=q.poll();
			for(int i=0;i<graph.get(now).size();i++) {
				int next=graph.get(now).get(i);
				if(dis[next]==-1) {
					dis[next]=dis[now]+1;
					q.offer(next);
				}
			}
		}
		
		boolean check=false;
		for(int i=1;i<=n;i++) {
			if(dis[i]==k) {
				System.out.println(i);
				check=true;
			}
		}
		
		if(!check)
			System.out.println(-1);
	}

}
