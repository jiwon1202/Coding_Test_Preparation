package chap09;

import java.util.*;

public class prob06 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] ch;
	
	public String solution(int a, int b) {
		String answer = "NO";
		
		Queue<Integer> Q = new LinkedList<>();
		for(int x : arr.get(a)) {
			Q.offer(x);
		}
		
		while(!Q.isEmpty()) {
			int temp = Q.poll();
			for(int x : arr.get(temp)) {
				if(x == b) {
					return "YES";
				}
				else if(ch[x] == 0) {
					Q.offer(x);
					ch[x] = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n+1];
		
		arr = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr.get(a).add(b);
			arr.get(b).add(a);
		}
		
		System.out.println(T.solution(kb.nextInt(), kb.nextInt()));
	}

}
