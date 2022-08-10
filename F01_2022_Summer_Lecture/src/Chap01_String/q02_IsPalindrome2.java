package Chap01_String;

import java.util.*;

public class q02_IsPalindrome2 {
	public String solution(String s) {
		String answer = "YES";
		
		// 판별을 위해 모두 대문자로 바꿔줌
		s = s.toUpperCase();
		
		// 양 끝쪽 문자를 가리키는 포인터 두 개 선언 
		int right = s.length()-1;
		int left = 0;
		
		while(left < right) {
			// 두 포인터가 가리키는 값이 같지 않다면 함수 탈출
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
		q02_IsPalindrome2 T = new q02_IsPalindrome2();
		System.out.println(T.solution("gooG"));
		System.out.println(T.solution("Moon"));
	}
}
