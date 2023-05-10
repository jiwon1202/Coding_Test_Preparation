package test3;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol05 {
 public String solution(String phrases, int second) {
     // 여기에 코드를 작성해주세요.
     String answer = "";
     second %= 28;
     
     if(second <= 14) {
    	 for(int i=0; i<14-second; i++)	answer += "_";
    	 answer += phrases.substring(0, second);
     }
     else {
    	 answer += phrases.substring(second - phrases.length());
    	 for(int i=0; i<14-(28-second); i++)	answer += "_";
     }
     
     return answer;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol05 sol = new sol05();
     String phrases = new String("happy-birthday");
     int second = 28;
     String ret = sol.solution(phrases, second);
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}