package hi;

import java.util.HashMap;

public class q6 {
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
		
		/* ���ڵ� - �ؽ��ʿ� ���� ������� ����Ǳ� ������ ������ �� ���� ���ڸ� ã���� �ٷ� �ε��� ���� �� break
		int answer = -1;
		for(char key : map.keySet()) {
			if (map.get(key) == 1) {
				answer = s.indexOf(key) + 1;
				break;
			}
		}
		return answer;
		*/
	}
	public static void main(String[] args) {
		q6 T = new q6();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("remember"));
	}
}
