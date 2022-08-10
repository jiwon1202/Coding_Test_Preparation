package Chap01_String;

import java.util.*;

public class q01_StrCompression {
	public String solution(String s) {
		String answer = "";
		s = s + " ";
		
		int cnt = 1;
		for (int i=0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i+1))
				cnt++;
			else {
				answer += s.charAt(i);
				if (cnt > 1)
					answer += cnt;
				cnt = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		q01_StrCompression T = new q01_StrCompression();
		System.out.println(T.solution("AAABCCCDD"));
		System.out.println(T.solution("KKHSSSSSSSE"));
	}
}