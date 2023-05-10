package test3;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol03 {
 public int solution(String[] bishops) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;

     int[][] ch = new int[8][8];
     for(String pos : bishops) {
    	 int pos_i = 8 - (pos.charAt(1) - '0');
    	 int pos_j = 8 - (pos.charAt(0) - 'A' + 1);
    	 if(ch[pos_i][pos_j] == 0) {
    		 answer++;
        	 ch[pos_i][pos_j] = 1;
    	 }

    	 for(int n=-7; n<=7; n++) {
    		 int ni = pos_i + n;
    		 int nj = pos_j + n;
    		 if(ni>=0 && ni<8 && nj>=0 && nj<8 && ch[ni][nj]==0) {
    			 ch[ni][nj] = 1;
    			 answer++;
    		 }
    		 nj = pos_j - n;
    		 if(ni>=0 && ni<8 && nj>=0 && nj<8 && ch[ni][nj]==0) {
    			 ch[ni][nj] = 1;
    			 answer++;
    		 }
    	 }
     }
    
     return 64 - answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol03 sol = new sol03();
     String[] bishops1 = {new String("D5")};
     int ret1 = sol.solution(bishops1);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

     String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
     int ret2 = sol.solution(bishops2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}