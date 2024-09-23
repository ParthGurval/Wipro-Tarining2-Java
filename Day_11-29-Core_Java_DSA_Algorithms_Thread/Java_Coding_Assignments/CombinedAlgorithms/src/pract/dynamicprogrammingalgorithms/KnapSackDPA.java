package pract.dynamicprogrammingalgorithms;

public class KnapSackDPA {

    // Method to solve the 0/1 Knapsack problem using dynamic programming
    static int knapSack(int W, int[] wt, int[] val, int n) {
//    	Parameters:
//    		W: The maximum capacity of the knapsack.
//    		wt: An array where wt[i] represents the weight of the i-th item.
//    		val: An array where val[i] represents the value of the i-th item.
//    		n: The number of items.
    	
        // Create a 2D array to store the maximum value that can be obtained
        // dp[i][w] will be the maximum value that can be obtained with the first i items and capacity w
        int[][] dp = new int[n + 1][W + 1];
//        n + 1
//        Purpose: To handle the case where no items are considered.
//        Explanation:
//        n is the number of items.
//        By creating an array of size n + 1, you account for the scenario where you have 0 items.
//        The +1 allows indexing from 0 to n, representing each possible number of items from 0 up to n.

        //        W + 1
//        Purpose: To handle the case where the knapsack has 0 capacity.
//        Explanation:
//        W is the maximum capacity of the knapsack.
//        By creating an array of size W + 1, you account for capacities ranging from 0 to W.
//        The +1 allows indexing from 0 to W, representing each possible capacity from 0 up to W.

        // Iterate over all items (i from 0 to n) and all capacities (w from 0 to W)
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
            	
 //           	Purpose: When there are no items (i == 0) or the knapsack has zero capacity (w == 0), the maximum value is 0.
            	// With no items or no capacity, you can't add any value.
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
 //                   dp[i][w]: Represents the maximum value that can be achieved with the first i items and a knapsack capacity of w.
                } 
                
                // If the weight of the current item is less than or equal to the current capacity
                else if (wt[i - 1] <= w) {
                    // Calculate the maximum value by including or excluding the current item
                    // max(value of including the item, value of excluding the item)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
 //          1         dp[i][w]: Represents the maximum value that can be achieved with the first i items and a knapsack capacity of w.
//           2         val[i - 1] + dp[i - 1][w - wt[i - 1]]: This is the value if you include the current item (item i). 
//                    It adds the item's value to the maximum value achievable with the remaining capacity (w - wt[i - 1]) from the previous items.
                    
//            3        dp[i - 1][w]: This is the value if you exclude the current item, meaning you just take the maximum value achievable with the first i - 1 
//                    items and the same capacity w.
                    
                } 
                // If the weight of the current item is more than the current capacity
                else {
                    // Exclude the current item (value remains the same as without this item)
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Return the maximum value that can be obtained with n items and capacity W
        return dp[n][W];
    }

    // Main method to test the knapSack method
    public static void main(String[] args) {
        int W = 10; // Capacity of the knapsack
        int[] val = {10, 40, 30, 50}; // Values of the items
        int[] wt = {5, 4, 6, 3}; // Weights of the items
        int n = val.length; // Number of items

        // Call the knapSack method and print the result
        System.out.println("Maximum value in Knapsack = " + knapSack(W, wt, val, n));
    }
}

//		Here’s a structured flowchart diagram for the `KnapSackDPA` class, which outlines the step-by-step process for solving the 0/1 Knapsack problem using dynamic programming:
//		
//		(Start)
//		   |
//		   V
//		(Define the knapSack() method to solve the 0/1 Knapsack problem)
//		   |
//		   V
//		(Create 2D Array `dp`):
//		   |
//		   V
//		   (Initialize `dp[i][w]` with 0 for all i and w)
//		   |
//		   V
//		   (Purpose: To handle base cases where no items are considered or the knapsack has zero capacity)
//		   |
//		   V
//		(Iterate over all items `i` from 0 to `n`):
//		   |
//		   V
//		   (Iterate over all capacities `w` from 0 to `W`):
//		      |
//		      V
//		      (Check if `i == 0` or `w == 0`):
//		         |
//		         V
//		         (If True):
//		            |
//		            V
//		            (Set `dp[i][w]` to 0)
//		            |
//		            V
//		            (Purpose: Maximum value is 0 with no items or zero capacity)
//		         |
//		         V
//		         (Else Check if `wt[i - 1] <= w`):
//		            |
//		            V
//		            (If True):
//		               |
//		               V
//		               (Calculate `dp[i][w]`):
//		                  |
//		                  V
//		                  (Compute maximum value by including or excluding the item)
//		                  |
//		                  V
//		                  (Update `dp[i][w]` with `Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w])`)
//		               |
//		               V
//		               (Purpose: Choose the maximum of including or excluding the current item)
//		            |
//		            V
//		            (Else):
//		               |
//		               V
//		               (Set `dp[i][w]` to `dp[i - 1][w]`)
//		               |
//		               V
//		               (Purpose: Exclude the current item as its weight is more than the current capacity)
//		   |
//		   V
//		(Return `dp[n][W]`):
//		   |
//		   V
//		   (Purpose: Return the maximum value achievable with n items and capacity W)
//		   |
//		   V
//		(In main()):
//		   |
//		   V
//		   (Define Knapsack Capacity `W`, Item Values `val`, Item Weights `wt`, and Number of Items `n`)
//		   |
//		   V
//		   (Call `knapSack(W, wt, val, n)` method and Print Result)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Define `knapSack()` Method**:
//		   - **Purpose**: Solve the 0/1 Knapsack problem using dynamic programming.
//		   - **Parameters**:
//		     - `int W`: The maximum capacity of the knapsack.
//		     - `int[] wt`: An array where `wt[i]` represents the weight of the i-th item.
//		     - `int[] val`: An array where `val[i]` represents the value of the i-th item.
//		     - `int n`: The number of items.
//		3. **Create 2D Array `dp`**:
//		   - **Purpose**: To store the maximum value that can be obtained with the first i items and capacity w.
//		   - **Initialization**:
//		     - **`dp[i][w]`**: Initialize to 0 for base cases (no items or zero capacity).
//		4. **Iterate Over Items**:
//		   - **Loop**: For each item `i` from 0 to `n`.
//		5. **Iterate Over Capacities**:
//		   - **Loop**: For each capacity `w` from 0 to `W`.
//		6. **Check Base Cases**:
//		   - **If `i == 0` or `w == 0`**:
//		     - **Set `dp[i][w]` to 0**: Maximum value is 0 when no items are considered or the knapsack has zero capacity.
//		7. **Check Item Weight**:
//		   - **If `wt[i - 1] <= w`**:
//		     - **Calculate Maximum Value**:
//		       - **Compute**: Update `dp[i][w]` with `Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w])`.
//		   - **Else**:
//		     - **Exclude Item**: Set `dp[i][w]` to `dp[i - 1][w]` as the item's weight exceeds the current capacity.
//		8. **Return Result**:
//		   - **Return**: `dp[n][W]`, the maximum value that can be achieved with `n` items and capacity `W`.
//		9. **In `main()` Method**:
//		   - **Define**: Knapsack capacity, item values, weights, and number of items.
//		   - **Call**: `knapSack(W, wt, val, n)` and print the result.
//		10. **End**: Completion of the Knapsack problem solution.