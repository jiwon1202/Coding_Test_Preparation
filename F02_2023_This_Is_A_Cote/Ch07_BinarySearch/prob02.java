package Chap07_BinarySearch;

import java.util.Scanner;

public class prob02 {
	static int[] arr;
	public int solution(int s, int e, int target) {
		if(s > e)
			return -1;
		
		int mid = (s + e) / 2;
		if(arr[mid] == target) {
			return mid + 1;
		}
		else if (arr[mid] > target) {
			return solution(s, mid-1, target);
		}
		else {
			return solution(mid+1, e, target);
		}
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int target = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		int result = T.solution(0, n-1, target);
		if(result == -1)
			System.out.println("존재 X");
		else
			System.out.println(result);
	}

}
