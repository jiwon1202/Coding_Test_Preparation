package chap05;

import java.util.Scanner;
import java.util.Stack;

public class prob04 {
	public int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		int tmp1, tmp2;
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) {
				stack.push(x - 48);
			}
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				int result = 0;
				
				if(x=='+') {
					result = lt + rt;
				}
				else if(x=='-') {
					result = lt - rt;
				}
				else if(x=='*') {
					result = lt * rt;
				}
				else if(x=='/') {
					result = lt / rt;
				}
				
				stack.push(result);
			}
		}
		
		answer = stack.pop();
		return answer;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.nextLine();
		
		System.out.println(T.solution(s));
	}
}
