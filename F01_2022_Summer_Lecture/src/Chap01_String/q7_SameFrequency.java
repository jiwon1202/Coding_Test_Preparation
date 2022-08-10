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
		
		// Ư�� ���ڰ� �������� �ʴ� �Է��� ����Ͽ� tmp ����
		String tmp = "abc";
		// keySet�� ���� �������� �ʴ� ���ڴ� ����� ���� ���� -> toCharArray �Լ� ���
		for(char x : tmp.toCharArray()){
			// �� getOrDefault �Լ��� ����ϵ��� ����
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