package Chap02_Array;

public class q07_NumberOfKey {
	public int Solution(String s, int limit) {
		int[] used = new int[27];
		for(int x : s.toCharArray()) {
			if ((97 <= x) && (x <= 122)) {
				used[x-97] = 1;
			}
			else if ((65 <= x) && (x <= 90)) {
				used[26] = 1;	// 대문자를 만들기 위한 쉬프트 키도 카운팅
				used[x-65] = 1;
			}
		}
		
		int cnt = 0;
		for (int i=0; i<27; i++)
			if(used[i] == 1) 
				cnt++;
		
		if(cnt <= limit)
			return s.length();
		else
			return -1;
	}
	public static void main(String[] args) {
		q07_NumberOfKey T = new q07_NumberOfKey();
		System.out.println(T.Solution("time to time", 5));
		System.out.println(T.Solution("time to study", 7));
		System.out.println(T.Solution("Big life is Good", 10));
		System.out.println(T.Solution("Life is Good", 7));
	}
}
