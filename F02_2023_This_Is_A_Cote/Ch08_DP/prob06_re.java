package Chap08_DP;

import java.util.Scanner;

public class prob06_re {
	int max = 10001;

	public static void main(String[] args) {
		prob06_re T = new prob06_re();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dis = new int[m+1];
		for(int i=1; i<=m; i++)	dis[i] = T.max;
		int[] arr = new int[n];
		for(int i=0; i<n; i++)	arr[i] = kb.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<=m; j++) {
				if(dis[j-arr[i]] != 10001) {
					dis[j] = Math.min(dis[j], dis[j - arr[i]]+1);
				}
			}
		}
		
		if (dis[m] == T.max)	System.out.println(-1);
		else	System.out.println(dis[m]);
	}

}
