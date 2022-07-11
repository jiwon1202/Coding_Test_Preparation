package main1;

import java.util.*;

public class q2_3 {
	public String Solution(int[] nums) {
		int n = nums.length;
		int i = 0;
		
		while((i < n-1) && (nums[i] < nums[i+1]))
			i++;
		if ((i == 0) || (i == n-1))
			return "NO";
		
		while((i < n-1) && (nums[i] > nums[i+1]))
			i++;
		if (i != n-1)
			return "NO";
		
		return "Yes";
	}
	public static void main(String[] args) {
		q2_3 T = new q2_3();
		int[] arr = new int[] {1, 2, 3, 4 ,5, 3, 1};
		System.out.println(T.Solution(arr));
		int[] arr1 = new int[] {1, 3, 4, 5 ,5, 6, 4, 3};
		System.out.println(T.Solution(arr1));
		int[] arr2 = new int[] {1, 2, 3, 4 ,5};
		System.out.println(T.Solution(arr2));
	}
}
