package Chap08_DP;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] dis = new int[n+1];
		
		dis[1] = 1;
		dis[2] = 3;
		for(int i=3; i<=n; i++)	dis[i] = dis[i-1] + dis[i-2] * 2;
		
		System.out.println(dis[n]);
	}

}
