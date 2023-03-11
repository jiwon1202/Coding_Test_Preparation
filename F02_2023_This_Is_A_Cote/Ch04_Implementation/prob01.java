package Chap04_Implementation;

import java.util.Scanner;

public class prob01 {
	public int[] solution(int n, char[] plan) {
		int[] answer = {1, 1};

		for(char x : plan) {
			int nx = answer[1];
			int ny = answer[0];
			
			if (x == 'R') nx += 1;
			else if (x=='D') ny += 1;
			else if (x=='L') nx -= 1;
			else if (x=='U') ny -= 1;
			
			if (nx>0 && nx<=n && ny>0 && ny<=n) {
				answer[1] = nx;
				answer[0] = ny;
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		char[] plan = new char[m];
		
		for(int i=0; i<m; i++) {
			plan[i] = kb.next().charAt(0);
		}
		
		for(int x : T.solution(n, plan)) {
			System.out.print(x + " ");
		}
	}
}
