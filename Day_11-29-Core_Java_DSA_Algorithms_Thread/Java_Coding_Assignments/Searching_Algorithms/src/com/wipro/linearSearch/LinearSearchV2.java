package com.wipro.linearSearch;

import java.util.*;

public class LinearSearchV2 {
	
	public static int linSearch(int[] array, int x) {
		
		for(int i=0; i<=array.length; i++) {
			
			if(array[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {0, 5, 10, 15, 20, 900, 25, 50, 100, 150, 200, 75, 400};
		
		System.out.print("Enter the number you want to found its index from array: ");
		int x = sc.nextInt();
		
		
		int res = linSearch(num, x);
		
		if(res != -1) {
			System.out.println("The given number "+x+" found at index is: "+res);
		}
		else {
			System.out.println("Number is not present in the array");
		}
	}

	
	
}

