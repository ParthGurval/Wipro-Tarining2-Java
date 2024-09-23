package com.wipro.BitSwapping;

public class SwapBits {
	
	static int swappingBits(int x, int p1, int p2, int n) {
		
		int set1 = (x >> p1) & ((n << 1) - 1);
		int set2 = (x >> p2) & ((n << 1) - 1);
		
		int xor = set1 ^ set2;
		
		xor = (xor << p1) | (xor << p2);
		
		return x ^ xor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number  = 28;
		int p1 = 0, p2 = 3, n = 2;
		
		System.out.print("Original Number: " + number);
		int res = swappingBits(number, p1, p2, n);
		System.out.println("\nNumber after swapping: " + res);
	}

}
