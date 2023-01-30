package chap08;

import java.util.Scanner;

class Set {
	int time, grade;
	public Set(int grade, int time) {
		this.grade = grade;	
		this.time = time;
	}
}

public class prob03 {
	static Set[] set;
	static int n, m, max=Integer.MIN_VALUE;
	
	public void DFS(int L, int grade, int time) {
		if(time > m) {
			return;
		}
		
		if(L == n) {
			max = Math.max(max, grade);
		}
		else {
			DFS(L+1, grade, time);
			DFS(L+1, grade+set[L].grade, time+set[L].time);
		}
	}
			
	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		set = new Set[n];
		for(int i=0; i<n; i++) {
			set[i] = new Set(kb.nextInt(), kb.nextInt());
		}

		T.DFS(0, 0, 0);
		System.out.println(max);
	}

}
