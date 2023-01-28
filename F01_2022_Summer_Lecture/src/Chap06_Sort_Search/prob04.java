package chap06;

import java.util.Scanner;

public class prob04 {
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		
		for(int x : arr) {
			int i;
			
			for(i=0; i<s; i++) {
				if(x == answer[i]) {
					break;
				}
			}
			
			if(i == s) {
				i = s-1;
			}
			
			for(int j=i; j>0; j--) {
				answer[j] = answer[j-1];
			}

			answer[0] = x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);

		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}

}
