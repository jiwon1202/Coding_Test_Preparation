package main1;

import java.util.*;

public class q2_2 {
	public int Solution(int[] nums) {
		int answer = Integer.MIN_VALUE;
		
		int height = 0;
		for (int i=0; i<nums.length-1; i++) {
			if (nums[i+1] > nums[i]) {
				height += (nums[i+1] - nums[i]);
			}
			else {
				answer= Math.max(answer,  height);
				height = 0;
			}
		}
		answer= Math.max(answer,  height);
		return answer;
	}
	public static void main(String args[]) {
		q2_2 T = new q2_2();
		int[] arr = new int[] {8, 12, 2, 3, 7, 6, 12, 20, 2};
		System.out.println(T.Solution(arr));
		int[] arr1 = new int[] {5, 2, 4, 7, 7, 3, 9, 10, 11};
		System.out.println(T.Solution(arr1));
	}
}
