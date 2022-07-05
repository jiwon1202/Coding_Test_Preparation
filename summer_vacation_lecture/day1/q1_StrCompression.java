package hi;

import java.util.*;

public class q1 {
	public String solution(String s) {
		String answer = "";
		s = s + " ";	// 공백을 하나 추가해줘야 IndexError를 방지할 수 있음
		
		int cnt = 1;
		for (int i=0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i+1))	// 문자가 반복되면 cnt++
				cnt++;
			else {	// 문자 반복이 끝났다면 answer 수정 후 cnt 초기화
				answer += s.charAt(i);
				if (cnt > 1)
					answer += cnt;
				cnt = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		q1 T = new q1();
		System.out.println(T.solution("AAABCCCDD"));
		System.out.println(T.solution("KKHSSSSSSSE"));
	}
}