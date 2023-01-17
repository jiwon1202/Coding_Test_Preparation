package chap03;

import java.util.*;

// 연속된 자연수의 합 - 1
public class prob05_1 {
	public int solution(int n) {
		int answer = 0;
		int index = n/2 + 1;
		
		int[] arr = new int[n-1];
		for(int i=0; i<index; i++) {
			arr[i] = i+1;
		}
		
		int sum = 0;
		int lt = 0;
		for(int rt=0; rt<index; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum > n) {
				sum -= arr[lt++];
				if(sum == n) {
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob05_1 T = new prob05_1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
