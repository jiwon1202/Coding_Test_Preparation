package Chap01_String;

import java.util.HashMap;

public class q06_WrittenOnce {
	public int solution(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x,  map.getOrDefault(x, 0) + 1);
		}
		
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i)) == 1)
				return i + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		q06_WrittenOnce T = new q06_WrittenOnce();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("remember"));
	}
}
