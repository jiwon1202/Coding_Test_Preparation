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
		
		// �󵵼��� ���� ���� ������ value���� max�� �����ش�.
		int max = 0;
		for(char key : map.keySet()) {
			if (map.get(key) > max)
				max = map.get(key);
		}
		
		// ���� ������ max�� ���ڵ鸸 �������ָ� �װ��� ������ ������ ���ڿ��� �ȴ�.
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
