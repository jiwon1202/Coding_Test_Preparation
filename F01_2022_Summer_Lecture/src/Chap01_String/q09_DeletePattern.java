package Chap01_String;

import java.util.*;

// 말버릇 패턴을 삭제하는 문제는 상당히 까다로울 줄 알았다.
// 하지만 그저 빈도수가 제일 높은 문자들을 지운 문자열이 정답이었다.
// 한 개의 문자도 하나의 패턴으로 취급되므로, 패턴의 길이나 종류는 신경쓰지 않아도 된다. 
public class q09_DeletePattern {
	public String solution(String cell){
		String answer = "";
		String tmp = cell.toUpperCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : tmp.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = 0;
		for(char key : map.keySet()) {
			if (map.get(key) > max)
				max = map.get(key);
		}

		for(int i=0; i < cell.length(); i++) {
			if(map.get(tmp.charAt(i)) < max) {
				answer += cell.charAt(i);
			}
		}
		
		return answer;
	}
	public static void main(String args[]) {
		q09_DeletePattern T = new q09_DeletePattern();
		System.out.println(T.solution("abcabcdefabc"));
		System.out.println(T.solution("abxdeydeabz"));
		System.out.println(T.solution("abcabca"));
		System.out.println(T.solution("ABCabcA"));
		System.out.println(T.solution("abdeabedc"));
	}
}
