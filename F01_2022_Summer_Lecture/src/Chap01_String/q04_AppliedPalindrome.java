package Chap01_String;

import java.util.*;

public class q04_AppliedPalindrome {
	// 주어진 문자열이 회문인지 판별하는 함수
	public Boolean isPalindrome(String s) {
		s = s.toUpperCase();
		
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	public String solution(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				// substring(s,e): s ~ e-1 인덱스 까지의 문자열을 추출하는 함수
				// s1: 현재 오른쪽 포인터가 가리키는 문자 제거
				// s2: 현재 왼쪽 포인터가 가리키는 문자 제거
				String s1 = s.substring(left, right);
				String s2 = s.substring(left + 1, right + 1);
				
				// 자른 문자열 두 개 중에 하나라도 회문이면 참 / 그렇지 않다면 거짓
				if (!isPalindrome(s1) && !isPalindrome(s2))
					return "NO";
				else
					break;
			}
			else {
				left++;
				right--;
			}
		}
		// 원본 문자열 그대로 회문인 경우 이 줄까지 내려옴
		return "YES";
	}
	public static void main(String[] args) {
		q04_AppliedPalindrome T = new q04_AppliedPalindrome();
		System.out.println(T.solution("abcddcba"));
		System.out.println(T.solution("abcabbakcba"));
		System.out.println(T.solution("abcacbakcba"));
	}
}