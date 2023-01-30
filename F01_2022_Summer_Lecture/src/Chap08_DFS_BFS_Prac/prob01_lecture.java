package chap08;

import java.util.Scanner;

public class prob01_lecture {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	static int[] arr;
	
	public void DFS(int L, int sum) {
		if(flag) {
			return;
		}
		if(sum > total/2) {
			return;
		}
		if(L==n) {
			if(total - sum == sum) {
				flag = true;
				answer = "YES";
			}
		}
		else {
			DFS(L+1, sum+arr[L]);
			DFS(L+1, sum);
		}
	}

	public static void main(String[] args) {
		prob01_lecture T = new prob01_lecture();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		
		T.DFS(0, 0);
		System.out.println(answer);
	}

}
