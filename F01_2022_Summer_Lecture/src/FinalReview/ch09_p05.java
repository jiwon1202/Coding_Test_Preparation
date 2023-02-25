package review;

import java.util.Scanner;
import java.util.ArrayList;

class Info {
	int s, e, dis;
	public Info(int s, int e, int dis) {
		this.s = s;
		this.e = e;
		this.dis = dis;
	}
}

public class ch09_p05 {
	static int n, m;
	static int[] dis;
	
	public void solution(ArrayList<Info> arr) {
		for(Info x : arr) {
			if(dis[x.s] != Integer.MAX_VALUE) {
				dis[x.e] = Math.min(dis[x.e], dis[x.s] + x.dis); 
			}
		}
	}

	public static void main(String[] args) {
		ch09_p05 T = new ch09_p05();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();
		dis = new int[n+1];
		for(int i=2; i<=n; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		ArrayList<Info> arr = new ArrayList<>();
		
		m = kb.nextInt();
		for(int i=0; i<m; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Info(s, e, d));
		}
		
		T.solution(arr);
		for(int i=2; i<=n; i++) {
			System.out.print(i + " : " );
			if(dis[i] == Integer.MAX_VALUE) 
				System.out.println("impossible");
			else
				System.out.println(dis[i]);
		}
	}
}
