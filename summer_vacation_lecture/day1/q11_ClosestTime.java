package main1;

import java.util.*;

public class q11 {
	// 문자열 형태의 시간을 분 단위 정수형으로 바꿔 반환하는 함수
	public int getTime(String time) {
		String[] tmp = time.split(":");
		int H = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		return H * 60 + M;
	}
	public int Solution(String[] times) {
		ArrayList<Integer> tmp = new ArrayList<>();
		
		// 정수형으로 tmp에 저장한 후 정렬
		for (String x : times)
			tmp.add(getTime(x));
		Collections.sort(tmp);

		int answer = (24 * 60 + tmp.get(0)) - tmp.get(tmp.size() - 1);
		for (int i=0; i<tmp.size()-1; i++)
			answer = Math.min(answer, tmp.get(i+1)-tmp.get(i));
		
		return answer;
	}
	public static void main(String args[]) {
		q11 T = new q11();
		// String[] tmp = new String[] {"00:12", "00:00", "01:05", "00:57"};
		// String[] tmp = new String[] {"00:00", "23:59", "00:00"};
		String[] tmp = new String[] {"23:59", "00:00", "23:57"};
		System.out.println(T.Solution(tmp));
	}
}
