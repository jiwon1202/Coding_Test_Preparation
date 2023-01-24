package chap05;

import java.util.Scanner;
import java.util.Stack;

public class prob02 {
	public String solution(String s) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		/* 직접 짜본 코드
		for(char x : s.toCharArray()) {
			if(x == '(') {
				stack.push('(');
			}
			else if(x == ')') {
				stack.pop();
			}
			else if(stack.isEmpty()) {
				answer += x;
			}
		} */
		
		// 강사님 코드
		for (char x : s.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}
			else
				stack.push(x);
		}
		
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		String s = kb.nextLine();

		System.out.println(T.solution(s));
	}
}
