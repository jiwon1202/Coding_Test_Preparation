package Chap06_Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class prob06 {
	public int solution(int n, int k, Integer[] a, Integer[] b) {
		int answer = 0 ;
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			if(a[i] > b[i] || k == 0) {
				break;
			}
			a[i] = b[i];
			k--;
		}
		
		for(int x : a)	answer += x;
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		Integer[] a = new Integer[n];
		for(int i=0; i<n; i++) a[i] = kb.nextInt();
		
		Integer[] b = new Integer[n];
		for(int i=0; i<n; i++) b[i] = kb.nextInt();

		System.out.println(T.solution(n, k, a, b));
	}

}
