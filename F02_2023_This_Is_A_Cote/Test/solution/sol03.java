package Chap03_Greedy;

import java.util.Scanner;

public class sol03 {
	public int solution(char[] chars){
		int answer0 = 0, answer1 = 0;

		// 모두 0으로 바꾼다는 전제
		if(chars[0] == '1')
			answer0++;
		else
			answer1++;
		
		for(int i=0; i<chars.length-1; i++) {
			if (chars[i] != chars[i+1]) {
				if (chars[i+1] == '1') {
					answer0++;
				}
				else {
					answer1++;
				}
			}
		}
			
		
		return Math.min(answer0, answer1);
	}

	public static void main(String[] args) {
		sol03 T = new sol03();
		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();
		System.out.println(T.solution(s.toCharArray()));
	}

}