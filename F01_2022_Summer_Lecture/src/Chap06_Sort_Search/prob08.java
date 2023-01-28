package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class prob08 {
	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		
		Arrays.sort(arr);
		
		int eIdx = n-1;
		int sIdx = 0;
		while(true) {
			int center = (sIdx + eIdx) / 2;
			
			if(arr[center] == m) {
				answer = center+1;
				break;
			}
			else if(arr[center] > m) {
				eIdx = center - 1;
			}
			else {
				sIdx = center + 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob08 T = new prob08();
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
