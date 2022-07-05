package hi;

import java.util.*;

public class q8 {
	public int solution(String s){
		int answer = s.length();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// 카운트 값이 홀수인 key가 1개 이하면 그냥 문자열 길이 그대로가 답이다.
		// 2개 이상이면 (홀수 개수 - 1) 빼줘야한다.
		int cnt = 0;
		for(char key : map.keySet()) {
			if (map.get(key) % 2 == 1)
				cnt++;
		}
		
		return cnt > 0 ? answer-(cnt-1) : answer;
	}
	public static void main(String[] args) {
		q8 T = new q8();
		System.out.println(T.solution("abcbbbccaa"));
		System.out.println(T.solution("abcde"));
		System.out.println(T.solution("ccc"));
	}
}
