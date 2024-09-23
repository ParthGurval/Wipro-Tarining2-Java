package pract.sortalgo;

public class HeapSorting {
	
	
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


//		Here’s the flowchart for the `HeapSorting` class, which demonstrates Heap Sort on an array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `HeapSorting` Class)
//		   |
//		   V
//		(Define `heapify(int[] array, int n, int i)` Method)
//		   |
//		   V
//		(Set `largest = i`) // Assume root is the largest
//		   |
//		   V
//		(Set `left = 2 * i + 1`) // Calculate left child index
//		   |
//		   V
//		(Set `right = 2 * i + 2`) // Calculate right child index
//		   |
//		   V
//		(If `left < n && array[left] > array[largest]`)
//		   |
//		   V
//		   (Set `largest = left`) // Update largest if left child is larger
//		   |
//		   V
//		(If `right < n && array[right] > array[largest]`)
//		   |
//		   V
//		   (Set `largest = right`) // Update largest if right child is larger
//		   |
//		   V
//		(If `largest != i`)
//		   |
//		   V
//		   (Swap `array[i]` and `array[largest]`)
//		   |
//		   V
//		   (Call `heapify(array, n, largest)`) // Recursively heapify affected subtree
//		   |
//		   V
//		(End Method)
//		   |
//		   V
//		(Define `heapSort(int[] array)` Method)
//		   |
//		   V
//		(Set `n = array.length`) // Get the length of the array
//		   |
//		   V
//		(For `int i = n / 2 - 1; i >= 0; i--`) // Build max heap
//		   |
//		   V
//		   (Call `heapify(array, n, i)`) // Heapify each node
//		   |
//		   V
//		(For `int i = n - 1; i > 0; i--`) // Extract elements one by one
//		   |
//		   V
//		   (Swap `array[0]` and `array[i]`) // Move root to end of array
//		   |
//		   V
//		   (Call `heapify(array, i, 0)`) // Heapify the root element
//		   |
//		   V
//		(End Method)
//		   |
//		   V
//		(Define `printArr(int[] arr)` Method)
//		   |
//		   V
//		(For `int i = 0; i < arr.length; i++`) // Print each element
//		   |
//		   V
//		   (Print `arr[i]`)
//		   |
//		   V
//		(Print newline)
//		   |
//		   V
//		(End Method)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Define `num` Array as {89, 68, 21, 10, 45, 20, 9, 53, 24, 98, 90})
//		   |
//		   V
//		(Define `l` as `num.length`) // Get length of the array
//		   |
//		   V
//		(Print "The Original Array is:")
//		   |
//		   V
//		(Call `printArr(num)`) // Print original array
//		   |
//		   V
//		(Call `heapSort(num)`) // Perform Heap Sort
//		   |
//		   V
//		(Print "The Heap Sorted Array is:")
//		   |
//		   V
//		(Call `printArr(num)`) // Print sorted array
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `HeapSorting` Class**: This class contains methods for performing Heap Sort and printing the array.
//		
//		3. **Define `heapify(int[] array, int n, int i)` Method**:
//		   - **Set `largest = i`**: Initialize the root as the largest.
//		   - **Calculate Left and Right Child Indices**: Determine the indices of the left and right children.
//		   - **Check Left Child**: If the left child is larger than the root, update `largest`.
//		   - **Check Right Child**: If the right child is larger than the current largest, update `largest`.
//		   - **If `largest != i`**: Swap the root with the largest element and recursively heapify the affected subtree.
//		
//		4. **Define `heapSort(int[] array)` Method**:
//		   - **Set `n = array.length`**: Get the length of the array.
//		   - **Build Max Heap**: Iterate from the last non-leaf node to the root, heapifying each node.
//		   - **Extract Elements**: Swap the root (largest element) with the last element and heapify the root, repeating this process until the array is sorted.
//		
//		5. **Define `printArr(int[] arr)` Method**:
//		   - **Print Each Element**: Loop through the array and print each element.
//		
//		6. **Define `main(String[] args)` Method**:
//		   - **Define `num` Array**: An array of integers to be sorted.
//		   - **Define `l`**: Length of the array.
//		   - **Print Original Array**: Display the array before sorting.
//		   - **Sort Array**: Apply Heap Sort.
//		   - **Print Sorted Array**: Display the array after sorting.
//		
//		7. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the process of performing Heap Sort and displaying the results before and after sorting.