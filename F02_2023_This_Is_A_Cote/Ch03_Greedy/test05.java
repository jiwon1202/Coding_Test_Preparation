package Chap03_Greedy;

import java.util.Scanner;

public class test05 {
	public int solution(int n, int[] weights) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(weights[i] != weights[j])
					answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test05 T = new test05();
		Scanner kb = new Scanner(System.in);
				
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] weights = new int[n];
		for(int i=0; i<n; i++)	weights[i] = kb.nextInt();
		
		System.out.println(T.solution(n, weights));
	}

}
