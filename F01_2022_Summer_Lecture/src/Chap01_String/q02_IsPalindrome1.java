package Chap01_String;

import java.util.*;

public class q02_IsPalindrome1 {
	public String solution(String s) {
		String answer = "NO";
		String tmp = new StringBuilder(s).reverse().toString();
		
		if (s.equalsIgnoreCase(tmp))
			answer = "YES";
		
		return answer;
	}
	public static void main(String[] args) {
		q02_IsPalindrome1 T = new q02_IsPalindrome1();
		System.out.println(T.solution("gooG"));
		System.out.println(T.solution("Moon"));
	}
}
