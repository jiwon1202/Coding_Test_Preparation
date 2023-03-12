package Chap04_Implementation;

import java.util.Scanner;

public class prob03 {
	int size = 8;
	int[] dx = {2, 2, 1, 1, -1, -1, -2, -2};
	int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
	
	public int solution(int x, int y) {
		int answer = 0;
		
		for(int i=0; i<size; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>0 && nx<=size && ny>0 && ny<=size) {
				answer++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);

		int x = kb.next().charAt(0) - 97 + 1;
		int y = kb.nextInt();
		
		System.out.println(T.solution(x, y));
	}

}
