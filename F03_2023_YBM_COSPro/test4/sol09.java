package test4;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol09 {
 public String solution(int hour, int minute) {
     // 여기에 코드를 작성해주세요.
     String answer = "";
    
     hour %= 12;
     double rad_hour = (hour * 60.0 + minute) / 720.0;
     double rad_min = minute * 6.0 / 360.0;
     double n_answer = Math.abs(rad_hour - rad_min);
     n_answer *= 360.0;
     if(n_answer > 180)	n_answer = 360.0 - n_answer;
     
     answer = String.format("%.1f", n_answer);

     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol09 sol = new sol09();
     int hour = 3;
     int minute = 15;
     String ret = sol.solution(hour, minute);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}