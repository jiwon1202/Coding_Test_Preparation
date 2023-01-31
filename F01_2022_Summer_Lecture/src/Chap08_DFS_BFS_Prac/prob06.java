package chap08;

import java.util.Scanner;

public class prob06 {
	static int n, m;
	static int[] arr, ch, pm;
	
	public void DFS(int L, int index) {
		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i=0; i<n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1, i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();

		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		ch = new int[n];
		pm = new int[m];
		
		T.DFS(0, 0);
	}

}
