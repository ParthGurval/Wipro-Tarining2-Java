package com.wipro.QuickSort;

public class QuickSortExp {
	
	// Method to partition the array into two sub-arrays
	public static int partition(int[] array, int low, int high) {
		
		int pivot = array[high]; // Choose the last element as the pivot
		int i = (low - 1); // Initialize the index for the smaller element
		
		// Traverse through the array and partition it
		for(int j = low; j < high; j++) {
			
			// If the current element is smaller than or equal to the pivot
			if(array[j] <= pivot) {
				
				i++; // Increment the index of the smaller element
				
				// Swap the current element with the element at the i-th position
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}	
		}
		
		// Swap the pivot element with the element at i + 1
		int temp =  array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		 // Return the partition index
		return i + 1;
	}
	
	 // Method to perform QuickSort on the array
	public static void quickSort(int[] array, int low, int high) {
		
		// Check if there are more than one elements to sort
		if(low < high) {
			
			// Get the partition index
			int pi = partition(array, low, high);
			
			// Recursively sort elements before and after the partition
			quickSort(array, low, pi - 1); // Sort the left sub-array
			quickSort(array, pi + 1, high); // Sort the right sub-array
		}
	}
	
	public static void printArr(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {89, 68, 21, 10, 45, 20, 9, 53, 24, 98, 90}; 
		int l = num.length;
		
		System.out.println("The Original Array is: ");
		
		printArr(num);
		
		quickSort(num, 0, l-1);
		
		System.out.println("\nThe Quick Sorted Array is: ");
		
		printArr(num);
		
	}

}
