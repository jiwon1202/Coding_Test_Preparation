package main1;

import java.util.*;

public class q2_5 {
	public int Solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		
		ArrayList<Integer> peaks = new ArrayList<>();
		for (int i=1; i<n-1; i++) {
			if ((nums[i] > nums[i-1]) && (nums[i] > nums[i+1]))
				peaks.add(i);
		}

		for (int p : peaks) {
			int left = p;
			int right = p;
			int lcnt = 0;
			int rcnt = 0;
			
			while (left-1>=0 && nums[left-1] < nums[left]) {
				lcnt++;
				left--;
			}
			while (right+1<n && nums[right] > nums[right+1]) {
				rcnt++;
				right++;
			}
			answer += lcnt * rcnt;
		}
		return answer;
	}
	public static void main(String[] args) {
		q2_5 T = new q2_5();
		int[] arr = new int[] {1, 3, 2, 5, 7 ,4, 2, 5, 1};
		System.out.println(T.Solution(arr));
	}
}
