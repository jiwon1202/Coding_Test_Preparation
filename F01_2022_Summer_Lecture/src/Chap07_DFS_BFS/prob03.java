package chap07;

import java.util.Scanner;

public class prob03 {
	public int DFS(int n) {
		if(n == 1) {
			return 1;
		}

		return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		prob03 T  = new prob03();
		Scanner kb = new Scanner(System.in);
		
		System.out.println(T.DFS(kb.nextInt()));
	}

}
