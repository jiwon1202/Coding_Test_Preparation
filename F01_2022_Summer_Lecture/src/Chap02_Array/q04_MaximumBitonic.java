package Chap02_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q04_MaximumBitonic {
	public int Solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		
		// 바이토닉 수열의 최댓값, 즉 꼭짓점의 인덱스를 peaks에 저장
		ArrayList<Integer> peaks = new ArrayList<>();
		for (int i=1; i<n-1; i++) {
			if ((nums[i] > nums[i-1]) && (nums[i] > nums[i+1]))
				peaks.add(i);
		}
		
		// 각 꼭짓점을 기준으로 양 옆으로 뻗어나가며 바이토닉 수열의 최대 길이 탐색
		for (int p : peaks) {
			int left = p;
			int right = p;
			int cnt = 1;
			
			while ((0 <= left-1) && (nums[left-1] < nums[left])) {
				cnt++;
				left--;
			}
			while ((right < n-1) && (nums[right] > nums[right+1])) {
				cnt++;
				right++;
			}
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	public static void main(String[] args) {
		q04_MaximumBitonic T = new q04_MaximumBitonic();
		System.out.println(T.Solution(new int[] {1, 3, 2, 5, 7 ,4, 2, 5, 1}));
	}
}
