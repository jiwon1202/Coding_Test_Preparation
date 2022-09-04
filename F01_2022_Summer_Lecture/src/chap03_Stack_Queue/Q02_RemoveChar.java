package chap03_Stack_Queue;

import java.util.Stack;

public class Q02_RemoveChar {
	public String solution(String s) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		
		for (char x : s.toCharArray()) {
			if (x=='(') {
				stack.push(x);
			}
			else if (x==')') {
				stack.pop();
			}
			else if (stack.isEmpty()) {
				answer += x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q02_RemoveChar T = new Q02_RemoveChar();
		System.out.println(T.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
	}
}
