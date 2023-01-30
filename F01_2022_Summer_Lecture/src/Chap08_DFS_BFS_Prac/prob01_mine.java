package chap08;

import java.util.Scanner;

public class prob01_mine {
	static int n;
	static int[] ch;
	int sum1, sum2;
	static String answer = "NO";
	static int[] arr;
	
	public void DFS(int L) {
		if(L==n) {
			sum1 = sum2 = 0;
			for(int i=0; i<n; i++) {
				if(ch[i] == 1) {
					sum1 += arr[i];
				}
				else {
					sum2 += arr[i];
				}
			}
			if(sum1 == sum2) {
				answer = "YES";
			}
		}
		else { 
			ch[L] = 1; 
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}

	public static void main(String[] args) {
		prob01_mine T = new prob01_mine();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		ch = new int[n];
		
		T.DFS(0);
		System.out.print(answer);
	}
}
