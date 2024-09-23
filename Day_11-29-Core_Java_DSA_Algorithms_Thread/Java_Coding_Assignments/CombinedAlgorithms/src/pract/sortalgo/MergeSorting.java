package pract.sortalgo;

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

//		Here’s the flowchart for the `MergeSorting` class, which demonstrates Merge Sort on an array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `MergeSorting` Class)
//		   |
//		   V
//		(Define `merge(int[] array, int left, int mid, int right)` Method)
//		   |
//		   V
//		(Set `n1 = mid - left + 1`) // Size of left sub-array
//		   |
//		   V
//		(Set `n2 = right - mid`) // Size of right sub-array
//		   |
//		   V
//		(Create `leftArray` with size `n1`)
//		   |
//		   V
//		(Create `rightArray` with size `n2`)
//		   |
//		   V
//		(Copy data to `leftArray` from `array`)
//		   |
//		   V
//		(Copy data to `rightArray` from `array`)
//		   |
//		   V
//		(Set `i = 0, j = 0, k = left`) // Initialize indices
//		   |
//		   V
//		(While `i < n1` and `j < n2`) // Merge elements from both sub-arrays
//		   |
//		   V
//		   (If `leftArray[i] <= rightArray[j]`)
//		   |
//		   V
//		   (Set `array[k++] = leftArray[i++]`)
//		   |
//		   V
//		   (Else)
//		   |
//		   V
//		   (Set `array[k++] = rightArray[j++]`)
//		   |
//		   V
//		(While `i < n1`) // Copy remaining elements from `leftArray`
//		   |
//		   V
//		   (Set `array[k++] = leftArray[i++]`)
//		   |
//		   V
//		(While `j < n2`) // Copy remaining elements from `rightArray`
//		   |
//		   V
//		   (Set `array[k++] = rightArray[j++]`)
//		   |
//		   V
//		(End Method)
//		   |
//		   V
//		(Define `mergeSort(int[] array, int left, int right)` Method)
//		   |
//		   V
//		(If `left < right`) // Check if array has more than one element
//		   |
//		   V
//		   (Set `mid = left + (right - left) / 2`) // Find middle point
//		   |
//		   V
//		   (Call `mergeSort(array, left, mid)`) // Sort left sub-array
//		   |
//		   V
//		   (Call `mergeSort(array, mid + 1, right)`) // Sort right sub-array
//		   |
//		   V
//		   (Call `merge(array, left, mid, right)`) // Merge sorted halves
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
//		(Call `mergeSort(num, 0, l-1)`) // Perform Merge Sort
//		   |
//		   V
//		(Print "The Merge Sorted Array is:")
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
//		2. **Define `MergeSorting` Class**: This class contains methods for performing Merge Sort and printing the array.
//		
//		3. **Define `merge(int[] array, int left, int mid, int right)` Method**:
//		   - **Set `n1 = mid - left + 1`**: Determine the size of the left sub-array.
//		   - **Set `n2 = right - mid`**: Determine the size of the right sub-array.
//		   - **Create Temporary Arrays**: Allocate memory for `leftArray` and `rightArray`.
//		   - **Copy Data**: Copy elements into the temporary arrays.
//		   - **Initialize Indices**: Set indices for merging.
//		   - **Merge Arrays**: Combine elements from both temporary arrays into the original array.
//		   - **Copy Remaining Elements**: Handle any remaining elements in `leftArray` and `rightArray`.
//		
//		4. **Define `mergeSort(int[] array, int left, int right)` Method**:
//		   - **Check Array Size**: Ensure the array has more than one element.
//		   - **Find Middle Point**: Calculate the midpoint for splitting.
//		   - **Sort Sub-arrays**: Recursively sort the left and right halves.
//		   - **Merge Sorted Halves**: Combine the sorted sub-arrays.
//		
//		5. **Define `printArr(int[] arr)` Method**:
//		   - **Print Each Element**: Loop through the array and print each element.
//		
//		6. **Define `main(String[] args)` Method**:
//		   - **Define `num` Array**: An array of integers to be sorted.
//		   - **Define `l`**: Length of the array.
//		   - **Print Original Array**: Display the array before sorting.
//		   - **Sort Array**: Apply Merge Sort.
//		   - **Print Sorted Array**: Display the array after sorting.
//		
//		7. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the process of performing Merge Sort and displaying the results before and after sorting.
