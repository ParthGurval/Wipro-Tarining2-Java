package pract.dynamicprogrammingalgorithms;

public class KnapSackAlgo {

	// Method to solve the Knapsack problem
	public static int knapSack(int[] weight, int[] value, int capacity) {
//		Purpose: To calculate the maximum value that can be achieved with the given items and knapsack capacity.
//		Parameters:
//		weight[]: Array of weights for each item.
//		value[]: Array of values for each item.
//		capacity: Maximum capacity of the knapsack.
		
		int n = weight.length; // Number of items
		// Array to store the maximum value that can be achieved with each capacity
		int[] dp = new int[capacity + 1];
//		Purpose: Initialize the number of items and the DP array.
//		Explanation: n is the number of items. dp[] is an array where dp[w] represents the maximum value that can be achieved with a knapsack capacity w.
		
		// Iterate over each item
		for(int i = 0; i < n; i++) {
			
			// Iterate backward through the capacities to ensure each item is only used once
			for(int w = capacity; w >= weight[i]; w--) {
//				Initialization: The loop starts with w initialized to capacity, which is the maximum capacity of the knapsack.
//				Condition: The loop continues as long as w is greater than or equal to weight[i]. This ensures that we do not consider capacities smaller than the weight of the current item.
//				Decrement: The loop decrements w on each iteration (w--), which means it processes capacities from capacity down to weight[i].
				
				// Purpose: Update dp[w] to be the maximum of its current value or the value of including the current item
				// Explanation: dp[w] represents the maximum value that can be obtained with capacity w
				// value[i] + dp[w - weight[i]]: Value of including the current item + maximum value for remaining capacity
				dp[w] = Math.max(dp[w], value[i] + dp[w - weight[i]]);
//				Purpose: Update the maximum value that can be achieved with the current capacity w, considering whether or not to include the current item.
//
//				Explanation:
//				dp[w]: Represents the maximum value achievable with capacity w without considering the current item.
//				value[i] + dp[w - weight[i]]: Represents the value obtained by including the current item i in the knapsack.
//				value[i]: Value of the current item.
//				dp[w - weight[i]]: Maximum value achievable with the remaining capacity (w - weight[i]) after including the current item.
				
//				Math.max(dp[w], value[i] + dp[w - weight[i]]):
//
//					dp[w]: If we do not include the current item, the value remains as dp[w].
//					value[i] + dp[w - weight[i]]: If we include the current item, the value is the sum of the item's value and the maximum value achievable 
//					with the remaining capacity.
//					Math.max(...): Selects the greater of these two values. This ensures that dp[w] holds the maximum value possible with capacity w 
//					considering the inclusion of the current item.
				
//	***			Why Iterate Backwards?
//						The loop iterates backwards (from capacity to weight[i]) to prevent multiple inclusion of the same item. 
//						If we iterate forwards, we would risk using the same item multiple times, which is not allowed in the 0/1 knapsack problem 
//						(each item can be included at most once).
			}
		}
		
		// Return the maximum value that can be achieved with the given capacity
		return dp[capacity];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Weights of the items
		int[] weight = {2, 3, 4, 5};
		// Values of the items
		int[] values = {3, 4, 5, 6};
		// Maximum capacity of the knapsack
		int capacity = 5;
		
		// Calculate the maximum profit
		int maxProfit = knapSack(weight, values, capacity);
		// Print the result
		System.out.println("MAX Profit is: " + maxProfit);
	}
}


//		Here’s a structured flowchart diagram for the `KnapSackAlgo` class, which outlines the step-by-step process for solving the Knapsack problem using dynamic programming:
//		
//		(Start)
//		   |
//		   V
//		(Define `knapSack()` Method)
//		   |
//		   V
//		(Parameters):
//		   |
//		   V
//		   - `int[] weight`: Array of weights for each item.
//		   - `int[] value`: Array of values for each item.
//		   - `int capacity`: Maximum capacity of the knapsack.
//		   |
//		   V
//		(Initialize Variables):
//		   |
//		   V
//		   - `int n = weight.length`: Number of items.
//		   - `int[] dp = new int[capacity + 1]`: Array to store maximum values achievable with each capacity.
//		   |
//		   V
//		(Iterate Over Items `i` from 0 to `n-1`):
//		   |
//		   V
//		   (Iterate Backwards Through Capacities `w` from `capacity` to `weight[i]`):
//		   |
//		   V
//		   (Update `dp[w]`):
//		      |
//		      V
//		      (Check if Including the Current Item is Better):
//		         |
//		         V
//		         (Compute `dp[w]`):
//		            |
//		            V
//		            - `dp[w] = Math.max(dp[w], value[i] + dp[w - weight[i]])`
//		            |
//		            V
//		            (Purpose: Update the maximum value achievable with capacity `w`, considering inclusion of the current item)
//		   |
//		   V
//		(Return `dp[capacity]`):
//		   |
//		   V
//		   (Purpose: Return the maximum value that can be achieved with the given knapsack capacity)
//		   |
//		   V
//		(In `main()` Method):
//		   |
//		   V
//		   (Define `weight[]`, `values[]`, and `capacity`)
//		   |
//		   V
//		   (Call `knapSack(weight, values, capacity)` and Print Result)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Define `knapSack()` Method**:
//		   - **Purpose**: To calculate the maximum value that can be achieved with the given items and knapsack capacity.
//		   - **Parameters**:
//		     - `int[] weight`: Array where `weight[i]` represents the weight of the i-th item.
//		     - `int[] value`: Array where `value[i]` represents the value of the i-th item.
//		     - `int capacity`: Maximum capacity of the knapsack.
//		3. **Initialize Variables**:
//		   - **`int n = weight.length`**: Number of items.
//		   - **`int[] dp = new int[capacity + 1]`**: Array to store the maximum values achievable with each capacity.
//		4. **Iterate Over Items**:
//		   - **Loop**: For each item `i` from 0 to `n-1`.
//		5. **Iterate Backwards Through Capacities**:
//		   - **Loop**: For each capacity `w` from `capacity` down to `weight[i]`.
//		6. **Update `dp[w]`**:
//		   - **Compute**: `dp[w] = Math.max(dp[w], value[i] + dp[w - weight[i]])`.
//		     - **Purpose**: Update `dp[w]` to be the maximum of its current value or the value of including the current item.
//		     - **Explanation**:
//		       - `dp[w]`: Maximum value achievable with capacity `w` without including the current item.
//		       - `value[i] + dp[w - weight[i]]`: Value if the current item is included, plus the maximum value achievable with the remaining capacity.
//		       - `Math.max(...)`: Ensures that `dp[w]` holds the maximum value possible with capacity `w`.
//		   - **Why Iterate Backwards?**: To avoid multiple inclusion of the same item in the knapsack.
//		7. **Return Result**:
//		   - **Return**: `dp[capacity]`, the maximum value that can be achieved with the given capacity.
//		8. **In `main()` Method**:
//		   - **Define**: Knapsack capacity, item weights, and values.
//		   - **Call**: `knapSack(weight, values, capacity)` and print the result.
//		9. **End**: Completion of the Knapsack problem solution.