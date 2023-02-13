package review;

import java.util.Scanner;

public class ch02_p05 {
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			boolean flag = false;
			if(ch[i] == 0) {
				for(int j=i; j<=n; j+=i) {
					flag = true;
					ch[j] = 1;
				}
			}
			
			if(flag) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ch02_p05 T = new ch02_p05();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
