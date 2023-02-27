package review;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ch09_p06 {
	static int[] unf;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] ch;
	
	public String solution(int a, int b) {
		String answer = "NO";
		
		Queue<Integer> Q = new LinkedList<>();
		for(int x : arr.get(a)) {
			Q.offer(x);
		}
		
		while(!Q.isEmpty()) {
			int tmp = Q.poll();
			for(int x : arr.get(tmp)) {
				if(x == b) {
					return "YES";
				}
				else if(ch[x] == 0) {
					ch[x] = 1;
					Q.offer(x);
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch09_p06 T = new ch09_p06();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ch = new int[n+1];
		arr = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		int m = kb.nextInt();
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr.get(a).add(b);
			arr.get(b).add(a);
		}
		
		System.out.println(T.solution(kb.nextInt(), kb.nextInt()));
	}

}
