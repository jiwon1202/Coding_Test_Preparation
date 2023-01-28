package chap07;

import java.util.Scanner;

public class prob01 {
	public void DFS(int n) {
		if(n > 0) {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		T.DFS(n);
	}
}