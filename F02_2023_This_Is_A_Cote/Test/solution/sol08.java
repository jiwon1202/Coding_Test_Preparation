package Chap04_Implementation;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class sol08 {
	public String solution(String s) {
		String answer = "";
		int sum = 0;
		
		ArrayList<Character> arr = new ArrayList<>();
		for(char x : s.toCharArray()) {
			if(x >= 'A' && x <= 'Z')
				arr.add(x);
			else
				sum += x - 48;
		}
		
		Collections.sort(arr);
		for(char x : arr)
			answer += x;
		
		if (sum != 0)
			return answer + String.valueOf(sum);
		
		return answer;
	}
	
	public static void main(String[] args) {
		sol08 T = new sol08();
		Scanner kb = new Scanner(System.in);
		
		System.out.println(T.solution(kb.nextLine()));
	}

}
