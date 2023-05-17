package Chap04_Implementation;

import java.util.*;

class Info {
	public int time;
	public char d;
	public Info(int time, char d) {
		this.time = time;
		this.d = d;
	}
}

public class sol11 {
	public int turn(int direction, char c) {
		if (c=='L')
			return 	(direction - 1) % 4;
		else
			return	(direction + 1) % 4;
	}
	
	public int solution(int l, int n, int[][] data, ArrayList<Info> info) {
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		int time = 0;
		int direction = 0;
		int index = 0;
		
		int x = 1;
		int y = 1;
		data[x][y] = 2;
		
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y));
		
		while(true) {
			int nx = x + dx[direction];
			int ny = y + dy[direction];
			
			if(1<=nx && nx<=n && 1<=ny && ny<=n && data[nx][ny] != 2) {
				q.add(new Point(nx, ny));
				if (data[nx][ny] == 0) {
					Point tmp = q.poll();
					data[tmp.x][tmp.y] = 0;
				}
				data[nx][ny] = 2;
			}
			else {
				time += 1;
				break;
			}
			x = nx;	y = ny;
			time++;
			
			if (index < l && info.get(index).time == time) {
				direction = turn(direction, info.get(index).d);
				index++;
			}
		}
		
		return time;
	}

	public static void main(String[] args) {
		sol11 T = new sol11();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[][] data = new int[n+1][n+1];
		for(int i=0; i<k; i++)
			data[kb.nextInt()][kb.nextInt()] = 1;
		
		int l = kb.nextInt();
		ArrayList<Info> info = new ArrayList<>();
		for(int i=0; i<l; i++)
			info.add(new Info(kb.nextInt(), kb.next().charAt(0)));

		System.out.println(T.solution(l, n, data, info));
	}

}
