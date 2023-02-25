package review;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Schedule implements Comparable<Schedule>{
	int m, d;
	public Schedule(int m, int d) {
		this.m = m;
		this.d = d;
	}
	public int compareTo(Schedule o) {
		if(o.d == this.d) {
			return o.m - this.m;
		}
		else {
			return o.d - this.d;
		}
	}
}

public class ch09_p04 {
	public int solution(int n, ArrayList<Schedule> arr) {
		int answer = 0;
		Collections.sort(arr);
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		
		int index = 0;
		for(int i=arr.get(0).d; i>0; i--) {
			for( ; index<n; index++) {
				if (arr.get(index).d < i)
					break;
				else 
					PQ.offer(arr.get(index).m);
			}
			
			if(!PQ.isEmpty())
				answer += PQ.poll();
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch09_p04 T = new ch09_p04();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ArrayList<Schedule> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Schedule(kb.nextInt(), kb.nextInt()));
		}
		
		System.out.println(T.solution(n, arr));
	}

}
