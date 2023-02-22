package review;

import java.util.Scanner;
import java.util.ArrayList;

class Position {
	int x, y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ch08_p14 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	
	static ArrayList<Position> Home = new ArrayList<>();
	static ArrayList<Position> Pizza = new ArrayList<>();
	
	public void DFS(int L, int s) {
		if (L == m) {
			int sum = 0;
			for(Position h : Home) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, 
							Math.abs(h.x - Pizza.get(i).x) +
							Math.abs(h.y - Pizza.get(i).y));
				}
				sum += dis;
				if (answer < sum)
					break;
			}
			answer = Math.min(answer, sum);
			
		} else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		ch08_p14 T = new ch08_p14();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int tmp = kb.nextInt();
				if (tmp == 1) {
					Home.add(new Position(i, j));
				}
				else if(tmp == 2) {
					Pizza.add(new Position(i, j));
				}
			}
		}
		
		len = Pizza.size();
		combi = new int[m];
		T.DFS(0, 0);
		
		System.out.println(answer);
	}

}
