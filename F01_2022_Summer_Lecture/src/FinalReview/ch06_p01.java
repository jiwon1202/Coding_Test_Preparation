package review;

import java.util.Scanner;

public class ch06_p01 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int index = i;

			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[i]) {
					index = j;
				}
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		ch06_p01 T = new ch06_p01();
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
