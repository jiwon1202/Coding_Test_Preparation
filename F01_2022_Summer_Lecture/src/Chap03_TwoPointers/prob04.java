package chap03;

import java.util.Scanner;

public class prob04 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		/* 직접 풀어본 코드
		int sum = 0;
		int p1 = 0, p2 = 0;
		while(p2 < n) {
			if(sum == m) {
				answer++;
				sum += arr[p2++];
			}
			else if(sum > m) {
				sum -= arr[p1++];
			}
			else {
				sum += arr[p2++];
			}
		} 
	
		while(p1 < n) {
			if(sum == m) {
				answer++;
				sum += arr[p1++];
			}
			else if (sum > m) {
				sum -= arr[p1++];
			}
			else {
				break;
			}
		} */
		
		// 강사님 코드
		int sum = 0, lt = 0;
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) {
				answer++;
			}
			while(sum > m) {
				sum -= arr[lt++];
				if(sum == m) {
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, m, arr));
	}
}
