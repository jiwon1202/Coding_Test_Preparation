package hi;

import java.util.*;

public class q7 {
	public ArrayList<Integer> solution(String s){
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
		
		// 특정 문자가 존재하지 않는 입력을 대비하여 tmp 선언
		String tmp = "abc";
		// keySet을 쓰면 존재하지 않는 문자는 계산을 하지 못함 -> toCharArray 함수 사용
		for(char x : tmp.toCharArray()){
			// 꼭 getOrDefault 함수를 사용하도록 하자
			answer.add(max - map.getOrDefault(x, 0));
		}		
		
		return answer;
	}
	public static void main(String[] args) {
		q7 T = new q7();
		System.out.println(T.solution("aaabc"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("abc"));
	}
}