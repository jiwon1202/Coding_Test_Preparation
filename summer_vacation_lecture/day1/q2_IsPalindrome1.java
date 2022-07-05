package hi;

import java.util.*;

public class q2 {
	public String solution(String s) {
		String answer = "NO";
		String tmp = new StringBuilder(s).reverse().toString();	// 문자열을 뒤집음
		
		if (s.equalsIgnoreCase(tmp))	// 대소문자 상관없이 비교하여 동일한 문자열이라면 "YES"
			answer = "YES";
		
		return answer;
	}
	public static void main(String[] args) {
		q2 T = new q2();
		System.out.println(T.solution("gooG"));
		System.out.println(T.solution("Moon"));
	}
}
