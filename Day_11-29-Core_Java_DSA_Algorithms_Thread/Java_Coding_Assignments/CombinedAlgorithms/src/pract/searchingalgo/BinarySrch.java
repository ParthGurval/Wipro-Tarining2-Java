package pract.searchingalgo;

import java.util.Scanner;

public class BinarySrch {
    
    // Method to perform binary search on a sorted array
    public static int binSearch(int[] array, int num) {
        
        int low = 0; // Starting index of the search range
        int high = array.length - 1; // Ending index of the search range
        
        // Loop until the search range is valid
        while(low <= high) {
            
            // Calculate the middle index of the current search range
            int mid = low + (high - low) / 2;
            
            // Check if the middle element is the target number
            if(array[mid] == num) {
                return mid; // Return the index of the found number
            }
            
            // If the target number is greater than the middle element,
            // search in the right half of the array
            else if(array[mid] < num) {
                low = mid + 1; // Update the starting index of the search range
            }
            
            // If the target number is smaller than the middle element,
            // search in the left half of the array
            else {
                high = mid - 1; // Update the ending index of the search range
            }
        }
        
        // Return -1 if the number is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Define a sorted array for binary search
        int[] arr = {0, 5, 10, 15, 20, 25, 50, 75, 100, 150, 200, 400, 900};
        
        // Prompt the user to enter the number they want to search for
        System.out.print("Please enter the number you want to search: ");
        int num = sc.nextInt(); // Read the user input
        
        // Call the binary search method and store the result
        int res = binSearch(arr, num);
        
        // Check if the number was found and print the appropriate message
        if(res != -1) {
            System.out.println("The Number " + num + " is found in the array at index: " + res);
        } else {
            System.out.println("The number is not present in the array");
        }
        
        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}

//		Here's a flowchart diagram for the `BinarySrch` class, which performs binary search on a sorted array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `BinarySrch` Class)
//		   |
//		   V
//		(Define `binSearch(int[] array, int num)` Method)
//		   |
//		   V
//		(Set `low` to 0 and `high` to `array.length - 1)
//		   |
//		   V
//		(While `low <= high`)
//		   |
//		   V
//		(Calculate `mid` as `low + (high - low) / 2`)
//		   |
//		   V
//		(Is `array[mid] == num`?)
//		   |  
//		   V  
//		   (Yes)
//		   |
//		   V
//		(Return `mid`) 
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(Is `array[mid] < num`?)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		(Set `low` to `mid + 1`)
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(Set `high` to `mid - 1`)
//		   |
//		   V
//		(End While Loop)
//		   |
//		   V
//		(Return -1) // If number not found
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Create `Scanner` object to read input)
//		   |
//		   V
//		(Define `arr` as {0, 5, 10, 15, 20, 25, 50, 75, 100, 150, 200, 400, 900})
//		   |
//		   V
//		(Prompt user for a number and read input `num`)
//		   |
//		   V
//		(Call `binSearch(arr, num)` and store result in `res`)
//		   |
//		   V
//		(Is `res != -1`?)
//		   |
//		   V
//		   (Yes)
//		   |
//		   V
//		(Print "The Number `num` is found in the array at index: `res`")
//		   |
//		   V
//		   (No)
//		   |
//		   V
//		(Print "The number is not present in the array")
//		   |
//		   V
//		(Close `Scanner` to prevent resource leaks)
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `BinarySrch` Class**: The class contains methods to perform binary search.
//		
//		3. **Define `binSearch(int[] array, int num)` Method**:
//		   - **Set `low` and `high`**: Initialize the search range.
//		   - **While Loop**: Continue searching while `low` is less than or equal to `high`.
//		     - **Calculate `mid`**: Find the middle index of the current range.
//		     - **Check `array[mid]`**: 
//		       - If it matches `num`, return `mid`.
//		       - If `array[mid] < num`, search the right half by updating `low`.
//		       - If `array[mid] > num`, search the left half by updating `high`.
//		   - **Return -1**: If the number is not found in the array.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Create `Scanner`**: For user input.
//		   - **Define `arr`**: A sorted array to search.
//		   - **Prompt and Read Input**: Ask user for a number to search.
//		   - **Call `binSearch`**: Perform the search and get the result.
//		   - **Check Result**:
//		     - If the number is found (`res != -1`), print its index.
//		     - Otherwise, print that the number is not in the array.
//		   - **Close `Scanner`**: To free resources.
//		
//		5. **End**: Completion of the program execution and output.
//		
//		This flowchart illustrates the process of searching for a number in a sorted array using binary search and handling user input and output.