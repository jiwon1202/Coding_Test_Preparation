package hi;

import java.util.*;

public class q3 {
	public String solution(String s) {
		String answer;
		char[] str = s.toCharArray();	// mutable�� char�迭�� ����
		
		int right = s.length() - 1;
		int left = 0;
			
		while(left < right) {
			if (!Character.isAlphabetic(str[left]))	// ���� �����Ͱ� ����Ű�� ���ڰ� ���ĺ��� �ƴ϶�� left++
				left++;
			else if (!Character.isAlphabetic(str[right]))	// ������ ������ ����Ű�� ���ڰ� ���ĺ��� �ƴ϶�� right--;
				right--;
			else {	// ��� ���ĺ��̶�� �� ������ �ڸ��� swap ��Ų��.
				char tmp = str[left];
				str[left] = str[right];
				str[right] = tmp;
				left++;
				right--;
			}
		}
		answer = String.valueOf(str);	// char�迭�� String ������ ����
		return answer;
	}
	public static void main(String[] args) {
		q3 T = new q3();
		System.out.println(T.solution("a#b!GE*T@S"));
		System.out.println(T.solution("###ab*@@Sty"));
	}
}
