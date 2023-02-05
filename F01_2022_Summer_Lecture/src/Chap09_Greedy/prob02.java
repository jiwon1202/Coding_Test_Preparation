package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Room implements Comparable<Room>{
	int s, e;
	public Room(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Room o) {
		if(this.e == o.e)
			return this.s - o.s;
		else 
			return this.e - o.e;
	}
}

public class prob02 {
	
	public int solution(ArrayList<Room> arr, int n) {
		int answer = 0;
		
		int et = 0;
		for(Room r : arr) {
			if(r.s >= et) {
				answer++;
				et = r.e;
				
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Room> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Room(kb.nextInt(), kb.nextInt()));
		}

		Collections.sort(arr);
		System.out.println(T.solution(arr, n));
	}

}
