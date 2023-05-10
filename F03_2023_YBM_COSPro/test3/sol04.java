package test3;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol04 {
 public int solution(String s1, String s2) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     
     int len1 = s1.length();
     int len2 = s2.length();
     int len_sub = 0;
     
     for(int i=0; i<Math.min(len1, len2); i++) {
    	 String sub1 = s1.substring(len1-i-1, len1); 
    	 String sub2 = s2.substring(0, i+1); 
    	 if(sub1.equals(sub2))	len_sub = i+1;
     }
     
     answer = len1 + len2 - len_sub;
     return answer;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol04 sol = new sol04();
     String s1 = new String("ababc");
     String s2 = new String("abcdab");
     int ret = sol.solution(s1, s2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}