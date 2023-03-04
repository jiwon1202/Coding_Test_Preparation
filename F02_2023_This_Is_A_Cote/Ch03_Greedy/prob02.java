package Chap03_Greedy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class prob02 {
	static int n, m, k;
	
	public int solution(Integer[] arr) {
		int answer = 0;
		Arrays.sort(arr, Collections.reverseOrder()); 
		
		int n1 = m / k;
		int n2 = m - n1;
		
		answer = n1 * arr[1] + n2 * arr[0];
		
		return answer;
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();		
		m = kb.nextInt();
		k = kb.nextInt();
		
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(arr));
	}

}
