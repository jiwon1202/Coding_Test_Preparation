package Chap08_DP;

import java.util.*;

public class test36 {
	public int solution(String s1, String s2) {
		int len1 = s1.length(), len2 = s2.length();
		
		int[][] arr = new int[len1+1][len2+1];
		for(int i=1; i<=len1; i++)
			arr[i][0] = i;
		for(int j=1; j<=len2; j++)
			arr[0][j] = j;
		
		for(int i=1; i<=len1; i++) {
			for(int j=1; j<=len2; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1];
				}
				else {
					arr[i][j] = Math.min(arr[i-1][j-1], Math.min(arr[i-1][j], arr[i][j-1])) + 1;
				}
			}
		}
		
		
		return arr[len1][len2];
	}

	public static void main(String[] args) {
		test36 T = new test36();
		Scanner kb = new Scanner(System.in);

		String s1 = kb.nextLine();
		String s2 = kb.nextLine();
		System.out.println(T.solution(s1, s2));
	}

}
