package Chap02_Array;

public class q06_KeepDistance {
	public int Solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		int[] dist = new int[n];
		
		// 현재 좌석에서 왼쪽 방향 기준으로 가장 가까운 사람과의 거리를 배열에 저장
		int d = 100;
		for(int i=0; i<n; i++) {
			if (nums[i] == 1) {
				d = 0;
			}
			else {
				d++;
				dist[i] = d;
			}
		}
		
		// 이번엔 배열의 오른쪽부터 거리를 측정하여 더 작은 값으로 배열 값 설정
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
		q06_KeepDistance T = new q06_KeepDistance();
		System.out.println(T.Solution(new int[] {1, 0, 0, 0, 1, 0 ,0, 1, 0, 1}));
		System.out.println(T.Solution(new int[] {0, 0, 0, 0, 0, 0 ,0, 0, 0, 1}));
	}
}
