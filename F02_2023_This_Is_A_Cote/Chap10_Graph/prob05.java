package Chap10;

import java.util.Scanner;

public class prob05 {
	public int find(int[] team, int a) {
		if(team[a] != a)
			team[a] = find(team, team[a]);
		return team[a];
	}
	
	public void union(int[] team, int a, int b) {
		a = find(team, a);
		b = find(team, b);
		if(a < b)	team[b] = a;
		else		team[a] = b;
	}

	public static void main(String[] args) {
		prob05 T = new prob05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] team = new int[n+1];
		for(int i=0; i<=n; i++)	team[i] = i;
		
		for(int i=0; i<m; i++) {
			int mode = kb.nextInt();
			int a = kb.nextInt();
			int b = kb.nextInt();
			if(mode == 1) {
				if (T.find(team, a) == T.find(team, b))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else if(mode == 0) {
				T.union(team, a, b);
			}
		}
	}

}
