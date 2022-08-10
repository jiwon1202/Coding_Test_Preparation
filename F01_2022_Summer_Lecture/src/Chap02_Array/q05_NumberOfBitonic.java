package Chap02_Array;

import java.util.ArrayList;

public class q05_NumberOfBitonic {
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
			
			// peak을 기준으로 카운팅 하므로 lcnt와 rcnt는 무조건 1이상의 값을 가짐
			// 이 두 값을 곱하는 것은 경우의 수를 구하는 원리와 동일
			while ((0 <= left-1) && nums[left-1] < nums[left]) {
				lcnt++;
				left--;
			}
			while ((right < n-1) && nums[right] > nums[right+1]) {
				rcnt++;
				right++;
			}
			answer += lcnt * rcnt;
		}
		return answer;
	}
	public static void main(String[] args) {
		q05_NumberOfBitonic T = new q05_NumberOfBitonic();
		System.out.println(T.Solution(new int[] {1, 3, 2, 5, 7 ,4, 2, 5, 1}));
	}
}
