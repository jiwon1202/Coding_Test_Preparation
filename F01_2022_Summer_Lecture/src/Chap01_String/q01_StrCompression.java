package Chap01_String;

import java.util.*;

public class q01_StrCompression {
	public String solution(String s) {
		String answer = "";
		s = s + " ";	// 공백을 하나 추가해줘야 IndexError를 방지할 수 있음
		
		int cnt = 1;
		for (int i=0; i < s.length() - 1; i++) {
			// 만약 현재 단어와 그 다음의 단어가 같다면 cnt++
			if (s.charAt(i) == s.charAt(i+1))
				cnt++;
			
			// 그렇지 않다면 카운팅을 초기화하고 answer 값 수정
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