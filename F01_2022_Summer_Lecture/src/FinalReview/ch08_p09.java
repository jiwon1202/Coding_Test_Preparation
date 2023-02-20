package review;

import java.util.Scanner;

public class ch08_p09 {
	static int n, m;
	static int[] arr, ch;
	
	public void DFS(int L, int num) {
		if(L == m) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i=num; i<=n; i++) {
				arr[L] = i;
				DFS(L+1, num+i);
			}
		}
	}
	
	public static void main(String[] args) {
		ch08_p09 T = new ch08_p09();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[m];
		
		T.DFS(0, 1);
	}

}
