package review;

import java.util.Scanner;

public class ch07_p06 {
	static int[] ch;
	static int n;
	
	public void DFS(int L) {
		if(L == n+1) {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}

	public static void main(String[] args) {
		ch07_p06 T = new ch07_p06();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();
		ch = new int[n+1];
		
		T.DFS(1);
	}

}
