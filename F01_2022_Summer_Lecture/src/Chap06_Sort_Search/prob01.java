package chap06;

import java.util.Scanner;

public class prob01 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int index = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[index] > arr[j]) {
					index = j;
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
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
