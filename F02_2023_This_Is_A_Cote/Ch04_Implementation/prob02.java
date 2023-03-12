package Chap04_Implementation;

import java.util.Scanner;

public class prob02 {
	public int solution(int n) {
		int answer = 0;
		
		/* 내 방법
		for(int h=0; h<=n; h++) {
			if(h % 10 == 3) {
				answer +=  60 * 60;
			}
			else {
				answer += 1575;
			}
		} */
		
		// 3중 포문
		for(int h=0; h<=n; h++) {
			for(int m=0; m<60; m++) {
				for(int s=0; s<60; s++) {
					String time = String.valueOf(h) + " " + String.valueOf(m) + " " + String.valueOf(s);
					if(time.contains("3"))
						answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		System.out.println(T.solution(kb.nextInt()));
	}

}
