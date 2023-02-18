package review;

import java.util.Scanner;

public class ch06_p03 {
	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			for(int j=i; j>=1; j--) {
				if(arr[j-1] > arr[j]) {
					int num = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = num;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		ch06_p03 T = new ch06_p03();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
