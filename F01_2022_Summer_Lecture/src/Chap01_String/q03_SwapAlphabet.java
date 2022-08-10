package Chap01_String;

import java.util.*;

public class q03_SwapAlphabet {
	public String solution(String s) {
		String answer;
		// String은 immutable, char 배열은 mutable
		// 따라서 toCharArray() 함수를 사용하여 mutable 한 객체로 변경해준다.
		char[] str = s.toCharArray();
		
		int right = s.length() - 1;
		int left = 0;
			
		while(left < right) {
			// 양쪽 문자가 하나라도 알파벳이 아니라면 포인터 이동
			if (!Character.isAlphabetic(str[left]))
				left++;
			else if (!Character.isAlphabetic(str[right]))
				right--;
			// 두 문자가 알파벳이라면 위치를 변경
			else {
				char tmp = str[left];
				str[left] = str[right];
				str[right] = tmp;
				left++;
				right--;
			}
		}
		
		// char 배열을 다시 String 형으로 반환하기 위해 valueOf 함수 사용
		answer = String.valueOf(str);
		return answer;
	}
	public static void main(String[] args) {
		q03_SwapAlphabet T = new q03_SwapAlphabet();
		System.out.println(T.solution("a#b!GE*T@S"));
		System.out.println(T.solution("###ab*@@Sty"));
	}
}
