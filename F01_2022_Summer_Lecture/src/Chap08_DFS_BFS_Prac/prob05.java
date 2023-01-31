package chap08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class prob05 {
	static int n, m, answer=Integer.MAX_VALUE;
	static Integer[] arr;
	
	
	public void DFS(int L, int sum) {
		if (L >= answer || sum > m) {
			return;
		}
		else if (sum == m) {
			answer = Math.min(answer, L);
		}
		else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		// 정렬 가장 중요!!
		Arrays.sort(arr, Collections.reverseOrder());
		m = kb.nextInt();
		
		
		T.DFS(0, 0);
		System.out.println(answer);
	}

}
