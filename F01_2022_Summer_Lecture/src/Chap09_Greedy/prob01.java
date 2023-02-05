package chap09;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	int h, w;
	public Person(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Person o) {
		return o.h - this.h;
	}
}

public class prob01 {
	
	public int solution(ArrayList<Person> arr, int n) {
		int answer = 1;
		Collections.sort(arr);
		
		int max = arr.get(0).w;
		for(int i=1; i<n; i++) {
			if(arr.get(i).w > max) {
				max = arr.get(i).w;
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob01 T = new prob01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Person> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Person(kb.nextInt(), kb.nextInt()));
		}
			
		System.out.println(T.solution(arr, n));
	}

}
