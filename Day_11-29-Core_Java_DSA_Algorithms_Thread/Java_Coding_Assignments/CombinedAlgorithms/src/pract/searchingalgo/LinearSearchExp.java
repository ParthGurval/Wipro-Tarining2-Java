package pract.searchingalgo;

// Define the class for linear search example
public class LinearSearchExp {

    // Method to perform linear search on an array
    public static int linSearch(int[] array, int x) {
        // Loop through each element in the array
        for(int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the target value x
            if(array[i] == x) {
                return i; // Return the index of the found element
            }
        }
        // Return -1 if the element is not found in the array
        return -1;
    }
    
    public static void main(String[] args) {
        // Define an array of integers to search
        int[] num = {0, 5, 10, 15, 20, 900, 25, 50, 100, 150, 200, 75, 400};
        
        // Define the target number to search for
        int x = 200;
        
        // Call the linear search method and store the result
        int res = linSearch(num, x);
        
        // Check if the number was found and print the appropriate message
        if(res != -1) {
            System.out.println("The given number " + x + " is found at index: " + res);
        } else {
            System.out.println("Number is not present in the array");
        }
    }
}


//		Here’s the flowchart for the `LinearSearchExp` class, which demonstrates Linear Search on an array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `LinearSearchExp` Class)
//		   |
//		   V
//		(Define `linSearch(int[] array, int x)` Method)
//		   |
//		   V
//		(For `int i = 0; i < array.length; i++`)
//		   |
//		   V
//		   (Check if `array[i] == x`)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Return `i`) // Return the index where element is found
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(End For Loop)
//		   |
//		   V
//		(Return -1) // Return -1 if element is not found
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Define `num` as {0, 5, 10, 15, 20, 900, 25, 50, 100, 150, 200, 75, 400})
//		   |
//		   V
//		(Define `x` as 200)
//		   |
//		   V
//		(Call `linSearch(num, x)` and store result in `res`)
//		   |
//		   V
//		(Is `res != -1`?)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		   (Print "The given number `x` is found at index `res`")
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		   (Print "Number is not present in the array")
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `LinearSearchExp` Class**: This class contains the method for performing Linear Search.
//		
//		3. **Define `linSearch(int[] array, int x)` Method**:
//		   - **For Loop**: Iterate through each element in the array.
//		     - **Check if `array[i] == x`**: If the current element matches the target value `x`, return its index.
//		   - **Return -1**: If the target value is not found in the array after checking all elements.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Define `num`**: An array of integers in which the search will be performed.
//		   - **Define `x`**: The target value to search for in the array.
//		   - **Call `linSearch`**: Perform the search and store the result in `res`.
//		   - **Check Result**:
//		     - **If `res != -1`**: Print the index where the target value was found.
//		     - **Otherwise**: Print that the target value is not present in the array.
//		
//		5. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the process of performing a Linear Search and handling the output based on the search results.