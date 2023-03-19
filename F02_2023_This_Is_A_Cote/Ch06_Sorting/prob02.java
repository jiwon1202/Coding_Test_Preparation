package Chap06_Sorting;

// 삽입 정렬
public class prob02 {
	public int[] solution(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		prob02 T = new prob02();
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int x : T.solution(arr)) {
			System.out.print(x + " ");
		}
	}
}
