package Chap06_Sorting;

// 선택정렬
public class prob01 {
	public int[] solution(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			int min = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < min) {
					index = j;
					min = arr[j];
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
	
		return arr;
	}
	
	public static void main(String[] args) {
		prob01 T = new prob01();
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int x : T.solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
