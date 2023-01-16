package chap03;

import java.util.Scanner;
import java.util.ArrayList;

public class prob01 {
	public ArrayList<Integer> solution(int n, int[] a1, int m, int[] a2) {
		int total = n+m;
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		
		/* 직접 풀어본 코드
		for(int i =0; i<total; i++) {
			if (p1 == n) {
				answer.add(a2[p2++]);
			}
			else if (p2 == m) {
				answer.add(a1[p1++]);
			}
			else if(a1[p1] < a2[p2]) {
				answer.add(a1[p1++]);
			}
			else {
				answer.add(a2[p2++]);
			}
		} */
		
		// 강사님 코드
		while(p1 < n && p2 < m) {
			if(a1[p1] < a2[p2]) {
				answer.add(a1[p1++]);
			}
			else {
				answer.add(a2[p2++]);
			}
		}
		
		while(p1 < n)
			answer.add(a1[p1++]);
		
		while(p2 < m) 
			answer.add(a2[p2++]);
		
		return answer;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] a1 = new int[n];
		for(int i=0; i<n; i++) {
			a1[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] a2 = new int[m];
		for(int i=0; i<m; i++) {
			a2[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, a1, m, a2)) {
			System.out.print(x + " ");
		}
	}

}
