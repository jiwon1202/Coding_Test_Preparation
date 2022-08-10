package Chap02_Array;

public class q01_SortSquared {
	public int[] Solution(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];
		
		int left = 0;
		int right = n-1;
		
		for (int i=n-1; i>=0; i--){
			// 절댓값이 크다면 그 값의 제곱을 answer 배열의 오른쪽 끝에 삽입
			// 그 후 포인터를 옮겨가며 위의 과정 반복
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
		q01_SortSquared T = new q01_SortSquared();
		
		for(int n:T.Solution(new int[] {-4, -1, 0, 3, 10}))
			System.out.print(n + " ");
		
		System.out.println();
		
		for(int n:T.Solution(new int[] {-7, -3, 2, 3, 11}))
			System.out.print(n + " ");
	}
}
