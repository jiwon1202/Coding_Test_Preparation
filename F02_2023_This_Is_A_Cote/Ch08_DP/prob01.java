package Chap08_DP;

public class prob01 {
	public int fibo(int x) {
		if(x==1 || x==2)
			return 1;
		return fibo(x-1) + fibo(x-2);
	}

	public static void main(String[] args) {
		prob01 T = new prob01();
		int n = 45;
		
		long start = System.currentTimeMillis();
		System.out.println(T.fibo(n));
		System.out.println(System.currentTimeMillis() - start);
	}

}
