package chap05;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class prob07 {
	public String solution(String order, String str) {
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		for(char x : order.toCharArray()) {
			Q.offer(x);
		}
		
		/* 본인 코드 
		for(char x : str.toCharArray()) {
			if(!Q.isEmpty() && x == Q.peek()) {
				Q.poll();
			}
		} */
		
		// 강사님 코드
		for(char x : str.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll())
					return "NO";
			}
		}
		
		if(!Q.isEmpty())
			return "NO";
			
		return answer;
	}
	
	public static void main(String[] args) {
		prob07 T = new prob07();
		Scanner kb = new Scanner(System.in);

		String order = kb.nextLine();
		String str = kb.nextLine();
		
		System.out.println(T.solution(order, str));
	}
}
