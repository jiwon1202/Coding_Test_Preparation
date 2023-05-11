package test4;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol08 {
ArrayList<Integer> num_list = new ArrayList<Integer>();
static int max_level;
static int[] max_count;

public void sum(int L, int num, int[] current_count) {
	if(L == max_level) {
		num_list.add(num);
		return;
	}
	else {
		for(int i=1; i<=9; i++) {
			if(current_count[i] < max_count[i]) {
				current_count[i] += 1;
				sum(L+1, num * 10 + i, current_count);
				current_count[i] -= 1;
			}
		}
	}
}
	
 public int solution(int[] card, int n) {
     // 여기에 코드를 작성해주세요.
	 max_level = card.length;
	 max_count = new int[10];
	 for(int i=0; i<card.length; i++)
		 max_count[card[i]]++;
	 
	 sum(0, 0, new int[10]);
	 
	 for(int i=0; i<num_list.size(); i++) {
		 if(num_list.get(i) == n)
			 return i + 1;
	 }
     
     return -1;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol08 sol = new sol08();
     int card1[] = {1, 2, 1, 3};
     int n1 = 1312;
     int ret1 = sol.solution(card1, n1);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

     int card2[] = {1, 1, 1, 2};
     int n2 = 1122;
     int ret2 = sol.solution(card2, n2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }    
}