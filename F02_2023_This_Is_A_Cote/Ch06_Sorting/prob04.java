package Chap06_Sorting;

import java.util.Arrays;

public class prob04 {
	public int[] solution(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int[] count = new int[max+1];
		
		for(int x : arr) {
			count[x]++;
		}
		
		int index = 0;
		for(int i=0; i<=max; i++) {
			while(count[i] > 0) {
				count[i]--;
				arr[index++] = i;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		prob04 T = new prob04();
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
		
		for(int x : T.solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
