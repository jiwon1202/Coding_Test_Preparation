package Chap03_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {
	
	public int solution(int n, int[] fear) {
		int answer = 0;
		
		Arrays.sort(fear);
		int sIdx = 0, eIdx = 0;
		for(int num : fear) {
			eIdx += num;
			if(eIdx >= n)
				break;
			
			int cnt = 0;
			for(int i=sIdx; i<eIdx; i++)
				cnt++;

			if(fear[eIdx - 1] <= cnt)
				answer++;
			
			sIdx = eIdx;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test01 T = new test01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] fear = new int[n];
		for(int i=0; i<n; i++)	fear[i] = kb.nextInt();
		
		System.out.println(T.solution(n, fear));
	}

}
