package review;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Conf implements Comparable<Conf> {
	int s, e;
	public Conf(int s, int e) {
		this.s = s;
		this.e = e;
	}
	public int compareTo(Conf o) {
		if (o.e == this.e) {
			return this.s - o.s;
		}
		else {
			return this.e - o.e;	
		}
	}
}

public class ch09_p02 {
	public int solution(int n, ArrayList<Conf> arr) {
		int answer = 0;
		Collections.sort(arr);
		
		int time = -1;
		for(Conf x : arr) {
			if(time <= x.s) {
				time = x.e;
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch09_p02 T = new ch09_p02();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ArrayList<Conf> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Conf(kb.nextInt(), kb.nextInt()));
		}

		System.out.println(T.solution(n, arr));
	}

}
