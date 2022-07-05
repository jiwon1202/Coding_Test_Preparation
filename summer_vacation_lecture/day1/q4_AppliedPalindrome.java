package hi;

import java.util.*;

public class q4 {
	public Boolean isPalindrome(String s) {	// 회문 판별 함수
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
			// 원본 문자열 그 자체가 회문인 경우 if문 진입 X
			if (s.charAt(left) != s.charAt(right)) {
				// 회문이 아닌 경우 양 끝 문자를 하나씩 뺀 문자열 생성 후 회문인지 판별
				String s1 = s.substring(left, right);
				String s2 = s.substring(left + 1, right + 1);
				
				// 자른 문자열 조차 회문이 아니라면 return "NO"
				if (!isPalindrome(s1) && !isPalindrome(s2))
					return "NO";
				else
					break;	// !! 불필요한 반복을 줄이기 위하여 추가 -> 없어도 결과는 잘 나옴 !!
			}
			else {
				left++;
				right--;
			}
		}
		return "YES";	// !! answer 없애고 "YES" 인 것이 더 좋을까? -> 상관 없다. !!
	}
	public static void main(String[] args) {
		q4 T = new q4();
		System.out.println(T.solution("abcddcba"));
		System.out.println(T.solution("abcabbakcba"));
		System.out.println(T.solution("abcacbakcba"));
	}
}