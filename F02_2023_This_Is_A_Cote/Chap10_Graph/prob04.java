package Chap10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class prob04 {
	public int[] topology_sort(int v, int[] indegree, ArrayList<ArrayList<Integer>> arr) {
		int[] answer = new int[v];
		int idx = 0;
		
		Queue<Integer> q = new LinkedList<>();
		for (int i=1; i<=v; i++) {
			if (indegree[i] == 0)
				q.offer(i);
		}
		
		while(!q.isEmpty()) {
			int now = q.poll();
			answer[idx++] = now;
			
			for (int x : arr.get(now)) {
				indegree[x] -= 1;
				if (indegree[x] == 0)
					q.offer(x);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		int v = kb.nextInt();
		int e = kb.nextInt();
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for(int i=0; i<=v; i++)	arr.add(new ArrayList<>());
		
		int[] indegree = new int[v+1];
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			indegree[b] += 1;
			arr.get(a).add(b);
		}
		
		for(int x : T.topology_sort(v, indegree, arr))
			System.out.print(x + " ");
		
	}

}
