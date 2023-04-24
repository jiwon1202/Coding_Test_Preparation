package Chap08_DP;

import java.util.Scanner;

public class prob04 {
	static int answer = 0;
	static int n;
	static int[] arr;
	
	public void DP(int index, int sum) {
		answer = Math.max(answer, sum);
		for(int i=index+2; i<n; i++) DP(i, sum+arr[i]);
	}
	
	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++)	arr[i] = kb.nextInt();
		for(int i=0; i<n; i++)	T.DP(i, arr[i]);
		
		System.out.println(answer);
	}

}
