package Chap04_Implementation;

import java.util.ArrayList;

class Point{
	public int x;
	public int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class test10 {
	public boolean solution(int[][] key, int[][] lock) {
		int home_cnt = 0;
		int len_l = lock.length;
		for(int i=0; i<len_l; i++) {
			for(int j=0; j<len_l; j++) {
				if(lock[i][j] == 0)
					home_cnt++;
			}
		}
		
		int len_k = key.length;
		ArrayList<Point> arr = new ArrayList<Point>();
		for(int i=0; i<len_k; i++) {
			for(int j=0; j<len_k; j++) {
				if(key[i][j] == 1)
					arr.add(new Point(i, j));
			}
		}
		
		int rotation = 4;
		while(rotation-- > 0) {
			int cnt = -1;
			for(int dx=-len_l+1; dx<len_l; dx++) {
				for(int dy=-len_l+1; dy<len_l; dy++) {
					cnt = 0;
                    boolean check = true;
					for(int i=0; i<arr.size(); i++) {
						int nx = arr.get(i).x + dx;
						int ny = arr.get(i).y + dy;
						if(nx >=0 && nx<len_l && ny>=0 && ny<len_l) {
							if(lock[nx][ny] == 1) {
								check = false;
								break;
							}
							else {
								cnt++;
							}
						}
					}
                    
                    if(check && cnt == home_cnt)
                        return true;
				}
			}

			for(int i=0; i<arr.size(); i++) {
				arr.set(i, new Point(arr.get(i).y, len_k - arr.get(i).x + 1));
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		test10 T = new test10();
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1,1,1}, {1,1,0}, {1,0,1}};

		System.out.println(T.solution(key, lock));
	}

}
