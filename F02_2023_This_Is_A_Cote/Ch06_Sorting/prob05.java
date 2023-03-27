package Chap06_Sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Info implements Comparable<Info>{
	String name;
	int grade;
	public Info(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	@Override
	public int compareTo(Info o) {
		return this.grade - o.grade;
	}
}
s
public class prob05 {
	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Info> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String name = kb.next();
			int grade = kb.nextInt();
			arr.add(new Info(name, grade));
		}
		
		Collections.sort(arr);
		
		for(Info x : arr) 
			System.out.print(x.name + " ");
	}
	
}
