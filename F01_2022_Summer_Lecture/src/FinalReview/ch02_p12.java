package review;

import java.util.Scanner;

public class ch02_p12 {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		for(int a=1; a<=n; a++) {
			for(int b=1; b<=n; b++) {
				if(a!=b) {
					boolean flag = true;
					for(int i=0; i<m; i++) {
						int s1 = 0;
						int s2 = 0;
						for(int j=0; j<n; j++) {
							if(a == arr[i][j]) {
								s1 = j;
							}
							else if(b == arr[i][j]) {
								s2 = j;
							}
						}
						if(s1 < s2) {
							flag = false;
							break;
						}
					}
					if(flag) {
						answer++;
					}
				}
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		ch02_p12 T = new ch02_p12();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(T.solution(n, m, arr));
	}

}
