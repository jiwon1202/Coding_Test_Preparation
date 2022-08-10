package main1;

import java.util.*;

public class q2_6 {
	public int Solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		int[] dist = new int[n];
		
		int d = 1000;
		for(int i=0; i<n; i++) {
			if (nums[i] == 1) {
				d = 0;
			}
			else {
				d++;
				dist[i] = d;
			}
		}
		
		d = 0;
		for(int i=n-1; i>=0; i--) {
			if (nums[i] == 1) {
				d = 0;
			}
			else {
				d++;
				dist[i] = Math.min(dist[i], d);
			}
		}

		
		for (int x : dist) {
			answer = Math.max(x, answer);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		q2_6 T = new q2_6();
		int[] arr = new int[] {1, 0, 0, 0, 1, 0 ,0, 1, 0, 1};
		System.out.println(T.Solution(arr));
		int[] arr1 = new int[] {0, 0, 0, 0, 0, 0 ,0, 0, 0, 1};
		System.out.println(T.Solution(arr1));
	}
}
