package pract.sortalgo;

public class bubbleSortingExp {

    // Method to perform Bubble Sort on an array
    public static void bubbleSort(int[] array) {
        
        int n = array.length; // Get the length of the array
        boolean swapped; // Flag to check if any elements were swapped
        
        // Traverse through all array elements
        for(int i = 0; i < n - 1; i++) {
            
            swapped = false; // Reset swapped flag for this pass
            
            // Perform the comparisons and swaps
            for(int j = 0; j < n - i - 1; j++) {
                
                // Compare the current element with the next element
                if(array[j] > array[j + 1]) {
                    
                    // Swap if the current element is greater than the next
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    swapped = true; // Set swapped flag to true
                }
            }
            
            // If no elements were swapped, the array is already sorted
            if(!swapped) break;
        }
    }
    
    // Method to print the array
    public static void printArr(int[] arr, int size) {
        // Loop through each element and print it
        for(int i = 0; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Define an array of integers to be sorted
        int[] num = {89, 68, 21, 10, 45, 20, 9, 53, 24, 98, 90}; 
        int l = num.length; // Get the length of the array
        
        // Print the original array
        System.out.println("The Original Array is: ");
        printArr(num, l);
        
        System.out.println();
        
        // Sort the array using Bubble Sort
        bubbleSort(num);
        
        // Print the sorted array
        System.out.println("\nThe Bubble Sorted Array is: ");
        printArr(num, l);
    }
}

//		Here’s the flowchart for the `bubbleSortingExp` class, which demonstrates Bubble Sort on an array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `bubbleSortingExp` Class)
//		   |
//		   V
//		(Define `bubbleSort(int[] array)` Method)
//		   |
//		   V
//		(Get Length of Array `n`) 
//		   |
//		   V
//		(For `int i = 0; i < n - 1; i++`) // Outer loop for passes
//		   |
//		   V
//		   (Set `swapped = false`) // Reset swapped flag
//		   |
//		   V
//		   (For `int j = 0; j < n - i - 1; j++`) // Inner loop for comparisons
//		   |
//		   V
//		   (Compare `array[j] > array[j + 1]`)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Swap `array[j]` and `array[j + 1]`)
//		   |
//		   V
//		   (Set `swapped = true`)
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(End Inner Loop)
//		   |
//		   V
//		   (If `!swapped` Break Loop) // Array is already sorted
//		   |
//		   V
//		(End Outer Loop)
//		   |
//		   V
//		(Define `printArr(int[] arr, int size)` Method)
//		   |
//		   V
//		(For `int i = 0; i < size; i++`) // Loop to print array elements
//		   |
//		   V
//		   (Print `arr[i]`)
//		   |
//		   V
//		(End Loop)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Define Array `num` as {89, 68, 21, 10, 45, 20, 9, 53, 24, 98, 90})
//		   |
//		   V
//		(Define `l` as `num.length`) // Get length of the array
//		   |
//		   V
//		(Print "The Original Array is:")
//		   |
//		   V
//		(Call `printArr(num, l)`) // Print original array
//		   |
//		   V
//		(Sort Array Using `bubbleSort(num)`)
//		   |
//		   V
//		(Print "The Bubble Sorted Array is:")
//		   |
//		   V
//		(Call `printArr(num, l)`) // Print sorted array
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `bubbleSortingExp` Class**: This class contains the method for performing Bubble Sort.
//		
//		3. **Define `bubbleSort(int[] array)` Method**:
//		   - **Get Length of Array**: Determine the length of the array.
//		   - **Outer Loop (`i`)**: Iterate through the array, performing passes.
//		     - **Reset `swapped`**: Initialize the flag to false for the current pass.
//		     - **Inner Loop (`j`)**: Compare adjacent elements and swap if necessary.
//		       - **Compare Elements**: Check if the current element is greater than the next.
//		       - **Swap Elements**: If true, swap them and set `swapped` to true.
//		     - **Check `swapped`**: If no swaps were made, the array is sorted, and break the loop.
//		
//		4. **Define `printArr(int[] arr, int size)` Method**:
//		   - **Loop Through Elements**: Print each element of the array.
//		
//		5. **Define `main(String[] args)` Method**:
//		   - **Define `num`**: An array of integers to be sorted.
//		   - **Define `l`**: Length of the array.
//		   - **Print Original Array**: Display the array before sorting.
//		   - **Sort Array**: Apply the Bubble Sort algorithm.
//		   - **Print Sorted Array**: Display the array after sorting.
//		
//		6. **End**: Completion of the program execution and output.
//		
//		This flowchart illustrates the process of performing Bubble Sort and outputting the results before and after sorting.