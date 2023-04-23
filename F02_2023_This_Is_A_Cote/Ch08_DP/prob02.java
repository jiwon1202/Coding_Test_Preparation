package Chap08_DP;

public class prob02 {
	static int[] arr = new int[100];
	
	public int fibo(int x) {
		if(x==1 || x==2)
			return 1;
		if(arr[x] != 0)
			return arr[x];
		
		return arr[x] = fibo(x-1) + fibo(x-2);
	}

	public static void main(String[] args) {
		prob02 T = new prob02();
		int n = 45;
		
		long start = System.currentTimeMillis();
		System.out.println(T.fibo(n));
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
