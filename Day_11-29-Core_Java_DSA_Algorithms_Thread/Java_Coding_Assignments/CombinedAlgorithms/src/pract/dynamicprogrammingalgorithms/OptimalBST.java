package pract.dynamicprogrammingalgorithms;

public class OptimalBST {

    // Purpose: Function to calculate the cost of the Optimal Binary Search Tree (BST)
//	keys: This is an array of integers representing the keys or values that will be used to construct the optimal binary search tree (BST). 
//	Each element in this array is a key that will be inserted into the BST.
//
//	n: This is an integer representing the number of keys in the keys array. It denotes the size of the array and is used to determine the 
//	dimensions of the cost matrix and the range of subtrees to be considered.
    static int optimalBST(int[] keys, int n) {
        // Purpose: Create a 2D array to store the cost of optimal BST for keys[i...j]
        int[][] cost = new int[n][n];
//        int[n][n] creates a 2D array with n rows and n columns, where each element is of type int. 
//        It initializes a square matrix of size n x n for storing integer values.

        // Purpose: Initialize the diagonal elements of the cost matrix (single key) to 0
        for (int i = 0; i < n; i++) {
            cost[i][i] = 0;  // Single key costs 0 as there are no left or right subtrees
        }

        // Purpose: Fill the cost matrix for subtrees of increasing lengths
        for (int length = 2; length <= n; length++) {  // length of the subtree
            for (int i = 0; i <= n - length; i++) {  // start index of the subtree
                int j = i + length - 1;  // end index of the subtree
                cost[i][j] = Integer.MAX_VALUE;  // Initialize cost to a large value

                // Purpose: Find the optimal root for the subtree keys[i...j]
                for (int r = i; r <= j; r++) {  // Try each key as the root
                    // Purpose: Calculate cost if r is the root of the subtree keys[i...j]
                    int c = ((r > i) ? cost[i][r - 1] : 0) +  // Cost of left subtree
                            ((r < j) ? cost[r + 1][j] : 0) +  // Cost of right subtree
                            sum(keys, i, j);  // Cost of keys[i...j]

                    // Purpose: Update cost[i][j] with the minimum cost found
                    if (c < cost[i][j]) {
                        cost[i][j] = c;  // Set the optimal cost for keys[i...j]
                    }
                }
            }
        }

        // Purpose: Return the cost of the optimal BST for the entire range keys[0...n-1]
        return cost[0][n - 1];
    }

    // Purpose: Calculate the sum of keys[i...j]
//    i: This is the starting index of the range within the keys array for which the sum is to be calculated. It indicates the beginning of the subset of keys.
//
//    j: This is the ending index of the range within the keys array for which the sum is to be calculated. It indicates the end of the subset of keys.
    static int sum(int[] keys, int i, int j) {
        int s = 0;  // Initialize sum to 0
        for (int k = i; k <= j; k++) {
            s += keys[k];  // Add each key to the sum
        }
        return s;  // Return the total sum
    }

    // Purpose: Main function to test the optimalBST function
    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40, 50, 60, 70};  // Array of keys
        int n = keys.length;  // Number of keys

        // Purpose: Print the cost of the optimal BST for the given keys
        System.out.println("The Cost of Optimal BST is " + optimalBST(keys, n));
    }
}



