package test1;

import java.util.*;

class sol01 {
    public long solution(long num) {
        long answer = num + 1;
        
        // String.valueOf 함수 중요!
        while(String.valueOf(answer).contains("0")) { 
        	answer++;
        }
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	sol01 sol = new sol01();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}