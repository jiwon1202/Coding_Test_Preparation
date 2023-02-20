package review;

import java.util.Scanner;

public class ch08_p04 {
	static int n, m;
	static int[] arr;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
				arr[L] = i;
				DFS(L+1);
			}
		}
	}

	public static void main(String[] args) {
		ch08_p04 T = new ch08_p04();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		T.DFS(0);
	}

}
