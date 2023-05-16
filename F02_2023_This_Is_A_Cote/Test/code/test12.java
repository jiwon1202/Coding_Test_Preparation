package Chap04_Implementation;

import java.util.*;

class Result implements Comparable<Result>{
	public int a, b, c;
	public Result(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public int compareTo(Result other) {
		if (this.a != other.a)
			return this.a - other.a;
		else if (this.b != other.b)
			return this.b - other.b;
		else 
			return this.c - other.c;
	}
}

public class test12 {
	public int[][] solution(int n, int[][] build_frame) {
		int[][] gidung = new int[n+1][n+1];
		int[][] bo = new int[n+1][n+1];

		ArrayList<Result> arr = new ArrayList<>();
		
		for(int[] info : build_frame) {
			int a = info[0];
			int b = info[1];
			int type = info[2];
			int mode = info[3];
			
			if(mode == 0) {	// 철거
				if() {
					Iterator<Result> itr = arr.iterator();
					while(itr.hasNext()) {
						Result tmp = itr.next();
						
						if(tmp.a == a && tmp.b == b && tmp.c == type) {
							arr.remove(tmp);
							break;
						}
					}
				}
			}
			else {			// 설치
				if(type == 0) {		// 기둥
					if(b == 0 || bo[a][b] == 1 || gidung[a][b] == 1) {
						arr.add(new Result(a, b, type));
						bo[a][b+1] = 1;
						gidung[a][b+1] = 1;
					}
				}
				else {				// 보 
					if(gidung[a+1][b] == 1 || gidung[a][b] == 1 || (bo[a][b] == 1 && bo[a][b+1] == 1)) {
						arr.add(new Result(a, b, type));
						gidung[a][b] = 1;
						gidung[a+1][b] = 1;
						bo[a][b] = 1;
						bo[a+1][b] = 1;
					}
				}
			}
			
		}
		
		Collections.sort(arr);
		
		int[][] answer = new int[arr.size()][3];
		for(int i=0; i<arr.size(); i++) {
			answer[i][0] = arr.get(i).a;
			answer[i][1] = arr.get(i).b;
			answer[i][2] = arr.get(i).c;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		test12 T = new test12();
		Scanner kb = new Scanner(System.in);
		
		int n = 5;
		int[][] build_frame = {{1,0,0,1}, {1,1,1,1}, {2,1,0,1}, {2,2,1,1},
				{5,0,0,1}, {5,1,0,1}, {4,2,1,1},{3,2,1,1}};
		int[][] result = T.solution(n, build_frame);
		for(int[] arr : result) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] build_frame2 = {{0,0,0,1}, {2, 0, 0, 1}, {4, 0, 0, 1}, {0,1,1,1},
				{1,1,1,1}, {2,1,1,1}, {3,1,1,1}, {2,0,0,0}, {1,1,1,0,}, {2,2,0,1}};
		int[][] result2 = T.solution(n, build_frame2);
		for(int[] arr : result2) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
