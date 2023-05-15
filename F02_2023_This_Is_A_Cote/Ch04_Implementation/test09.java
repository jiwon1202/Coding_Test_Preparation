package Chap04_Implementation;

import java.util.Scanner;

public class test09 {
	public int  solution(String s) {
		int len = s.length();
		int answer = len;
		
		for(int unit=1; unit<=len/2; unit++) {
			String result = "";
			
			int index = 0;
			while(index < len) {
				String tmp = "";
				for(int i=0; i<unit; i++) {
					if(index + i < len)
						tmp += s.charAt(index + i);
				}
				
				int cnt = 1;
				for(int sIdx=index+unit; sIdx<len; sIdx+=unit) {
					if(sIdx+unit <= len && tmp.equals(s.substring(sIdx, sIdx+unit))) {
						cnt++;
						index += unit;
					}
					else {
						break;
					}
				}

				if(cnt == 1) {
					result += tmp;
				}
				else {
					result += cnt;
					result += tmp;
				}
				
				index += unit;
			}
			answer = Math.min(answer, result.length());
		}

		
		return answer;
	}

	public static void main(String[] args) {
		test09 T = new test09();
		Scanner kb = new Scanner(System.in);

		System.out.println(T.solution(kb.nextLine()));
	}

}
