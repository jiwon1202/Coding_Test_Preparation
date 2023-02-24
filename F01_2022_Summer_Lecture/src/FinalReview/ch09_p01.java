package review;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Ath implements Comparable<Ath> {
	int h, w;
	public Ath(int h, int w) {
		this.h = h;
		this.w = w;
	}
	public int compareTo(Ath o) {
		return o.h - this.h;
	}
}

public class ch09_p01 {
	public int solution(int n, ArrayList<Ath> arr) {
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
		ch09_p01 T = new ch09_p01();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ArrayList<Ath> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr.add(new Ath(a, b));
		}
		
		System.out.println(T.solution(n, arr));
	}

}
