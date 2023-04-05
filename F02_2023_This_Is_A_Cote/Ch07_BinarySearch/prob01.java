package Chap07_BinarySearch;

import java.util.Scanner;

public class prob01 {
	public String solution(String[] arr, String name) {
		for(String x : arr) {
			if(x.equals(name))
				return "YES";
		}
		
		return "NO";
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		String[] arr = {"Haneul", "Jonggu", "Dongbin", "Taeil", "Sangwook"};
		String name = kb.next();
		
		System.out.println(T.solution(arr, name));
	}

}
