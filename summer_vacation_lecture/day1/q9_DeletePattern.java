package hi;

import java.util.*;

public class q9 {
	public String solution(String cell){
		String answer = "";
		String tmp = cell.toUpperCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : tmp.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// 빈도수가 제일 높은 문자의 value값을 max로 정해준다.
		int max = 0;
		for(char key : map.keySet()) {
			if (map.get(key) > max)
				max = map.get(key);
		}
		
		// 그저 개수가 max인 문자들만 제거해주면 그것이 패턴을 제거한 문자열이 된다.
		for(int i=0; i<cell.length(); i++) {
			if(map.get(tmp.charAt(i)) < max) {
				answer += cell.charAt(i);
			}
		}
		
		return answer;
	}
	public static void main(String args[]) {
		q9 T = new q9();
		System.out.println(T.solution("abcabcdefabc"));
		System.out.println(T.solution("abxdeydeabz"));
		System.out.println(T.solution("abcabca"));
		System.out.println(T.solution("ABCabcA"));
	}
}
