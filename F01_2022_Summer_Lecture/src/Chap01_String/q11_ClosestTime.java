package Chap01_String;

import java.util.*;

public class q11_ClosestTime {
	// 문자열 형태의 시간을 분 단위 정수형으로 바꿔 반환하는 함수
	public int getTime(String time) {
		String[] tmp = time.split(":");
		int H = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		return H * 60 + M;
	}
	public int Solution(String[] times) {
		ArrayList<Integer> tmp = new ArrayList<>();
		
		// 문자열로 저장된 시간을 정수형으로 tmp에 저장
		for (String x : times)
			tmp.add(getTime(x));
		
		// Collections.sort(): 주로 list, set 등 컬렉션을 정렬할 때 사용하는 함수(디폴트: 오름차순)
		Collections.sort(tmp);
		
		// answer 초기화: 제일 이른 시간과 제일 늦은 시간의 차도 고려해야 하기 때문에 아래와 같이 작성
		int answer = (24 * 60 + tmp.get(0)) - tmp.get(tmp.size() - 1);
		
		// 그 후 (현재 시간 - 다음 시간) 값과 answer 값을 비교하며 최솟값 탐색
		for (int i=0; i<tmp.size()-1; i++)
			answer = Math.min(answer, tmp.get(i+1)-tmp.get(i));
		
		return answer;
	}
	public static void main(String args[]) {
		q11_ClosestTime T = new q11_ClosestTime();
		System.out.println(T.Solution(new String[] {"00:12", "00:00", "01:05", "00:57"}));
		System.out.println(T.Solution(new String[] {"00:00", "23:59", "00:00"}));
		System.out.println(T.Solution(new String[] {"23:59", "00:00", "23:57"}));
	}
}
