package com.wipro.bubbleSort;

public class bubbleSortingExp {
	
	// Method to perform Bubble Sort on an array
	public static void bubbleSort(int[] array) {
		
		int n = array.length;
		boolean swapped; // Flag to check if any elements were swapped
		
		// Traverse through all array elements
		for(int i = 0; i < n - 1; i++) {
			
			swapped = false; // Reset swapped flag for this pass
			
			// Perform the comparisons and swaps
			for(int j = 0; j < n - i - 1; j++) {
				
				// Perform the comparisons and swaps
				if(array[j] > array[j+1]) {
					
					// Swap if the current element is greater than the next
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					swapped = true; // Set swapped flag to true
				}
			}
			
			 // If no elements were swapped, the array is already sorted
			if(!swapped) break;
		}
	}
	
	
	public static void printArr(int[] arr, int size) {
		
		for(int i = 0; i < size ; i++) {
			System.out.print(arr[i] + " ");
//			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {89, 68, 21, 10, 45, 20, 9, 53, 24, 98, 90}; 
		int l = num.length;
		
		
		System.out.println("The Original Array is: ");
//		
//		for(int orgArr : num) {
//			System.out.println(orgArr+" ");
//		}
		
		printArr(num, l);
		
		System.out.println();
		
		bubbleSort(num);
		
		System.out.println("\nThe Bubble Sorted Array is: ");
//		
//		for(int sortedArr : num) {
//			System.out.println(sortedArr + " ");
//		}
		
		printArr(num, l);
	}

}
