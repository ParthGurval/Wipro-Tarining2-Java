package pract.dynamicprogrammingalgorithms;

import java.util.Arrays; // Purpose: Import Arrays class for utility functions like fill and toString

public class LongestIncreasingSub {

    // Purpose: Method to find the length of the longest increasing subsequence (LIS)
    static int lis(int[] arr) {
        
        int n = arr.length; // Purpose: Store the length of the input array
        
        int[] dp = new int[n]; // Purpose: Array to store the length of the LIS ending at each index
        Arrays.fill(dp, 1); // Purpose: Initialize dp array with 1s, as the minimum LIS length for each element is 1
//        Arrays.fill(dp, 1): Initializes all entries of dp to 1 since the shortest LIS for any element is at least the element itself.
        
        // Purpose: Iterate through each element to build the dp array
        for(int i = 1; i < n; i++) {
            
            // Purpose: Compare the current element with all previous elements
            for(int j = 0; j < i; j++) {
                
                // Purpose: Check if the current element is greater than the previous element
                // and if the LIS length can be extended
            //	dp[i]: Stores the length of the longest increasing subsequence that ends with the element at index i.
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
//                	Checks if the current element arr[i] can extend the LIS ending at arr[j]. If true, updates dp[i] to reflect this new length.
//                	dp[i]: Length of the longest increasing subsequence ending at index i.
//                	dp[j]: Length of the longest increasing subsequence ending at index j.
                	
                    // Purpose: Update dp[i] to the new LIS length if it is greater
                    dp[i] = dp[j] + 1;
                }
                
                //debug
                //System.out.println("dp[" + i + "] = " + dp[i]);
            }
        }
        
        int lisLen = 0; // Purpose: Variable to store the length of the longest increasing subsequence
        
        // Purpose: Find the maximum value in dp array which represents the LIS length
        for(int i = 0;  i < n; i++) {
            
            lisLen = Math.max(lisLen, dp[i]); // Purpose: Update lisLen to the maximum LIS length found
//          Math.max(dp[i - 1][j], dp[i][j - 1]) is used to select the longer of two possible LCS lengths: 
        }
        
        //debug
        //System.out.println("\nFinal DP Array: ");
        //System.out.println(Arrays.toString(dp));
        
        return lisLen; // Purpose: Return the length of the longest increasing subsequence
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60}; // Purpose: Example input array
        
        // Purpose: Print the length of the LIS for the given input array
        System.out.println("\nLength of LIS is: " + lis(arr));
        
        int[] arr1 = {50, 3, 10, 7, 40, 80}; // Purpose: Another example input array
        
        // Purpose: Print the length of the LIS for the second input array
        System.out.println("\nLength of LIS is: " + lis(arr1));
    }
}



//		Here’s a structured flowchart diagram for the `LongestIncreasingSub` class, which calculates the length of the Longest Increasing Subsequence (LIS) in an array:
//		
//		(Start)
//		   |
//		   V
//		(Define `main()` Method)
//		   |
//		   V
//		(Initialize Arrays):
//		   |
//		   V
//		   - `int[] arr = {10, 22, 9, 33, 21, 50, 41, 60}`
//		   - `int[] arr1 = {50, 3, 10, 7, 40, 80}`
//		   |
//		   V
//		(Call `lis(arr)`):
//		   |
//		   V
//		(Print Length of LIS for `arr`):
//		   |
//		   V
//		(Call `lis(arr1)`):
//		   |
//		   V
//		(Print Length of LIS for `arr1`):
//		   |
//		   V
//		(End)
//		
//		(Define `lis(int[] arr)` Method)
//		   |
//		   V
//		(Initialize Variables):
//		   |
//		   V
//		   - `int n = arr.length`: Length of the input array
//		   - `int[] dp = new int[n]`: Array to store LIS lengths ending at each index
//		   - `Arrays.fill(dp, 1)`: Initialize `dp` array with 1s
//		   |
//		   V
//		(Fill the DP Array):
//		   |
//		   V
//		   (Loop through Each Element `i`):
//		      |
//		      V
//		      (Loop through Previous Elements `j`):
//		         |
//		         V
//		         (Check if `arr[i] > arr[j]` and LIS can be Extended):
//		            |
//		            V
//		            - If true, Update `dp[i] = dp[j] + 1`
//		   |
//		   V
//		(Find Maximum Value in DP Array):
//		   |
//		   V
//		   - `int lisLen = 0`
//		   - `lisLen = Math.max(lisLen, dp[i])`: Find the maximum LIS length
//		   |
//		   V
//		(Return Length of LIS):
//		   |
//		   V
//		   - `return lisLen`
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `main()` Method**:
//		   - **Initialize Arrays**:
//		     - `int[] arr = {10, 22, 9, 33, 21, 50, 41, 60}`: First example input array.
//		     - `int[] arr1 = {50, 3, 10, 7, 40, 80}`: Second example input array.
//		   - **Call `lis(arr)`**: Compute the LIS length for the first array.
//		   - **Print Length of LIS for `arr`**: Display the LIS length.
//		   - **Call `lis(arr1)`**: Compute the LIS length for the second array.
//		   - **Print Length of LIS for `arr1`**: Display the LIS length.
//		
//		3. **Define `lis(int[] arr)` Method**:
//		   - **Initialize Variables**:
//		     - `int n = arr.length`: Get the length of the input array.
//		     - `int[] dp = new int[n]`: Create an array to store LIS lengths.
//		     - `Arrays.fill(dp, 1)`: Initialize `dp` with 1s since the minimum LIS length for any element is 1.
//		   - **Fill the DP Array**:
//		     - **Loop through Each Element `i`**:
//		       - **Loop through Previous Elements `j`**:
//		         - **Check if `arr[i] > arr[j]` and LIS can be Extended**:
//		           - If true, update `dp[i]` to `dp[j] + 1` to reflect the extended LIS.
//		   - **Find Maximum Value in DP Array**:
//		     - **Initialize `lisLen`**: Variable to store the maximum LIS length.
//		     - **Update `lisLen`**: Use `Math.max(lisLen, dp[i])` to find the maximum LIS length.
//		   - **Return Length of LIS**:
//		     - Return `lisLen`, which holds the length of the longest increasing subsequence.
//		
//		4. **End**: Completion of LIS calculation and output.