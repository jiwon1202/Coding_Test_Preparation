package chap04;

import java.util.Scanner;
import java.util.HashMap;

public class prob02 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char x : s2.toCharArray()) {
			if(!map1.containsKey(x) || map1.get(x) == 0)
				return "NO";
			map1.put(x, map1.get(x) - 1);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);

		String s1 = kb.nextLine();
		String s2 = kb.nextLine();
		
		System.out.println(T.solution(s1, s2));
	}

}
