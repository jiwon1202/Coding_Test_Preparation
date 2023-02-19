package review;

import java.util.Arrays;
import java.util.Scanner;

public class ch06_p10 {
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		
		for(int i=1; i<arr.length; i++ ) {
			if(arr[i] - ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		
		return cnt;
	}
	public int solution(int n, int c, int[] xl) {
		int answer = 0;
		
		Arrays.sort(xl);
		int rt = xl[n-1];
		int lt = 1;
		
		while(rt >= lt) {
			int mid = (rt + lt) / 2;
			
			if(count(xl, mid) < c) {
				rt = mid-1;
			}
			else {
				answer = mid;
				lt = mid + 1;
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch06_p10 T = new ch06_p10();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] xl = new int[n];
		for(int i=0; i<n; i++) {
			xl[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, c, xl));
	}

}
