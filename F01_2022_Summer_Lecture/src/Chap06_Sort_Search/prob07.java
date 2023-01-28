package chap06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point>{
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		else {
			return this.x - o.x;
		}
	}
}

public class prob07 {
	public static void main(String[] args) {
		prob07 T = new prob07();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Point(kb.nextInt(), kb.nextInt()));
		}
		
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
