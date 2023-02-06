package chap09;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class Time implements Comparable<Time> {
	int time;
	Character state;
	public Time(int s, Character state) {
		this.time = s;
		this.state = state;
	}
	@Override
	public int compareTo(Time o) {
		if (this.time == o.time) {
			return this.state - o.state;
		}
		else {
			return this.time - o.time;
		}
	}
}

public class prob03 {
	public int solution(int n, ArrayList<Time> arr) {
		int answer= 0;
		int cnt = 0;
		
		Collections.sort(arr);
		for (Time x : arr) {
			if(x.state == 'e') {
				cnt--;
			}
			else {
				cnt++;
			}
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Time(kb.nextInt(), 's'));
			arr.add(new Time(kb.nextInt(), 'e'));
		}

		Collections.sort(arr);
		
		System.out.println(T.solution(n, arr));
	}

}
