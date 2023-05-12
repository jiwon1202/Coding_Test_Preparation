package test5;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol09 {
	public int solution(int number, int target) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(number);
		int[] level = new int[10001];
		level[number] = 1;
		int[] arr = {0, 1, -1};
		
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			
			if(cur == target) 
				break;
			
			arr[0] = cur;
			for(int x : arr) {
				int num = cur + x;
				if(num >= 0 && num <= 100000 && level[num] == 0) {
					level[num] = level[cur] + 1;
					Q.offer(num);
				}
			}
		}
		
		answer = level[target] - 1;
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol09 sol = new sol09();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}