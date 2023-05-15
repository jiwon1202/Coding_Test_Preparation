package Chap03_Greedy;

import java.util.*;

public class sol04 {
	public int solution(int n, int[] arr) {
		int answer = 1;
		
		Arrays.sort(arr);
		for(int x : arr) {
			if(answer < x)
				break;
			answer += x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		sol04 T = new sol04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)	arr[i] = kb.nextInt();
		
		System.out.println(T.solution(n, arr));
	}

}
