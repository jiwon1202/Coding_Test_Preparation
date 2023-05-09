package test2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class sol05 {
    public int solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int sIdx = 0;
        int eIdx = 0;
        
        while(eIdx < arr.length) {
        	if (sIdx == eIdx)
        		eIdx++;
        	else if(arr[eIdx-1] < arr[eIdx]) {
        		eIdx++;
        		answer = Math.max(answer, eIdx - sIdx);
        	}
        	else {
        		sIdx = eIdx;
        	}
        }

        return Math.max(answer, 1);
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	sol05 sol = new sol05();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
        
        int[] arr2 = {3, 1, 2, 4, 5, 3, 2, 1, 2, 2, 3, 4, 5, 6, 1};
        int ret2 = sol.solution(arr2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
        int[] arr3 = {2, 1};
        int ret3 = sol.solution(arr3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }
}