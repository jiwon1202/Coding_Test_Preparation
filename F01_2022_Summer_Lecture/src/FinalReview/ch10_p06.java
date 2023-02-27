package review;

import java.util.Scanner;

public class ch10_p06 {
	public static void main(String[] args) {
		ch10_p06 T = new ch10_p06();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		
		for(int i=0; i<n; i++) {
			int g = kb.nextInt();
			int t = kb.nextInt();
			for(int j=m; j>=t; j--) {
				dy[j] = Math.max(dy[j], dy[j-t] + g);
			}
			
		}
		
		System.out.println(dy[m]);
	}

}
