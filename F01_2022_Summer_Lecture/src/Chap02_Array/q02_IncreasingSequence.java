package Chap02_Array;

import java.util.*;

// 이중반복문을 돌릴 필요가 없다.
// 연속된 두 원소를 기준으로 answer를 갱신해 나가면 결과를 얻을 수 있다.
public class q02_IncreasingSequence {
	public int Solution(int[] nums) {
		int answer = Integer.MIN_VALUE;
		
		int height = 0;
		for (int i=0; i<nums.length-1; i++) {
			// 증가수열 이라면, 즉 다음 원소가 현재 원소보다 크다면 height 값 증가
			if (nums[i+1] > nums[i]) {
				height += (nums[i+1] - nums[i]);
			}
			// 그렇지 않다면 answer와 height중 더 큰 값을 저장한 후 height 값 초기화
			else {
				answer= Math.max(answer,  height);
				height = 0;
			}
		}
		// 마지막으로 if문 코드가 실행되고 반복문이 종료된 경우를 고려하여 answer값 재설정
		answer= Math.max(answer,  height);
		return answer;
	}
	public static void main(String args[]) {
		q02_IncreasingSequence T = new q02_IncreasingSequence();
		System.out.println(T.Solution(new int[] {8, 12, 2, 3, 7, 6, 12, 20, 2}));
		System.out.println(T.Solution(new int[] {5, 2, 4, 7, 7, 3, 9, 10, 11}));
	}
}
