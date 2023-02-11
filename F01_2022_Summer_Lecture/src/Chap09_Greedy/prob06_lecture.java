package chap09;

import java.util.Scanner;

public class prob06_lecture {
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v])
			return v;
		else 
			return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb)
			unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		prob06_lecture T = new prob06_lecture();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		unf = new int[n+1];
		for(int i=1; i<=n; i++)
			unf[i] = i;
		
		for(int i=1; i<=m; i++) {
			int a = kb.nextInt();
			int b= kb.nextInt();
			Union(a, b);
		}
		
		if(Find(kb.nextInt()) == Find(kb.nextInt()))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
