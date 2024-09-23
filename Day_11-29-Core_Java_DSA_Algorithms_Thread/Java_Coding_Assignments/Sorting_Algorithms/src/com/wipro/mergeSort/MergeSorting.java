package com.wipro.mergeSort;

public class MergeSorting {
	
	 // Method to merge two sorted sub-arrays into a single sorted array
	public static void merge(int[] array, int left, int mid, int right) {
		
		
		int n1 = mid - left + 1; // Size of the left sub-array
		int n2 = right - mid; // Size of the right sub-array
		
		// Create temporary arrays for left and right sub-arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		 // Copy data to the temporary arrays
		System.arraycopy(array, left, leftArray, 0, n1);
		System.arraycopy(array, mid + 1, rightArray, 0,	 n2);
	
		int i = 0, j = 0, k = left; // Initial index of the left & right sub-array & Initial index of the merged array
	
		// Merge the temporary arrays back into the original array
		while(i < n1 && j < n2) {
			
			if(leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			}
			else {
				array[k++] = rightArray[j++];
			}
		}
		
		// Copy the remaining elements of leftArray, if any
		while(i < n1) {
			
			array[k++] = leftArray[i++];
		}
		
		// Copy the remaining elements of rightArray, if any
		while(j < n2) {
			array[k++] = rightArray[j++];
		}
	
	}
	
	// Method to perform Merge Sort on the array
	public static void mergeSort(int[] array, int left, int right) {
		
		if(left < right) { // Check if the array has more than one element
			
			int mid = left + (right - left) / 2; // Find the middle point
			
			// Recursively sort the first and second halves
			mergeSort(array, left, mid); // Sort the left sub-array
			mergeSort(array, mid + 1, right); // Sort the right sub-array
			merge(array, left, mid, right); // Merge the sorted halves
		}
	}

	// Method to print the elements of the array
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
		
		mergeSort(num, 0, l-1);
		
		System.out.println("\nThe Merge Sorted Array is: ");
		
		printArr(num);

	}

}
