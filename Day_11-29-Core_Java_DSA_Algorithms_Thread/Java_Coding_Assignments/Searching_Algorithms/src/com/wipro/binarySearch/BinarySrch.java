package com.wipro.binarySearch;

import java.util.*;

public class BinarySrch {
	
	public static int binSearch(int[] array, int num) {
		
		int low = 0;
		int high = array.length-1;
		
		while(low <= high) {
			
			int mid = low + (high - low) / 2;
			
			if(array[mid] == num) {
				return mid;
			}
			
			else if(array[mid] < num) {
				low = mid + 1;
			}
			
			else {
				high = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {0, 5, 10, 15, 20, 25, 50, 75, 100, 150, 200, 400, 900};
		
		System.out.print("Please enter the number you want to search: ");
		int num = sc.nextInt();
	
		int res = binSearch(arr, num);
		
		if(res != -1) {
			
			System.out.println("The Number "+num+" Found in the array at index: "+res);
		}
		else {
			System.out.println("The number is not present in the array");
		}
	}

}
