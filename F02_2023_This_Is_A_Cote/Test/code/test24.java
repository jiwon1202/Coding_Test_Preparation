package Chap06_Sorting;

import java.util.*;

public class test24 {

	public static void main(String[] args) {
		test24 T = new test24();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++)	arr.add(kb.nextInt());
		Collections.sort(arr);
		
		System.out.println(arr.get((n-1)/2));

	}

}
