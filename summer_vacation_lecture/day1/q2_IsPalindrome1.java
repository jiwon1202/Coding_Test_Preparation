package hi;

import java.util.*;

public class q2 {
	public String solution(String s) {
		String answer = "NO";
		String tmp = new StringBuilder(s).reverse().toString();	// ���ڿ��� ������
		
		if (s.equalsIgnoreCase(tmp))	// ��ҹ��� ������� ���Ͽ� ������ ���ڿ��̶�� "YES"
			answer = "YES";
		
		return answer;
	}
	public static void main(String[] args) {
		q2 T = new q2();
		System.out.println(T.solution("gooG"));
		System.out.println(T.solution("Moon"));
	}
}
