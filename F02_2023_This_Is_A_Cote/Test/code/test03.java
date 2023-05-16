package Chap03_Greedy;

import java.util.Scanner;

public class test03 {
	public int solution(char[] chars){
		int answer0 = 0, answer1 = 0;

		// 모두 0으로 바꾼다는 전제
		chars[0] = '0';
		for(int i=1; i<chars.length; i++) {
			if(chars[i] == '1' && chars[i-1] == '0')
				answer0++;
		}
		
		// 모두 1로 바꾼다는 전제
		chars[0] = '1';
		for(int i=1; i<chars.length; i++) {
			if(chars[i] == '0' && chars[i-1] == '1')
				answer1++;
		}
		
		return Math.min(answer0, answer1);
	}

	public static void main(String[] args) {
		test03 T = new test03();
		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();
		System.out.println(T.solution(s.toCharArray()));
	}

}
