package com.wipro.LongestIncreasingSubSequence;

import java.util.Arrays;

public class LongestIncreasingSub {
	
	static int lis(int[] arr) {
		
		int n = arr.length;
		
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		
		for(int i = 1; i < n; i++) {
			
			for(int j = 0; j < i; j++) {
				
				if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					
					dp[i] = dp[j] + 1;
				}
				
				//debug
			//	System.out.println("dp[" + i + "] = " + dp[i]);
			}
		}
		
		int lisLen = 0;
		
		for(int i = 0;  i < n; i++) {
			
			lisLen = Math.max(lisLen, dp[i]);
		}
		
		
		//debug
	//	System.out.println("\nFinal DP Array: ");
	//	System.out.println(Arrays.toString(dp));
		
		return lisLen;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
		
		System.out.println("\nLength of LIS is: " + lis(arr));
		
		int[] arr1 = {50, 3, 10, 7, 40, 80};
		
		System.out.println("\nLength of LIS is: " + lis(arr1));
	}

}
