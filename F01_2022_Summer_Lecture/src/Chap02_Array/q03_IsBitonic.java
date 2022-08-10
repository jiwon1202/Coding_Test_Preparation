package Chap02_Array;

public class q03_IsBitonic {
	public String Solution(int[] nums) {
		int n = nums.length;
		int i = 0;
		
		// 증가수열이 끝나는 지점의 인덱스 탐색
		while((i < n-1) && (nums[i] < nums[i+1]))
			i++;
		// 증가하지 않았거나 배열의 처음부터 끝까지 증가하기만 한다면 NO
		if ((i == 0) || (i == n-1))
			return "NO";
		
		// 감소수열이 끝나는 지점의 인덱스 탐색
		while((i < n-1) && (nums[i] > nums[i+1]))
			i++;
		// 배열의 끝까지 도달하지 못했다면 NO / 도달했다면 YES
		if (i != n-1)
			return "NO";
		else
			return "Yes";
	}
	public static void main(String[] args) {
		q03_IsBitonic T = new q03_IsBitonic();
		System.out.println(T.Solution(new int[] {1, 2, 3, 4 ,5, 3, 1}));
		System.out.println(T.Solution(new int[] {1, 3, 4, 5 ,5, 6, 4, 3}));
		System.out.println(T.Solution(new int[] {1, 2, 3, 4 ,5}));
	}
}
