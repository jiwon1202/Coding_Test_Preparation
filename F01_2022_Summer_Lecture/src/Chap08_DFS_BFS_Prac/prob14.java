package chap08;

import java.util.Scanner;
import java.util.ArrayList;

class P {
	int x, y, dis;
	public P(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class prob14 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	
	static ArrayList<P> Home = new ArrayList<>();
	static ArrayList<P> Pizza = new ArrayList<>();
	
	public void DFS(int L, int s) {
		if (L == m) {
			int sum = 0;
			for(P h : Home) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis,
							Math.abs(h.x - Pizza.get(i).x) +
							Math.abs(h.y - Pizza.get(i).y));
				}
				sum += dis;
				if(answer < sum) {
					break;
				}
			}
			answer = Math.min(answer, sum);
		}
		else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		prob14 T = new prob14();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) {
					Home.add(new P(i, j));
				}
				else if(tmp == 2) {
					Pizza.add(new P(i, j));
				}
			}
		}
		
		len = Pizza.size();
		combi = new int[m];
		T.DFS(0,  0);
		
		System.out.println(answer);
	}
}
