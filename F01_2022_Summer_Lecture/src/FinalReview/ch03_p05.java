package review;

import java.util.Scanner;

public class ch03_p05 {
	public int solution(int n) {
		int answer = 0;
		
		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = i;
		}
		
		int lt = 0;
		int rt = 0;
		int sum = 0;
		for(int i=0; i<=n/2+1; i++) {
			sum += arr[rt++];
			if(sum == n) {
				answer++;
			}
			else if(sum > n) {
				while(sum >= n) {
					sum -= arr[lt++];
					if(sum == n) {
						answer++;
						break;
					}
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch03_p05 T = new ch03_p05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
