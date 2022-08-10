package Chap01_String;

import java.util.*;

public class q08_MakePalindrome {
	public int solution(String s){
		int answer = s.length();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// 홀수개의 문자의 개수를 카운팅
		int cnt = 0;
		for(char key : map.keySet()) {
			if (map.get(key) % 2 == 1)
				cnt++;
		}
		
		// 모든 문자가 짝수개 이거나(1), 하나의 문자만 홀수개(2)여도 회문을 만들 수 있다.
		// (1) cnt == 0 이면, answer 반환
		// (2) answer에서 cnt를 빼준 후 다시 1을 더하여 반환
		return cnt > 0 ? answer-(cnt-1) : answer;
	}
	public static void main(String[] args) {
		q08_MakePalindrome T = new q08_MakePalindrome();
		System.out.println(T.solution("abcbbbccaa"));
		System.out.println(T.solution("abcde"));
		System.out.println(T.solution("ccc"));
	}
}
