package review;

import java.util.Scanner;

public class ch08_p01 {
	static int n, total = 0;
	static int[] arr;
	static String answer = "NO";
	
	public void DFS(int L, int sum) {
		if (L >= n) {
			return;
		}
		if (sum > total / 2) {
			return;
		}
		if (total - sum == sum) {
			answer = "YES";
			return;
		}
		else {
			DFS(L+1, sum);
			DFS(L+1, sum+arr[L]);
		}
	}
	
	public static void main(String[] args) {
		ch08_p01 T = new ch08_p01();
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
