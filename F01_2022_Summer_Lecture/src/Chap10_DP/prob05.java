package chap10;

import java.util.Scanner;

public class prob05 {
	static public int[] dy;
	
	public int solution(int n, int[] arr, int m) {
		for(int i=arr[0]; i<=m; i++) {
			dy[i] = Integer.MAX_VALUE;
			for(int x : arr) {
				if(i - x >= 0) {
					dy[i] = Math.min(dy[i], dy[i-x] + 1);
				}
			}
		}
		
		return dy[m];
	}

	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		dy = new int[m+1];
		
		System.out.println(T.solution(n, arr, m));
	}

}
