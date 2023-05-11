package test4;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol10 {
 public int solution(int a, int b) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     
     ArrayList<Integer> arr_prime = new ArrayList<>();
     int[] ch = new int[b];
     
     for(int num=2; num<b; num++) {
    	 if(ch[num] == 0) {
    		 boolean isPrime = true;
        	 for(int i=2; i<num; i++) {
        		 if(num % i == 0) {
        			 isPrime = false;
        			 break;
        		 }
        	 }
        	 if(isPrime) {
        		 arr_prime.add(num);
        		 for(int i=num; i<b; i+=num) {
        			 ch[i] = 1;
        		 }
        	 }
    	 }
     }
     
     ArrayList<Integer> arr_num = new ArrayList<>();
     for(int p : arr_prime) {
    	 int num = p*p;
    	 if(num > b)	break;
    	 if(a <= num && num <= b && !arr_num.contains(num))
    		 arr_num.add(num);
    	 
    	 num = p*p*p;
    	 if(a <= num && num <= b && !arr_num.contains(num))
    		 arr_num.add(num);
     }
     answer = arr_num.size();
     
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args){
	 sol10 sol = new sol10();
     int a = 6;
     int b = 30;
     int ret = sol.solution(a, b);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}