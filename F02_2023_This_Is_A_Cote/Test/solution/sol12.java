package Chap04_Implementation;

import java.util.*;

class Structure implements Comparable<Structure>{
	public int x, y, stuff;
	public Structure(int x, int y, int stuff) {
		this.x = x;
		this.y = y;
		this.stuff = stuff;
	}
	@Override
	public int compareTo(Structure other) {
		if (this.x != other.x)
			return this.x - other.x;
		else if (this.y != other.y)
			return this.y - other.y;
		else 
			return this.stuff - other.stuff;
	}
}

public class sol12 {
	public boolean possible(ArrayList<Structure> arr) {
		for(Structure s : arr) {
			int x = s.x;
			int y = s.y;
			int stuff = s.stuff;
			if(stuff == 0) {
				if(y==0 || arr.contains(new Structure(x-1, y, 1)) || 
						arr.contains(new Structure(x, y, 1)) || arr.contains(new Structure(x, y-1, 0)))
					continue;
				return false;
			}
			else {
				System.out.println(arr.contains(new Structure(x, y-1, 0)));
				if(arr.contains(new Structure(x, y-1, 0)) || arr.contains(new Structure(x+1, y-1, 0)) || 
						arr.contains(new Structure(x-1, y, 1)) || arr.contains(new Structure(x+1, y, 1)))
					continue;
				return false;
			}
		}
		
		
		return true;
	}
	
	public int[][] solution(int n, int[][] build_frame) {
		ArrayList<Structure> arr = new ArrayList<>();
		
		for(int[] frame : build_frame) {
			int x = frame[0];
			int y = frame[1];
			int stuff = frame[2];
			int operate = frame[3];
			if(operate == 0) {
				Iterator<Structure> iterator = arr.iterator();
				while(iterator.hasNext()) {
					Structure str = iterator.next();
					if(str.x == x && str.y == y && str.stuff == stuff) {
						iterator.remove();
						break;
					}
				}
				
				if (!possible(arr)) {
					arr.add(new Structure(x, y, stuff));
				}
 			}
			else {
				arr.add(new Structure(x, y, stuff));
				
				if (!possible(arr)) {
					System.out.println(x + " " + y + " " + stuff);
					
					Iterator<Structure> iterator = arr.iterator();
					while(iterator.hasNext()) {
						Structure str = iterator.next();
						if(str.x == x && str.y == y && str.stuff == stuff) {
							iterator.remove();
							break;
						}
					}
				}
			}
		}
		
		Collections.sort(arr);
		int[][] answer = new int[arr.size()][3];
		for(int i=0; i<arr.size(); i++) {
			answer[i][0] = arr.get(0).x;
			answer[i][1] = arr.get(0).y;
			answer[i][2] = arr.get(0).stuff;
		}
		return answer;
	}

	public static void main(String[] args) {
		sol12 T = new sol12();
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
	}

}
