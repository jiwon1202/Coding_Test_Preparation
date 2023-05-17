package Chap05_DFS_BFS;

import java.util.Scanner;

public class test18 {
	public boolean check(String s) {
		int count = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '(')	count++;
			else count--;
			if(count <0) return false;
		}
		
		return count == 0;
	}
	
    public String solution(String p) {
        if(p == "")		return "";
        if(check(p))	return p;
        
        int i, t = 0;
        for (i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '(') ++t;
            else --t;
            if (t == 0) break;
        }

        String u = p.substring(0, i + 1);
        String v = p.substring(i + 1);

        if (check(u))
        	return u + solution(v);

        String tmp = "";
        for(int Idx=1; Idx<u.length()-1; Idx++)
        	tmp += u.charAt(Idx) == '(' ? ")" : "(";
        
        return "(" + solution(v) + ")" + tmp;
    }
    
	public static void main(String[] args) {
		test18 T = new test18();
		Scanner kb = new Scanner(System.in);
		
		System.out.println(T.solution(kb.nextLine()));
	}

}
