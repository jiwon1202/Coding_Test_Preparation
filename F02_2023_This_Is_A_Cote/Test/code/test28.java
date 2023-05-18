package Chap07_BinarySearch;

import java.util.*;

public class test28 {
	public int solution(int n, int[] arr) {
		int answer = -1;
		
		int s = 0;
		int e = n-1;
		
		while(s <= e) {
			int mid = (s+e) / 2;
			if(mid == arr[mid])
				return mid;
			else if(mid > arr[mid])
				s = mid+1;
			else
				e = mid-1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test28 T = new test28();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(T.solution(n, arr));
	}

}
