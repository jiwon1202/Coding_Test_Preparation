package chap05;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class prob06 {
	public int solution(int n, int k) {
		int answer = 0;
		int cnt = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			queue.offer(i+1);
			//queue.add(i+1);
		}
		
		/* 직접 짜본 코드
		while(n > 1) {
			cnt++;
			if(cnt != k) {
				queue.offer(queue.poll());
			}
			else {
				cnt = 0;
				n--;
			}
		}
		answer = queue.poll(); */
		
		
		//강사님 코드
		while(!queue.isEmpty()) {
			for(int i=1; i<k; i++) {
				queue.offer(queue.poll());
			}
			
			queue.poll();
			
			if(queue.size() == 1) {
				answer = queue.poll();
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