//		Here’s a structured flowchart diagram for the `OptimalBST` class, which calculates the cost of the Optimal Binary Search Tree (BST):
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `main()` Method)
//		   |
//		   V
//		(Initialize Arrays):
//		   |
//		   V
//		   - `int[] keys = {10, 20, 30, 40, 50, 60, 70}`
//		   - `int n = keys.length`
//		   |
//		   V
//		(Call `optimalBST(keys, n)`):
//		   |
//		   V
//		(Print Cost of Optimal BST):
//		   |
//		   V
//		(End)
//		
//		(Define `optimalBST(int[] keys, int n)` Method)
//		   |
//		   V
//		(Initialize Cost Matrix):
//		   |
//		   V
//		   - `int[][] cost = new int[n][n]`
//		   |
//		   V
//		(Initialize Diagonal Elements of Cost Matrix):
//		   |
//		   V
//		   - Loop through `i` from 0 to `n-1`
//		     - Set `cost[i][i] = 0`
//		   |
//		   V
//		(Fill Cost Matrix for Subtrees of Increasing Lengths):
//		   |
//		   V
//		   (Loop through `length` from 2 to `n`):
//		      |
//		      V
//		      (Loop through `i` from 0 to `n - length`):
//		         |
//		         V
//		         - Set `j = i + length - 1`
//		         - Initialize `cost[i][j] = Integer.MAX_VALUE`
//		         |
//		         V
//		         (Loop through `r` from `i` to `j`):
//		            |
//		            V
//		            - Calculate Cost `c`:
//		              - `c = ((r > i) ? cost[i][r - 1] : 0) + ((r < j) ? cost[r + 1][j] : 0) + sum(keys, i, j)`
//		            |
//		            V
//		            - Update `cost[i][j]` if `c < cost[i][j]`
//		   |
//		   V
//		(Return Cost of Optimal BST):
//		   |
//		   V
//		   - `return cost[0][n - 1]`
//		   |
//		   V
//		(End)
//		
//		(Define `sum(int[] keys, int i, int j)` Method)
//		   |
//		   V
//		(Initialize Sum):
//		   |
//		   V
//		   - `int s = 0`
//		   |
//		   V
//		(Add Keys from `i` to `j` to Sum):
//		   |
//		   V
//		   - Loop through `k` from `i` to `j`
//		     - Add `keys[k]` to `s`
//		   |
//		   V
//		(Return Sum):
//		   |
//		   V
//		   - `return s`
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `main()` Method**:
//		   - **Initialize Arrays**:
//		     - `int[] keys = {10, 20, 30, 40, 50, 60, 70}`: Array of keys for the BST.
//		     - `int n = keys.length`: Number of keys.
//		   - **Call `optimalBST(keys, n)`**: Compute the cost of the optimal BST.
//		   - **Print Cost of Optimal BST**: Display the result.
//		
//		3. **Define `optimalBST(int[] keys, int n)` Method**:
//		   - **Initialize Cost Matrix**:
//		     - `int[][] cost = new int[n][n]`: Create a 2D array to store the cost of optimal BST for subtrees.
//		   - **Initialize Diagonal Elements of Cost Matrix**:
//		     - Loop through `i` from 0 to `n-1` and set `cost[i][i] = 0` (cost of a single key is zero).
//		   - **Fill Cost Matrix for Subtrees of Increasing Lengths**:
//		     - **Loop through `length` from 2 to `n`**: Subtree lengths.
//		     - **Loop through `i` from 0 to `n - length`**: Start index of the subtree.
//		       - Set `j = i + length - 1`: End index of the subtree.
//		       - Initialize `cost[i][j]` to `Integer.MAX_VALUE` to find the minimum cost.
//		       - **Loop through `r` from `i` to `j`**: Try each key as the root.
//		         - Calculate Cost `c`:
//		           - Left subtree cost: `cost[i][r - 1]` if `r > i`, otherwise 0.
//		           - Right subtree cost: `cost[r + 1][j]` if `r < j`, otherwise 0.
//		           - Total cost: Add the sum of keys from `i` to `j` using the `sum()` method.
//		         - Update `cost[i][j]` if `c` is smaller than the current cost.
//		   - **Return Cost of Optimal BST**:
//		     - Return `cost[0][n - 1]`, which holds the cost of the optimal BST for the entire range of keys.
//		
//		4. **Define `sum(int[] keys, int i, int j)` Method**:
//		   - **Initialize Sum**:
//		     - `int s = 0`: Initialize the sum to zero.
//		   - **Add Keys from `i` to `j` to Sum**:
//		     - Loop through `k` from `i` to `j` and add `keys[k]` to `s`.
//		   - **Return Sum**:
//		     - Return the total sum of the keys from index `i` to `j`.
//		
//		5. **End**: Completion of BST cost calculation and output.