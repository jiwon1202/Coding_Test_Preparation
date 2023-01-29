package chap07;

import java.util.Scanner;

public class prob06 {
	static int n;
	static int[] ch;
	
	public void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		else { 
			ch[L] = 1; 
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}

	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		ch = new int[n+1];
		
		T.DFS(1);
	}
}