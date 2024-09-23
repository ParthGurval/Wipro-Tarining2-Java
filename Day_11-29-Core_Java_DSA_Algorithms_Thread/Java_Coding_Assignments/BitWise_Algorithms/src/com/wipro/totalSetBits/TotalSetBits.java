package com.wipro.totalSetBits;

public class TotalSetBits {
	
	static int totalSetBits(int n) {
		
		int totSetBits = 0;
		
		for(int i = 0; i <= n; i++) {
			
			totSetBits += Integer.bitCount(i);
		}
		
		return totSetBits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		
		int res = totalSetBits(num);
		
		System.out.print("Total set bit from 1 to " + num + " is: " + res);
	}

}
