package chap05;

import java.util.Stack;
import java.util.Scanner;

public class prob01 {
	public String solution(String s) { 
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(x == '(') {
				stack.push('(');
			}
			else if(stack.isEmpty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty())
			return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);

		String s = kb.nextLine();
		
		System.out.println(T.solution(s));
	}
}
