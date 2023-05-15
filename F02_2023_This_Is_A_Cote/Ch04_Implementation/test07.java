package Chap04_Implementation;

import java.util.Scanner;

public class test07 {
	public String solution(int n) {
		int tmp = n;
		int cnt = 0;
		while(tmp > 0) { 
			tmp /= 10;
			cnt++;
		}
		
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<cnt/2; i++) {
			sum1 += n % 10;
			n /= 10;
		}
		for(int i=0; i<cnt/2; i++) {
			sum2 += n % 10;
			n /= 10;
		}
		
		if(sum1 == sum2)
			return "LUCKY";
		
		return "READY";
	}

	public static void main(String[] args) {
		test07 T = new test07();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
