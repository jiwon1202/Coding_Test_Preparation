package chap07;

import java.util.Scanner;

public class prob02 {
	public void DFS(int n) {
		if(n == 0) {
			return;
		}
		else {
			DFS(n / 2);
			System.out.print(n % 2);
		}
	}
	
	public static void main(String[] args) {
		prob02 T  = new prob02();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		T.DFS(n);
	}

}
