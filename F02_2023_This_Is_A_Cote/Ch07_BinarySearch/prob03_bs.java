package Chap07_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class prob03_bs {
	static Integer[] store;
	public int solution(int s, int e, int t) {
		if(s > e)
			return -1;
		
		int mid = (s + e) / 2;
		if(store[mid] == t) {
			return store[mid];
		}
		else if(t < store[mid]) {
			return solution(s, mid-1, t);
		}
		else {
			return solution(mid+1, e, t);
		}
	}

	public static void main(String[] args) {
		prob03_bs T = new prob03_bs();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		store = new Integer[n];
		for(int i=0; i<n; i++)	store[i] = kb.nextInt();
		Arrays.sort(store);
		
		int m = kb.nextInt();
		Integer[] customer = new Integer[m];
		for(int i=0; i<m; i++)	customer[i] = kb.nextInt();
		
		for(int target : customer) {
			if(-1 == T.solution(0, n-1, target)) {
				System.out.print("NO ");
			}
			else {
				System.out.print("YES ");
			}
		}
	}

}
