package com.wipro.AndSubsets;

public class BitWiseAndSubset {

	static int sumOfANDSubset(int[] arr) {
		
		int n = arr.length;
		int result = 0;
		
		for(int bit = 0; bit < 32; bit++) {
			
			int bitMask = 1 << bit;
			int subsetCount = 0;
			
			for(int num : arr) {
				
				if((num & bitMask) != 0) {
					
					subsetCount++;
				}
			}
			
			int bitContribute = subsetCount * (1 << bit);
			result += bitContribute;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
	
		System.out.println("Sum of the Bitwise AND for array a1 = {1, 2, 3} is: " + sumOfANDSubset(arr1));
		System.out.println("Sum of the Bitwise AND for array a2 = {1, 2, 3, 4} is: " + sumOfANDSubset(arr2));
	}

}
