package test1;

// You may use import as below.
import java.util.*;

class sol02 {
    public int solution(int n) {
        // Write code here.
        int answer = 0;
        
        // 1
        int num = 1;
        int[][] arr = new int[n][n];
    	int i=0;
    	int j=0;
    	int step = 1;
    	
        while(true) {
        	for(; j<n-i; j++)	arr[i][j] = num++;
        	j--;
        	i++;
        	if(num==n*n + 1)	break;
        	
        	for(; i<j; i++) 	arr[i][j] = num++;
        	
        	for(; j>=step-1; j--)	arr[i][j] = num++;
        	j++;
        	i--;
        	
        	for(; i>=step; i--)	arr[i][j] = num++;
        	i++;
        	j++;
        	
        	step++;
        }

	    for(int a=0; a<n; a++)	answer += arr[a][a];
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	sol02 sol = new sol02();
        int n1 = 5;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}