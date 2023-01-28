package chap06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class prob06 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
		int[] ori = arr.clone();
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			if(ori[i] != arr[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob06 T = new prob06();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
