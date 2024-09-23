package com.wipro.linearSearch;

public class LinearSearchExp {

	public static int linSearch(int[] array, int x) {
		
		for(int i=0; i<=array.length; i++) {
			
			if(array[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {0, 5, 10, 15, 20, 900, 25, 50, 100, 150, 200, 75, 400};
		
		int x = 200;
		
		int res = linSearch(num, x);
		
		if(res != -1) {
			System.out.println("The given number "+x+" found at index is: "+res);
		}
		else {
			System.out.println("Number is not present in the array");
		}
		
	}

}
