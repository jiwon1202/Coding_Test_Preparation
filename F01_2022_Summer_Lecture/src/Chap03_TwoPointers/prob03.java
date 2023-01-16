package chap03;

import java.util.Scanner;

public class prob03 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
			
		int sum = 0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for(int i=0; i<n-k; i++) {
			sum += arr[i+k] - arr[i];
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}
