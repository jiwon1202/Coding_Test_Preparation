package Chap08_DP;

import java.util.*;

public class test32 {
	public int solution(int n, int size, int[] arr) {
		int answer =0;
		
		int index = 1;
		for(int level=2;  level<=n;  level++) {
			for(int cnt=0; cnt<level; cnt++) {
				if(cnt == 0) {
					arr[index] = arr[index - level + 1] + arr[index];
				}
				else if (cnt == level-1) {
					arr[index] = arr[index - level] + arr[index];
				}
				else {
					arr[index] = Math.max(arr[index - level] + arr[index], arr[index - level + 1] + arr[index]);
				}
				index++;
			}
		}
		
		for(int i=size-n; i<size; i++)
			answer = Math.max(answer, arr[i]);
		
		return answer;
	}

	public static void main(String[] args) {
		test32 T = new test32();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int size = 0;
		for(int i=1; i<=n; i++)
			size+=i;
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(T.solution(n, size, arr));
	}

}
