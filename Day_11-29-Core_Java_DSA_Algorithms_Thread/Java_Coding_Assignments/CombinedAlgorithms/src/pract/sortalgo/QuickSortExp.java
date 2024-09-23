package pract.sortalgo;

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


//		Here’s the flowchart for the `QuickSortExp` class, which demonstrates Quick Sort on an array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `QuickSortExp` Class)
//		   |
//		   V
//		(Define `partition(int[] array, int low, int high)` Method)
//		   |
//		   V
//		(Set `pivot = array[high]`) // Choose the last element as pivot
//		   |
//		   V
//		(Set `i = (low - 1)`) // Initialize index for the smaller element
//		   |
//		   V
//		(For `int j = low; j < high; j++`) // Traverse the array
//		   |
//		   V
//		   (If `array[j] <= pivot`) // Compare current element with pivot
//		   |
//		   V
//		   (Increment `i`) // Move the index for smaller element
//		   |
//		   V
//		   (Swap `array[i]` with `array[j]`) // Swap elements
//		   |
//		   V
//		(Swap `array[i + 1]` with `array[high]`) // Place pivot in correct position
//		   |
//		   V
//		(Return `i + 1`) // Return partition index
//		   |
//		   V
//		(Define `quickSort(int[] array, int low, int high)` Method)
//		   |
//		   V
//		(If `low < high`) // Check if there are more than one elements
//		   |
//		   V
//		   (Call `partition(array, low, high)`) // Get partition index
//		   |
//		   V
//		   (Call `quickSort(array, low, pi - 1)`) // Recursively sort left sub-array
//		   |
//		   V
//		   (Call `quickSort(array, pi + 1, high)`) // Recursively sort right sub-array
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
//		(Call `quickSort(num, 0, l-1)`) // Perform Quick Sort
//		   |
//		   V
//		(Print "The Quick Sorted Array is:")
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
//		2. **Define `QuickSortExp` Class**: This class contains methods for performing Quick Sort and printing the array.
//		
//		3. **Define `partition(int[] array, int low, int high)` Method**:
//		   - **Set `pivot = array[high]`**: Choose the last element as the pivot.
//		   - **Set `i = (low - 1)`**: Initialize the index for the smaller element.
//		   - **Traverse Array**: Loop through elements and compare with pivot.
//		   - **If `array[j] <= pivot`**: If the current element is smaller than or equal to the pivot, swap it with the element at index `i`.
//		   - **Swap Pivot**: Place the pivot in the correct position by swapping it with the element at index `i + 1`.
//		   - **Return Partition Index**: Return the index where the pivot is placed.
//		
//		4. **Define `quickSort(int[] array, int low, int high)` Method**:
//		   - **Check Array Size**: Ensure there are more than one elements to sort.
//		   - **Get Partition Index**: Call `partition()` to find the index.
//		   - **Sort Sub-arrays**: Recursively sort the left and right sub-arrays.
//		
//		5. **Define `printArr(int[] arr)` Method**:
//		   - **Print Each Element**: Loop through the array and print each element.
//		
//		6. **Define `main(String[] args)` Method**:
//		   - **Define `num` Array**: An array of integers to be sorted.
//		   - **Define `l`**: Length of the array.
//		   - **Print Original Array**: Display the array before sorting.
//		   - **Sort Array**: Apply Quick Sort.
//		   - **Print Sorted Array**: Display the array after sorting.
//		
//		7. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the process of performing Quick Sort and displaying the results before and after sorting.