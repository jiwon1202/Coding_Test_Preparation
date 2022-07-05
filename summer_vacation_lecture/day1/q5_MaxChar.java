package hi;

import java.util.*;

public class q5 {
	public char solution(String s) {
		char answer = ' ';
		
		// !! HashMap 중요! !!
		HashMap<Character, Integer> map = new HashMap<>();
		
		// toCharArray() -> s의 문자 하나하나를 뽑아냄
		for(char x : s.toCharArray()) {
			// getOrDefault -> 키가 x인 value를 가져와서 +1 한 값으로 value 대체
			// 				   but 키값이 없다면 value를 0으로 설정하여 삽입
			map.put(x,  map.getOrDefault(x, 0) + 1);
		}
		
		// max 값을 가장 작은 정수값으로 초기화 -> 매우 안정적이므로!
		int max = Integer.MIN_VALUE;
		// keySet -> map에 존재하는 key들 하나하나 뽑아내서 max값 탐색
		for(char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		q5 T = new q5();
		System.out.println(T.solution("BACBACCACCBDEDE"));
		System.out.println(T.solution("AAAAABBCCDDDD"));
	}
}
