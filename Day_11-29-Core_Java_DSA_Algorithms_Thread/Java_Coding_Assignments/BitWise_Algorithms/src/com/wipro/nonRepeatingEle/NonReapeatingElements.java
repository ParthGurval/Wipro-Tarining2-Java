package com.wipro.nonRepeatingEle;

public class NonReapeatingElements {

	public static void nonReapElements(int[] arr) {
		
		int xorNum = 0, num1 = 0, num2 = 0;
		
		for(int num : arr) {
			
			xorNum ^= num;
		}
		
		int rMostBit = xorNum & (-xorNum);
		
		for(int num : arr) {
			
			if((num & rMostBit) == 0) {
				
				num1 ^= num;
			}
			
			else {
				
				num2 ^= num;
			}
		}
		
		System.out.println("The two Non-Repeating Elements are: " + num1 + " & "+ num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 3, 7, 9, 11, 2, 3, 11 };
		
		nonReapElements(array);
	}

}
