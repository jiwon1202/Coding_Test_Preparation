package Chap04_Implementation;

import java.util.Scanner;

public class test08 {
	public String solution(String s) {
		String answer = "";
		int sum = 0;
		int[] count = new int[26];
		
		for(int x : s.toCharArray()) {
			if(x>=65 && x<=90) {
				count[x-65]++;
			}
			else {
				sum += x - 48;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(count[i] != 0) {
				while(count[i]-- > 0)
					answer += (char)(i + 65);
			}
		}
		
		return answer + String.valueOf(sum);
	}

	public static void main(String[] args) {
		test08 T = new test08();
		Scanner kb = new Scanner(System.in);
		
		System.out.println(T.solution(kb.nextLine()));
	}

}
