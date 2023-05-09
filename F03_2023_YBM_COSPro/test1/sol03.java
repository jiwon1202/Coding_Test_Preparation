package test1;

//You may use import as below.
//import java.util.*;

class sol03 {
 public int solution(String pos) {
     // Write code here.
     int answer = 0;
     
     int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
     int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
     int pos_x = Integer.valueOf(pos.charAt(0) - 64); 
     int pos_y = Integer.valueOf(pos.charAt(1) - 48); 
     
     for(int i=0; i<8; i++) {
    	 int nx = pos_x + dx[i];
    	 int ny = pos_y + dy[i];
    	 if(nx>0 && nx <= 8 && ny>0 && ny<=8)
    		 answer++;
     }
     
     return answer;
 }

 // The following is main method to output testcase.
 public static void main(String[] args) {
	 sol03 sol = new sol03();
     String pos = "H7";
     int ret = sol.solution(pos);

     // Press Run button to receive output. 
     System.out.println("Solution: return value of the method is " + ret + " .");
 }
}