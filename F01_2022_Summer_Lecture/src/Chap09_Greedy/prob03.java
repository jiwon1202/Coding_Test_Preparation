package chap09;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class Time implements Comparable<Time>{
    public int time;
	public char state;
	
    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }
    
    @Override
    public int compareTo(Time ob){
        if(this.time==ob.time)
        	return this.state-ob.state;
		else
			return this.time-ob.time;
    }
}

public class prob03 {
	public int solution(ArrayList<Time> arr){
		int answer=Integer.MIN_VALUE;
		Collections.sort(arr);
		
		int cnt=0;
		for(Time ob : arr){
			if(ob.state=='s') cnt++;
			else cnt--;
			answer=Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int sT=kb.nextInt();
			int eT=kb.nextInt();
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}
		
		System.out.println(T.solution(arr));
	}

}
