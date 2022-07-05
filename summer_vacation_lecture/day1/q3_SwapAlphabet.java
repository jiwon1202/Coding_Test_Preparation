package hi;

import java.util.*;

public class q3 {
	public String solution(String s) {
		String answer;
		char[] str = s.toCharArray();	// mutable한 char배열로 변경
		
		int right = s.length() - 1;
		int left = 0;
			
		while(left < right) {
			if (!Character.isAlphabetic(str[left]))	// 왼쪽 포인터가 가르키는 문자가 알파벳이 아니라면 left++
				left++;
			else if (!Character.isAlphabetic(str[right]))	// 오른쪽 포인터 가르키는 문자가 알파벳이 아니라면 right--;
				right--;
			else {	// 모두 알파벳이라면 두 문자의 자리를 swap 시킨다.
				char tmp = str[left];
				str[left] = str[right];
				str[right] = tmp;
				left++;
				right--;
			}
		}
		answer = String.valueOf(str);	// char배열을 String 형으로 변경
		return answer;
	}
	public static void main(String[] args) {
		q3 T = new q3();
		System.out.println(T.solution("a#b!GE*T@S"));
		System.out.println(T.solution("###ab*@@Sty"));
	}
}
