package hi;

import java.util.*;

public class q5 {
	public char solution(String s) {
		char answer = ' ';
		
		// !! HashMap �߿�! !!
		HashMap<Character, Integer> map = new HashMap<>();
		
		// toCharArray() -> s�� ���� �ϳ��ϳ��� �̾Ƴ�
		for(char x : s.toCharArray()) {
			// getOrDefault -> Ű�� x�� value�� �����ͼ� +1 �� ������ value ��ü
			// 				   but Ű���� ���ٸ� value�� 0���� �����Ͽ� ����
			map.put(x,  map.getOrDefault(x, 0) + 1);
		}
		
		// max ���� ���� ���� ���������� �ʱ�ȭ -> �ſ� �������̹Ƿ�!
		int max = Integer.MIN_VALUE;
		// keySet -> map�� �����ϴ� key�� �ϳ��ϳ� �̾Ƴ��� max�� Ž��
		for(char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		q5 T = new q5();
		System.out.println(T.solution("BACBACCACCBDEDE"));
		System.out.println(T.solution("AAAAABBCCDDDD"));
	}
}
