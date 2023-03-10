package Chap03_Greedy;

import java.util.Scanner;

public class prob04 {
	public int solution(int n, int k) {
		int answer = 0;
		
		while(true) {
			int tmp = (int)(n / k) * k;
			answer += (n - tmp);
			n = tmp;
			
			if (n < k)
				break;
			
			answer++;
			n /= k;
		}
		
		return answer + n - 1;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		
		System.out.println(T.solution(n, k));
	}

}
