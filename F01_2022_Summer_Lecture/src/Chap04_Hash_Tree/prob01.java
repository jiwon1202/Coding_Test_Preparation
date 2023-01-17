package chap04;

import java.util.Scanner;
import java.util.HashMap;

public class prob01 {
	public char solution(int n, String s) {
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = 0;
		for(char x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			}
		}
	
		return answer;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
