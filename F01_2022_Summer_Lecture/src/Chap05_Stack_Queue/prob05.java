package chap05;

import java.util.Scanner;
import java.util.Stack;

public class prob05 {
	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		char history = ' ';
		for(char x : s.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}
			else {
				stack.pop();
				if(history  == '(') {
					answer += stack.size();
				}
				else {
					answer += 1;
				}
			}
			history = x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);

		System.out.println(T.solution(kb.nextLine()));
	}
}
