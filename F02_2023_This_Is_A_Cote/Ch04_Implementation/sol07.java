package Chap04_Implementation;

import java.util.Scanner;

public class sol07 {
	public String solution(String s) {
		int answer = 0;
		int len = s.length();
		int index = 0;
		
		for(; index<len/2; index++)
			answer += s.charAt(index);
		
		for(; index<len; index++)
			answer -= s.charAt(index);
		
		if(answer == 0)
			return "LUCKY";
		
		return "READY";
	}

	public static void main(String[] args) {
		sol07 T = new sol07();
		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}

}