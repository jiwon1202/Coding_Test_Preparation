package Chap01_String;

import java.util.*;

public class q05_MaxChar {
	public char solution(String s) {
		char answer = ' ';
		
		// HashMap 객체 선언
		// Map의 일종으로, key와 value의 쌍으로 이루어진 데이터를 보관하는데 사용됨
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			// getOrDefault(): 주어진 key가 존재한다면 value를 가져옴 (get)
			//							  존재하지 않는다면 매개변수 값 반환 (default)
			// put(): key와 value쌍으로 값을 저장
			map.put(x,  map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;

		// keySet(): 주어진 HashMap 객체의 key 값들만 꺼내옴
		// get(): 해당 key값의 value를 반환
		for(char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		q05_MaxChar T = new q05_MaxChar();
		System.out.println(T.solution("BACBACCACCBDEDE"));
		System.out.println(T.solution("AAAAABBCCDDDD"));
	}
}
