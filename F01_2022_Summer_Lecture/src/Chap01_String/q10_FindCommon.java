package Chap01_String;

import java.util.*;

public class q10_FindCommon {
	public ArrayList<Character> solution(String[] words) {
		ArrayList<Character> answer = new ArrayList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		// 배열의 첫번째 원소를 기준으로 map 초기화
		for(char x : words[0].toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// 두번째 원소부터 탐색해야 하므로 i=1로 초기화하여 반복문 실행
		for(int i=1; i<words.length; i++) {
			HashMap<Character, Integer> tmp = new HashMap<>();
			
			for(char x : words[i].toCharArray()) {
				// 만약 해당 원소가 현재 map에 속해있는 문자라면 if문 실행
				if(map.getOrDefault(x, 0) > 0) {
					// map에서 해당 key의 value -1
					// tmp에서 value +1
					map.put(x, map.get(x)-1);
					tmp.put(x, tmp.getOrDefault(x, 0) + 1);
				}
			}
			// map을 tmp 값으로 초기화 시켜서 다시 반복문을 실행
			// 이 과정을 통해 map에는 공통된 문자들과 개수가 매핑되어 저장됨
			map = new HashMap<Character, Integer>(tmp);
		}
		
		for(char key : map.keySet()) {
			for(int i=0; i<map.get(key); i++) {
				answer.add(key);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q10_FindCommon T = new q10_FindCommon();
		System.out.println(T.solution(new String[] {"steasue", "sasseysu", "kseseas"}));
		System.out.println(T.solution(new String[] {"longlong", "longtong", "longbig"}));
	}
}
