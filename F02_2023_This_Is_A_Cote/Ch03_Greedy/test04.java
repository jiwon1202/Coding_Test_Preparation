package Chap03_Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class test04 {
	ArrayList<Integer> arr;
	
	public void getSum(int[] coins, int[] coin_count, int sum) {
		if(!arr.contains(sum))
			arr.add(sum);
		
		for(int num : coins) {
			if(coin_count[num] > 0) {
				coin_count[num]--;
				getSum(coins, coin_count, sum+num);
				coin_count[num]++;
			}
		}
	}
	
	public int solution(int n, int[] coins) {
		Arrays.sort(coins);	
		int max = coins[n-1];

		int[] coin_count = new int[max+1];
		for(int num : coins)
			coin_count[num]++;
		
		arr = new ArrayList<>();
		getSum(coins, coin_count, 0);
		
		Collections.sort(arr);
		for(int i=1; i<=coins[n-1]; i++)
			if(!arr.contains(i))
				return i;
		
		return max * n + 1;
	}
	
	public static void main(String[] args) {
		test04 T = new test04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] coins = new int[n];
		for(int i=0; i<n; i++)	coins[i] = kb.nextInt();
		
		System.out.println(T.solution(n, coins));
	}
}
