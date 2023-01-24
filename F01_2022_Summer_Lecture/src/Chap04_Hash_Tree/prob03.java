package chap04;

import java.util.*;

public class prob03 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		/* 직접 짜본 코드
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		answer.add(map.size());
		
		for(int i=k; i<n; i++) {
			if(map.get(arr[i-k]) > 1) {
				map.put(arr[i-k], map.get(arr[i-k])-1);
			}
			else {
				map.remove(arr[i-k]);
			}
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			answer.add(map.size());
		}*/
		
		//강사님 코드
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			
			if(map.get(arr[lt]) > 1) {
				map.put(arr[lt], map.get(arr[lt])-1);
			}
			else {
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);

		int n =kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
