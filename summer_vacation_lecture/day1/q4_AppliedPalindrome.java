package hi;

import java.util.*;

public class q4 {
	public Boolean isPalindrome(String s) {	// ȸ�� �Ǻ� �Լ�
		s = s.toUpperCase();
		
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	public String solution(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			// ���� ���ڿ� �� ��ü�� ȸ���� ��� if�� ���� X
			if (s.charAt(left) != s.charAt(right)) {
				// ȸ���� �ƴ� ��� �� �� ���ڸ� �ϳ��� �� ���ڿ� ���� �� ȸ������ �Ǻ�
				String s1 = s.substring(left, right);
				String s2 = s.substring(left + 1, right + 1);
				
				// �ڸ� ���ڿ� ���� ȸ���� �ƴ϶�� return "NO"
				if (!isPalindrome(s1) && !isPalindrome(s2))
					return "NO";
				else
					break;	// !! ���ʿ��� �ݺ��� ���̱� ���Ͽ� �߰� -> ��� ����� �� ���� !!
			}
			else {
				left++;
				right--;
			}
		}
		return "YES";	// !! answer ���ְ� "YES" �� ���� �� ������? -> ��� ����. !!
	}
	public static void main(String[] args) {
		q4 T = new q4();
		System.out.println(T.solution("abcddcba"));
		System.out.println(T.solution("abcabbakcba"));
		System.out.println(T.solution("abcacbakcba"));
	}
}