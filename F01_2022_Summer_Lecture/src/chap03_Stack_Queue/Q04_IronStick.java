package chap03_Stack_Queue;

import java.util.Stack;

public class Q04_IronStick {
	public int solution(String s) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			}
			else {
				stack.pop();
				if(s.charAt(i-1) == '(')
					answer += stack.size();
				else
					answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Q04_IronStick T = new Q04_IronStick();
		System.out.println(T.solution("()(((()())(())()))(())"));
		System.out.println(T.solution("(((()(()()))(())()))(()())"));
	}
}
