package test2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol06 {
    public int[] solution(String commands) {
        // 여기에 코드를 작성해주세요.
        int[] answer = {0, 0};
        
        for(char ch : commands.toCharArray()) {
        	switch(ch) {
        	case 'U':	answer[1]++;	break;
        	case 'R':	answer[0]++;	break;
        	case 'D':	answer[1]--;	break;
        	case 'L':	answer[0]--;	break;
        	}
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	sol06 sol = new sol06();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}