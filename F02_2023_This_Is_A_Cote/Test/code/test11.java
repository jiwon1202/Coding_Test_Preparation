package Chap04_Implementation;

import java.util.*;

class Move{
	public int time;
	public char dir;
	public Move(int time, char dir) {
		this.time = time;
		this.dir = dir;
	}
}

public class test11 {
	public int solution(int n, ArrayList<Move> arr, int[][] board) {
		int answer = 1;

		int[] head = {0,0};
		int[] tail = {0,0};
		
		int dir = 0;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		boolean isEnd = false;
		Queue<Point> history = new LinkedList<>();
		
		for(Move move : arr) {
			int time = move.time - answer;
			 
			while(time-- > 0) {
				int nx = head[1] + dx[dir];
				int ny = head[0] + dy[dir];
				
				if(nx<0 || nx>=n || ny<0 || ny>=n) {
					isEnd = true;
					break;
				}
				else if(nx == tail[1] && ny==tail[0]) {
					isEnd = true;
					break;
				}
				else {
					answer++;
					head[0] = ny;	head[1] = nx;
					history.add(new Point(head[1], head[0]));
					if(board[ny][nx] == 0) {	// 사과 x
						Point his = history.poll();
						tail[1] = his.x;
						tail[0] = his.y;
					}
					else {
						board[ny][nx] = 0;
					}
				}
			}

			if(move.dir == 'D')	dir = (dir+1) % 4;
			else				dir = (dir-1) % 4;
			
			if(isEnd)
				break;
		}
		
		while(!isEnd) {
			int nx = head[1] + dx[dir];
			int ny = head[0] + dy[dir];
			
			if(nx<0 || nx>=n || ny<0 || ny>=n) {
				break;
			}
			else if(nx == tail[1] && ny==tail[0]) {
				break;
			}
			else {
				answer++;
				head[0] = ny;	head[1] = nx;
				history.add(new Point(head[1], head[0]));
				if(board[ny][nx] == 0) {	// 사과 x
					Point his = history.poll();
					tail[1] = his.x;
					tail[0] = his.y;
				}
				else {
					board[ny][nx] = 0;
				}
			}
		}

		return answer + 1;
	}

	public static void main(String[] args) {
		test11 T = new test11();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<k; i++)
			board[kb.nextInt()- 1][kb.nextInt()- 1] = 1;
		int l = kb.nextInt();
		ArrayList<Move> arr = new ArrayList<>();
		for(int i=0; i<l; i++) 
			arr.add(new Move(kb.nextInt(), kb.next().charAt(0)));
		
		System.out.println(T.solution(n, arr, board));
	}

}
