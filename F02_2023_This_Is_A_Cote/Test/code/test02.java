package Chap03_Greedy;

import java.util.Scanner;

public class test02 {
	public int solution(String s) {
		int answer = s.charAt(0) - 48;

		for(int i=1; i<s.length(); i++) {
			int num = s.charAt(i) - 48;
			if(answer!=0 && num != 0)
				answer *= num;
			else
				answer += num;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test02 T = new test02();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}

}
