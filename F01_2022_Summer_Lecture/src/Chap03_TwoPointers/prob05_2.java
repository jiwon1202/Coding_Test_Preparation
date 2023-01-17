package chap03;

import java.util.Scanner;

// 연속된 자연수의 합 - 2
public class prob05_2 {
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		n--;
		
		while(n > 0) {
			cnt++;
			n = n-cnt;
			if (n % cnt == 0) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob05_2 T = new prob05_2();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
