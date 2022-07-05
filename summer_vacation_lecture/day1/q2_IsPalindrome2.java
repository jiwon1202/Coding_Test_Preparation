package hi;

import java.util.*;

public class q2_1 {
	public String solution(String s) {
		String answer = "YES";
		s = s.toUpperCase();
		int right = s.length()-1;
		int left = 0;
			
		while(left < right) {
			if (s.charAt(left) != s.charAt(right))
				return "NO";
			else {
				left++;
				right--;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q2_1 T = new q2_1();
		System.out.println(T.solution("gooG"));
		System.out.println(T.solution("Moon"));
	}
}
