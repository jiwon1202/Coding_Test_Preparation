package review;

import java.util.Arrays;
import java.util.Scanner;

public class ch06_p09 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		int lt = tmp[n-1];
		
		int rt = 0;
		for(int i=0; i<n; i++) {
			rt += arr[i];
		}
		
		while(rt >= lt) {
			int num = (lt + rt ) / 2;
			
			int sum = 0;
			int cnt = 1;
			for(int i=0; i<n; i++) {
				if(sum + arr[i] <= num) {
					sum += arr[i];
				}
				else {
					sum = arr[i];
					cnt++;
				}
			}
			
			if (cnt <= m) {
				answer = num;
				rt = num - 1;
			}
			else {
				lt = num + 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch06_p09 T = new ch06_p09();
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
