package Chap08_DP;

import java.util.Scanner;

public class prob04_re {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)	arr[i] = kb.nextInt();
		
		int[] dis = new int[n];
		dis[0] = arr[0];
		dis[1] = Math.max(arr[0], arr[1]);	// 어쨌든 한 칸 떨어져 있을 것을 가정하여, 앞쪽 두 칸의 최댓값을 취하는 것이 맞음.
		for(int i=2; i<n; i++)	dis[i] = Math.max(dis[i-1], dis[i-2] + arr[i]);
		
		System.out.println(dis[n-1]);
	}
}
