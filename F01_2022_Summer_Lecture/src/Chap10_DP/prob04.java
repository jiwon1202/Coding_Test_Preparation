package chap10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Block implements Comparable<Block>{
	int a;
	int w;
	int h;
	public Block(int a, int h, int w) {
		this.a = a;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Block o) {
		return o.a - this.a;
	}
}

public class prob04 {
	static int[] dy;
	
	public int solution(int n, ArrayList<Block> arr) {
		int answer = 0;
		
		dy[0] = arr.get(0).h;
		for(int i=1; i<n; i++) {
			int max = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(i).w < arr.get(j).w) {
					 max = Math.max(dy[j], max);
				}
			}
			dy[i] = max + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		prob04 T = new prob04();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		dy = new int[n];
		 ArrayList<Block> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(new Block(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		
		Collections.sort(arr);
		
		System.out.println(T.solution(n, arr));
	}

}