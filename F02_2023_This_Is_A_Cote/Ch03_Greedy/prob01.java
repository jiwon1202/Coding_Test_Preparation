package Chap03_Greedy;

import java.util.Scanner;

public class prob01 {
	int[] arr = {500, 100, 50, 10};
	
	public int solution(int n) {
		int answer = 0;
		
		for(int coin : arr) {
			answer += n / coin;
			n %= coin;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		System.out.println(T.solution(n));
	}

}
