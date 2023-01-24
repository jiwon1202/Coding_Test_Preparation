package chap04;

import java.util.*;

public class prob04 {
	public int solution(String s, String t) {
		int answer = 0;
		int len = t.length() - 1;
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char x : s.substring(0, len).toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0) + 1);
		}
		
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char x : t.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}
		
		int lt = 0;
		for(int rt=len; rt<s.length(); rt++) {
			char key = s.charAt(rt);
			map1.put(key, map1.getOrDefault(key, 0) + 1);
			
			if (map1.equals(map2)) {
				answer++;
			}
			
			key = s.charAt(lt);
			if (map1.get(key) > 1) {
				map1.put(key, map1.get(key)-1);
			}
			else {
				map1.remove(key);
			}
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();
		String t = kb.nextLine();
		
		System.out.println(T.solution(s, t));
	}

}
