package Chap08_DP;

import java.util.Scanner;

public class prob06 {
	int max = 10001;

	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dis = new int[m+1];
		for(int i=0; i<=m; i++)	dis[i] = T.max;
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++)	{
			arr[i] = kb.nextInt();
			if(arr[i] < m)	dis[arr[i]] = 1;
		}

		for(int i=arr[0]; i<=m; i++) {
			for(int x : arr) {
				int index = i-x;
				if(index >=0) dis[i] = Math.min(dis[i], dis[index] + 1);
			}
		}
		
		if (dis[m] == T.max)	System.out.println(-1);
		else	System.out.println(dis[m]);
		
	}

}
