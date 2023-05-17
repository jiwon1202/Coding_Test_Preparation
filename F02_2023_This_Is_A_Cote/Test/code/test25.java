package Chap06_Sorting;

import java.util.*;

class Game implements Comparable<Game> {
	public int stage;
	public double failure;
	
	public Game(int stage, double failure) {
		this.stage = stage;
		this.failure = failure;
	}
	
	@Override
	public int compareTo(Game other) {
		if(this.failure < other.failure)
			return 1;
		else if(this.failure > other.failure)
			return -1;
		else
			return this.stage - other.stage;
	}
}

public class test25 {
	public ArrayList<Integer> solution(int N, int[] stages) {
        int[] user_cnt = new int[N + 2];
        int[] user_total_cnt = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            user_cnt[stages[i]]++;
        }

        user_total_cnt[N] = user_cnt[N] + user_cnt[N + 1]; 
        for (int i = N-1; i >= 1; i--) {
            user_total_cnt[i] = user_cnt[i] + user_total_cnt[i + 1];
        }

        ArrayList<Game> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {

            if(user_total_cnt[i]==0){ 
                arr.add(new Game(i, 0));
                continue;
            }
            
            double rate = (double) user_cnt[i] / user_total_cnt[i];
            arr.add(new Game(i, rate));
        }
		
		Collections.sort(arr);
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(Game g : arr){
			answer.add(g.stage);
		}
			
		return answer;
	}

	public static void main(String[] args) {
		test25 T = new test25();
		
		int n1 = 5;
		int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(T.solution(n1 ,stages1));
		
		int n2 = 4;
		int[] stages2 = {4,4,4,4,4};
		System.out.println(T.solution(n2 ,stages2));
	}

}
