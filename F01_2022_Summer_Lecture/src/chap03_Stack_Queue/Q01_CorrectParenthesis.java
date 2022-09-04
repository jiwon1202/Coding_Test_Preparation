package chap03_Stack_Queue;
import java.util.Stack;

public class Q01_CorrectParenthesis {
	public String solution(String s) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for (char x : s.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			}
			else {
				if (stack.empty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		// 여는 괄호 개수가 닫는 괄호 개수보다 많은 경우를 위한 조건문
		if (!stack.empty()) {
			return "NO";
		}
		return answer;
	}
	public static void main(String[] args) {
		Q01_CorrectParenthesis T = new Q01_CorrectParenthesis();
		System.out.println(T.solution("(()(()))(()"));
		System.out.println(T.solution("(()()))"));
		System.out.println(T.solution("(()(()))(()"));
		System.out.println(T.solution("(()())(())"));
	}
}