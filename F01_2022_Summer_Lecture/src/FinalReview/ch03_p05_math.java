package review;

import java.util.Scanner;

public class ch03_p05_math {
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		n -= cnt;
		
		while(n > 0) {
			cnt++;
			n -= cnt;
			if(n % cnt == 0) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch03_p05_math T = new ch03_p05_math();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
