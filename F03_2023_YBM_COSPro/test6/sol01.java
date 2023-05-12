package test6;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Info {
	public int x;
	public int y;
	public int level;
	
	public Info(int x, int y, int level) {
		this.x = x;
		this.y = y;
		this.level = level;
	}
}

class sol01 {
 public int solution(int n, int[][] garden) {
     // 여기에 코드를 작성해주세요.
     int answer = 0;
     
     Queue<Info> Q = new LinkedList<>();
     for(int i=0; i<n; i++) {
    	 for(int j=0; j<n; j++) {
    		 if(garden[i][j] == 1) {
    			 Q.add(new Info(i, j, 0));
    		 }
    	 }
     }
     
     int[] dx = {1, 0, -1, 0};
     int[] dy = {0, 1, 0, -1};
     while(!Q.isEmpty()) {
    	 Info cur = Q.poll();
    	 
    	 for(int i=0; i<4; i++) {
    		 int nx = cur.x + dx[i];
    		 int ny = cur.y + dy[i];
    		 if(nx>=0 && nx<n && ny>=0 && ny<n && garden[nx][ny] == 0) {
    			 garden[nx][ny] = 1;
    			 Q.offer(new Info(nx, ny, cur.level+1));
    			 answer = cur.level+1;
    		 }
    	 }
     }
     
     return answer;
 }
 
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
	 sol01 sol = new sol01();
     int n1 = 3;
     int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
     int ret1 = sol.solution(n1, garden1);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
     
     int n2 = 2;
     int[][] garden2 = {{1, 1}, {1, 1}};
     int ret2 = sol.solution(n2, garden2);
     
     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
     
 }    
}