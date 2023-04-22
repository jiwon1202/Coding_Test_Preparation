package Chap07_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class prob04 {
	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		Arrays.sort(arr);
		int s = 0;
		int e = arr[n-1];
		
		while(s <= e) {
			int length = (s + e) / 2;
			int sum = 0;
			
			for(int x : arr) {
				if(x > length)
					sum += (x % length);
			}
			
			if(sum < m) e = length - 1;
			else {
				s = length + 1;
				answer = length;
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
