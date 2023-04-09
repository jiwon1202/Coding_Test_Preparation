package Chap07_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class prob03 {
	public String[] solution(int n, Integer[] s, int m, Integer[] c) {
		String[] answer = new String[m];
		Arrays.sort(s);
		Arrays.sort(c);
		
		int i_1 = 0, i_2 = 0, i_3 = 0;
		while(i_1 < m && i_2 < n && i_3 < m) {
			if(s[i_2] == c[i_3]) {
				answer[i_1++] = "YES";
				i_2++;
				i_3++;
			}
			else if(s[i_2] < c[i_3]) {
				i_2++;
			}
			else {
				answer[i_1++] = "NO";
				i_3++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		Integer[] store = new Integer[n];
		for(int i=0; i<n; i++)	store[i] = kb.nextInt();
		
		int m = kb.nextInt();
		Integer[] customer = new Integer[m];
		for(int i=0; i<m; i++)	customer[i] = kb.nextInt();
		
		for(String x : T.solution(n, store, m, customer)) {
			System.out.print(x + " ");
		}

	}

}
