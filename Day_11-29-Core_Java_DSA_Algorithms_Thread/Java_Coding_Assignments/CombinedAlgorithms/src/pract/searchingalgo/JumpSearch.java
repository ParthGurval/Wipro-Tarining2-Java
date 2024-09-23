package pract.searchingalgo; // Ensure this matches your directory structure

public class JumpSearch {

    // Function to perform Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length; // Get the length of the array
        int step = (int) Math.sqrt(n); // Calculate the optimal block size (step) using the square root of the array length
        int prev = 0; // Initialize the previous block's end index

        // Jumping ahead in blocks
        //This while loop is used to jump through blocks of the array to find the block where the target might be located.
        
//        Math.min is a method in Java that returns the smaller of two values.
        
       // Math.min(step, n) - 1: This calculates the index of the last element in the current block. 
//        The Math.min(step, n) ensures that the block size does not exceed the array length. Subtracting 1 gives the last valid index within the block.
        while (arr[Math.min(step, n) - 1] < target) {
//        	arr[Math.min(step, n) - 1] < target: This condition checks if the element at the end of the current block is less than the target. 
//        	If it is, it means the target is not in this block, and we need to jump to the next block.
 //       	If the target is not found in the current block, the loop updates the prev index to the end of the current block and increments the step size to 
 //       	jump to the next block. 	
//        	Assume step = 3, n = 10, and target = 19.
//
//        			The end index of the current block would be Math.min(3, 10) - 1 = 2.
//        			If arr[2] < 19, the loop continues, updating prev to 3 and step to 6.
        	
        	
            prev = step; // Update the previous block end index
            
            step += (int) Math.sqrt(n); // Jump to the next block by adding block size
            
            if (prev >= n) return -1; // If the step exceeds array length, target not found
        }

        // Linear search within the block
 //       Purpose: This for loop performs a linear search within the block where the target might be.
//        int i = prev: Starts searching from the index prev, which is the start of the current block.
//        i < Math.min(step, n): The loop continues until it reaches the end of the current block. Math.min(step, n) ensures that we do not exceed the array length.
//        The loop checks each element in the block to see if it matches the target.
        for (int i = prev; i < Math.min(step, n); i++) {
//        	If prev = 3 and step = 6, and n = 10:
//
//        		The block end index is Math.min(6, 10) = 6.
//        		The loop will iterate from index 3 to 5, checking each element in this range.
        	
            if (arr[i] == target) return i; // Target found, return the index
        }

        return -1; // Target not found, return -1
    }

    public static void main(String[] args) {
        // Test array and target value
        int[] arr = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28}; // Array to search in
        int target = 19; // Value we want to find in the array

        // Perform Jump Search
        int result = jumpSearch(arr, target); // Call the jumpSearch function

        // Output the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result); // Print index if target is found
        } else {
            System.out.println("Element " + target + " not found in the array"); // Print not found message if target is not found
        }
    }
}


//		Here's a flowchart diagram for the `JumpSearch` class, which performs Jump Search on a sorted array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `JumpSearch` Class)
//		   |
//		   V
//		(Define `jumpSearch(int[] arr, int target)` Method)
//		   |
//		   V
//		(Get length of `arr` and assign to `n`)
//		   |
//		   V
//		(Calculate `step` as `(int) Math.sqrt(n)`)
//		   |
//		   V
//		(Initialize `prev` to 0)
//		   |
//		   V
//		(While `arr[Math.min(step, n) - 1] < target`)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		(Update `prev` to `step`)
//		   |
//		   V
//		   (Increment `step` by `(int) Math.sqrt(n)`)
//		   |
//		   V
//		   (Is `prev >= n`?)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Return -1) // Target not found
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(For `int i = prev; i < Math.min(step, n); i++`)
//		   |
//		   V
//		   (Check if `arr[i] == target`)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Return `i`) // Target found
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(End For Loop)
//		   |
//		   V
//		(Return -1) // Target not found
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Define `arr` as {1, 4, 7, 10, 13, 16, 19, 22, 25, 28})
//		   |
//		   V
//		(Define `target` as 19)
//		   |
//		   V
//		(Call `jumpSearch(arr, target)` and store result in `result`)
//		   |
//		   V
//		(Is `result != -1`?)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Print "Element `target` found at index `result`")
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		   (Print "Element `target` not found in the array")
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `JumpSearch` Class**: The class contains the method for performing Jump Search.
//		
//		3. **Define `jumpSearch(int[] arr, int target)` Method**:
//		   - **Get `n`**: Determine the length of the array.
//		   - **Calculate `step`**: Optimal block size using the square root of `n`.
//		   - **Initialize `prev`**: Set to 0 for the starting block index.
//		   - **While Loop**:
//		     - **Jump through Blocks**:
//		       - **Condition**: Check if the end element of the current block is less than the target.
//		       - **Update `prev`**: Move to the end of the current block.
//		       - **Increment `step`**: Jump to the next block.
//		       - **Check if `prev` exceeds array length**: Return -1 if true (target not found).
//		   - **Linear Search**:
//		     - **Search within Block**:
//		       - **For Loop**: Iterate through the block to find the target.
//		       - **Check if `arr[i]` equals the target**: Return index if found.
//		   - **Return -1**: If target is not found within the block.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Define `arr`**: Sorted array to search in.
//		   - **Define `target`**: Value to find in the array.
//		   - **Call `jumpSearch`**: Perform the search and store the result.
//		   - **Check Result**:
//		     - **If `result != -1`**: Print index where target is found.
//		     - **Otherwise**: Print that the target is not found in the array.
//		
//		5. **End**: Completion of the program execution and output.
//		
//		This flowchart illustrates the process of performing Jump Search on a sorted array and handling user input and output.