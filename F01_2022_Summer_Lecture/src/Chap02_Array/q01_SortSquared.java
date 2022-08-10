package main1;

import java.util.*;

public class q2_1 {
	public int[] Solution(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];
		
		int left = 0;
		int right = n-1;
		
		for (int i=n-1; i>=0; i--){
			if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
				answer[i] = nums[left] * nums[left];
				left++;
			}
			else {
				answer[i] =  nums[right] * nums[right];
				right--;
			}
		}
		return answer;
	}
	public static void main(String args[]) {
		q2_1 T = new q2_1();
		int[] arr = new int[] {-4, -1, 0, 3, 10};
		for(int n:T.Solution(arr))
			System.out.print(n + " ");
		
		System.out.println();
		
		int[] arr1 = new int[] {-7, -3, 2, 3, 11};
		for(int n:T.Solution(arr1))
			System.out.print(n + " ");
	}
}
