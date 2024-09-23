package com.wipro.KnapSack;

public class KnapSackAlgo {

	public static int knapSack(int[] weight, int[] value, int capacity) {
		
		int n = weight.length;
		int[] dp = new int[capacity + 1];
		
		for(int i = 0; i < n; i++) {
			
			for(int w = capacity; w >= weight[i]; w--) {
				
				dp[w] = Math.max(dp[w], value[i] + dp[w - weight[i]]);
			}
		}
		
		return dp[capacity];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] weight = {2, 3, 4, 5};
		int[] values = {3, 4, 5, 6};
		int capacity = 5;
		
		int maxProfit = knapSack(weight, values, capacity);
		System.out.println("MAX Profit is: " + maxProfit);
	}

}
