package Chap06_Sorting;

public class prob03 {
	static int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
	
	public void sort(int s, int e) {
		if (s >= e)
			return;
		
		int p = s;
		int lt = s + 1;
		int rt = e;
		int temp;
		
		while(lt <= rt) {
			while(lt <= e && arr[lt] <= arr[p]) {
				lt++;
			}
			while(rt > s && arr[rt] >= arr[p]) {
				rt--;
			}
			if(lt > rt) {
				temp = arr[rt];
				arr[rt] = arr[p];
				arr[p] = temp;
			}
			else {
				temp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = temp;
			}
		}
		
		sort(s, rt-1);
		sort(rt+1, e);
	}
	
	public void solution() {
		sort(0, arr.length-1);
	}

	public static void main(String[] args) {
		prob03 T = new prob03();
		T.solution();
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}

}
