package com.wipro.HeapSort;

public class HeapSorting {
	
	// Method to perform Heap Sort on the array
	public static void heapSort(int[] array) {
		
		int n = array.length;
		
		// Build a max heap from the array
        // Start from the last non-leaf node and heapify each node
		for(int i = n / 2 - 1; i >= 0; i--) {
			
			heapify(array, n, i);
		}
		
		// Extract elements one by one from the heap
		for(int i = n - 1; i > 0; i--) {
			
			// Move the current root (largest element) to the end of the array
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			// Heapify the root element to maintain the heap property
			heapify(array, i, 0);
		}
		
	}
	
	// Method to maintain the heap property of a subtree
	public static void heapify(int[] array, int n, int i) {
		
		int largest = i; // Initialize largest as root
		int left = 2 * i + 1; // Left child index
		int right = 2 * i + 2; // Right child index
		
		// If left child is larger than root
		if(left < n && array[left] > array[largest]) {
			
			largest = left;
		}
		
		// If right child is larger than the largest so far
		if(right < n && array[right] > array[largest]) {
			
			largest = right;
		}
		
		// If the largest is not the root
		if(largest != i) {
			
			// Swap the root with the largest element
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			
			// Recursively heapify the affected subtree
			heapify(array, n, largest);
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
		
		heapSort(num);
		
		System.out.println("\nThe Heap Sorted Array is: ");
		
		printArr(num);
		
		
	}

}
