package pract.computationalalgorithms;

import java.util.*;

public class NaiveTSP {

    // Purpose: Define the graph representing distances between cities
    static int[][] graph = {
        // Explanation: Each row and column represent a city, and the values represent the distance between cities
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };
    
    // Purpose: Determine the number of cities (nodes) in the graph
    static int n = graph.length;

    public static void main(String[] args) {
        // Purpose: Main method to execute the TSP solution

        // Purpose: Create a list to represent the path of cities to be visited
        List<Integer> path = new ArrayList<>();
        
        // Purpose: Initialize the path with the cities (0 to n-1)
        for (int i = 0; i < n; i++) {
            path.add(i);  // Explanation: Adds city `i` to the path
        }
        
        // Purpose: Create an array to store the minimum cost found
        int[] result = new int[1];
        result[0] = Integer.MAX_VALUE;  // Explanation: Initialize with a very large value to find the minimum
        
        // Purpose: Start the permutation process to find all possible paths
        permute(path, 0, path.size() - 1, result);
        
        // Purpose: Print the minimum cost found
        System.out.println("Minimum Cost is: " + result[0]);
    }

    // Purpose: Swap two elements in the path list
    // Parameters:
    //   - List<Integer> path: The list representing the current path
    //   - int i: The first index to swap
    //   - int j: The second index to swap
    static void swap(List<Integer> path, int i, int j) {
        // Explanation: Swaps the elements at indices `i` and `j` in the path
        int temp = path.get(i);
        path.set(i, path.get(j));
        path.set(j, temp);
    }

    // Purpose: Calculate the total cost of the current path
    // Parameters:
    //   - List<Integer> path: The list representing the current path
    // Returns: The total cost of travelling through the given path
    static int calcCost(List<Integer> path) {
        int cost = 0;  // Explanation: Initialize the cost to 0

        // Purpose: Loop through each city in the path to calculate the total travel cost
        for (int i = 0; i < path.size(); i++) {
            int from = path.get(i);  // Explanation: Get the current city
            int to = path.get((i + 1) % path.size());  // Explanation: Get the next city (loop back to start if at the end)
            cost += graph[from][to];  // Explanation: Add the cost of travelling from `from` to `to`
        }

        return cost;  // Explanation: Return the calculated total cost
    }

    // Purpose: Generate all permutations of the path to find the minimum travelling cost
    // Parameters:
    //   - List<Integer> path: The list representing the current path
    //   - int l: The starting index of the current permutation
    //   - int r: The ending index of the current permutation
    //   - int[] result: Array to store the minimum cost found
    static void permute(List<Integer> path, int l, int r, int[] result) {
        // Purpose: Check if the current permutation is complete
        if (l == r) {
            int cost = calcCost(path);  // Explanation: Calculate the cost of the current path
            System.out.println("Checking path: " + path + " with cost: " + cost);
            result[0] = Math.min(result[0], cost);  // Explanation: Update the result with the minimum cost found
        } else {
            // Purpose: Generate permutations by swapping each element with the current starting element
            for (int i = l; i <= r; i++) {
                swap(path, l, i);  // Explanation: Swap the current element with the element at index `i`
                permute(path, l + 1, r, result);  // Explanation: Recursively generate permutations for the remaining elements
                swap(path, l, i);  // Explanation: Swap back to restore the original order for the next iteration
            }
        }
    }
}



//		Here’s a structured flowchart diagram for the `NaiveTSP` class, which outlines the step-by-step process for solving the Traveling Salesman Problem (TSP) using a naive approach:
//		
//		(Start)
//		   |
//		   V
//		(Initialize graph with distances between cities)
//		   |
//		   V
//		(Determine the number of cities (n))
//		   |
//		   V
//		(Initialize the path list with cities [0, 1, 2, ..., n-1])
//		   |
//		   V
//		(Create an array to store the minimum cost with initial value Integer.MAX_VALUE)
//		   |
//		   V
//		(Call permute() to generate all possible paths and find the minimum cost)
//		   |
//		   V
//		(Inside permute():
//		   |
//		   V
//		   (Check if the permutation is complete (l == r))
//		      |
//		      V
//		      (Calculate the cost of the current path using calcCost())
//		         |
//		         V
//		         (Print the current path and its cost)
//		         |
//		         V
//		         (Update minimum cost if the current cost is lower)
//		   |
//		   V
//		   (If permutation is not complete:
//		      |
//		      V
//		      (Loop through each element:
//		         |
//		         V
//		         (Swap elements at indices l and i)
//		         |
//		         V
//		         (Recursively call permute() with updated indices)
//		         |
//		         V
//		         (Swap elements back to restore the original order)
//		   |
//		   V
//		(Print the minimum cost found)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Graph**:
//		   - **Graph**: Define a 2D array `graph` where `graph[i][j]` represents the distance between city `i` and city `j`.
//		3. **Determine Number of Cities**:
//		   - **`n`**: Set the number of cities based on the length of the `graph` array.
//		4. **Initialize Path List**:
//		   - **Path**: Create a list containing city indices `[0, 1, 2, ..., n-1]` to represent the initial path.
//		5. **Create Minimum Cost Array**:
//		   - **Result Array**: Initialize an array `result` with one element set to `Integer.MAX_VALUE` to store the minimum cost found.
//		6. **Call `permute()`**:
//		   - **Generate Permutations**: Start generating all possible permutations of the path to find the minimum travel cost.
//		7. **Inside `permute()`**:
//		   - **Check if Permutation is Complete**:
//		     - **If Complete**:
//		       - **Calculate Cost**: Call `calcCost()` to compute the cost of the current path.
//		       - **Print Path and Cost**: Display the current path and its cost.
//		       - **Update Minimum Cost**: Update the `result