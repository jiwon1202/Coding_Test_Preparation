package Chap06_Sorting;

import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int kor, eng, math;
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int compareTo(Student other) {
		if(this.kor != other.kor)
			return other.kor - this.kor;
		else {
			if(this.eng != other.eng)
				return this.eng - other.eng;
			else {
				if(this.math != other.math)
					return other.math - this.math;
				else 
					return this.name.compareTo(other.name);
			}
		}
	}
}

public class test23 {

	public static void main(String[] args) {
		test23 T = new test23();
		Scanner kb = new Scanner(System.in);
		
		ArrayList<Student> arr = new ArrayList<>();
		int n = kb.nextInt();
		for(int i=0; i<n; i++) {
			arr.add(new Student(kb.next(), kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		
		Collections.sort(arr);
		for(Student s : arr)
			System.out.println(s.name);
	}

}
