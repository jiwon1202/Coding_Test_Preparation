package main1;

import java.util.*;

public class q2_7 {
	public int Solution(String s, int limit) {
		int[] used = new int[27];
		for(int x : s.toCharArray()) {
			if (x >= 97 && x <= 122) {
				used[x-97] = 1;
			}
			else if (x>= 65 && x <= 90) {
				used[26] = 1;
				used[x-65] = 1;
			}
		}
		
		int cnt = 0;
		for (int i=0; i<27; i++)
			if(used[i] == 1) 
				cnt++;
		
		if(cnt <= limit)
			return s.length();
		else
			return -1;
	}
	
	public static void main(String[] args) {
		q2_7 T = new q2_7();
		String s1 = "time to time";
		System.out.println(T.Solution(s1, 5));
		String s2 = "time to study";
		System.out.println(T.Solution(s2, 7));
		String s3 = "Big life is Good";
		System.out.println(T.Solution(s3, 10));
		String s4 = "Life is Good";
		System.out.println(T.Solution(s4, 7));
	}
}
