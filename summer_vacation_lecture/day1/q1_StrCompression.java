package hi;

import java.util.*;

public class q1 {
	public String solution(String s) {
		String answer = "";
		s = s + " ";	// ������ �ϳ� �߰������ IndexError�� ������ �� ����
		
		int cnt = 1;
		for (int i=0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i+1))	// ���ڰ� �ݺ��Ǹ� cnt++
				cnt++;
			else {	// ���� �ݺ��� �����ٸ� answer ���� �� cnt �ʱ�ȭ
				answer += s.charAt(i);
				if (cnt > 1)
					answer += cnt;
				cnt = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		q1 T = new q1();
		System.out.println(T.solution("AAABCCCDD"));
		System.out.println(T.solution("KKHSSSSSSSE"));
	}
}