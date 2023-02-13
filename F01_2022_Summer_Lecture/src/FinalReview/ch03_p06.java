package review;

import java.util.Scanner;

public class ch03_p06 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		int lt = 0;
		int rt = 0;
		while(rt < n-1) {
			rt++;
			if(arr[rt] == 0) {
				k--;
				if (k < 0) {
					while(k <= 0) {
						if(arr[lt++] == 0) {
							k++;
							break;
						}
					}
				}
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		answer = Math.max(answer, (rt-1)-lt+1);
		
		return answer;
	}

	public static void main(String[] args) {
		ch03_p06 T = new ch03_p06();
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
