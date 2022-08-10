package Chap01_String;

import java.util.*;

public class q07_SameFrequency {
	public ArrayList<Integer> solution(String s){
		// ArrayList 객체 선언
		// 크기 조정이 가능한 배열로, 여러 데이터 유형 저장 가능
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if (map.get(key) > max)
				max = map.get(key);
		}
		
		// 현재 max값엔 가장 빈도수가 높은 문자의 개수가 저장되어 있다.
		// max - (a, b, c 각각의 value) 값이 answer에 순서대로 저장됨
		String tmp = "abc";
		for(char x : tmp.toCharArray()){
			answer.add(max - map.getOrDefault(x, 0));
		}		
		
		return answer;
	}
	public static void main(String[] args) {
		q07_SameFrequency T = new q07_SameFrequency();
		System.out.println(T.solution("aaabc"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("abc"));
	}
}