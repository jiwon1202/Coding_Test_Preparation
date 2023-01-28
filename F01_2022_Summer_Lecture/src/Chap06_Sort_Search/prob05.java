package chap06;

import java.util.Scanner;
import java.util.Arrays;

public class prob05 {
	public char solution(int n, int[] arr) {
		char answer = 'U';
		
		/* 직접 푼 코드
		int[] ch = new int[10000000+1];
		for(int x : arr) {
			if(ch[x] == 0) {
				ch[x] = 1;
			}
			else {
				return 'D';
			}
		} */
		
		// 강사님 코드 - 정렬 후 풀이
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			if(arr[i+1] == arr[i])
				return 'D';
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}

}
