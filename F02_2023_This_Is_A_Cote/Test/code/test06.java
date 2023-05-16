package Chap03_Greedy;

public class test06 {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        
        int len = food_times.length;
        int index = 0;
        while(--k >= 0){
            if(food_times[index] == 0) {
                while(food_times[index] <= 0) {
                    index = (index+1) % len;
                }
            }
            
            food_times[index]--;
            index = (index+1) % len;
        }
        
        if(food_times[index] == 0) {
            while(food_times[index] <= 0) {
                index = (index+1) % len;
            }
        }
        
        return index+1;
    }
    }
	
	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/42891?language=java
		
	}

}
