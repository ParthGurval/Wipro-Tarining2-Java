package pract.computationalalgorithms;

import java.util.*;

public class TSPUsingMST {

    public static void main(String[] args) {
        // Purpose: Main method to execute the TSP solution using MST approximation
        
        // Purpose: Define the graph representing distances between cities
        int[][] graph = {
            // Explanation: Each row and column represent a city, and the values represent the distance between cities
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        
        // Purpose: Calculate and print the approximate TSP cost using the MST-based method
        System.out.println("Approximate TSP cost (using MST): " + calcTSPCost(graph));
    }

    // Purpose: Calculate the approximate TSP cost using a Minimum Spanning Tree (MST) approach
    // Parameters:
    //   - int[][] graph: The adjacency matrix representing the graph
    // Returns: The approximate TSP cost based on the MST
    static int calcTSPCost(int[][] graph) {
        
        int n = graph.length;  // Explanation: Number of cities (nodes) in the graph
        
        // Purpose: Initialize an array to keep track of visited nodes
        boolean[] visited = new boolean[n];
        
        // Purpose: Initialize an array to store the minimum edge weight to connect a node to the MST
        int[] key = new int[n];
        
        // Purpose: Initialize an array to store the parent of each node in the MST
        int[] parent = new int[n];
        
        // Purpose: Fill the `key` array with a large value to represent infinity (unreachable nodes)
        Arrays.fill(key, Integer.MAX_VALUE);
        
        // Purpose: Start the MST from the first node (node 0)
        key[0] = 0;
        parent[0] = -1;  // Explanation: Root node of MST has no parent
        
        // Purpose: Create a priority queue to pick the next minimum edge
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> key[i]));
        
        // Purpose: Add the starting node (0) to the priority queue
        pq.add(0);
        
        // Purpose: Loop until the priority queue is empty (all nodes are added to the MST)
        while (!pq.isEmpty()) {
            
            // Purpose: Extract the node with the minimum key value from the priority queue
            int u = pq.poll();
            visited[u] = true;  // Explanation: Mark this node as visited
            
            // Purpose: Iterate through all adjacent nodes of the extracted node
            for (int v = 0; v < n; v++) {
                
                // Purpose: Check if there is an edge from `u` to `v` and `v` is not yet included in the MST
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < key[v]) {
                    
                    // Explanation: Update the key value and parent for node `v`
                    key[v] = graph[u][v];
                    pq.add(v);  // Explanation: Add `v` to the priority queue for further processing
                    parent[v] = u;  // Explanation: Update parent of `v` to be `u` in the MST
                }
            }
        }
        
        int mstWeight = 0;  // Explanation: Initialize the total weight of the MST
        
        // Purpose: Calculate the total weight of the constructed MST
        for (int i = 1; i < n; i++) {
            mstWeight += graph[i][parent[i]];  // Explanation: Add the weight of each edge in the MST
        }
        
        // Purpose: Return the approximate TSP cost, which is twice the weight of the MST
        return 2 * mstWeight;
    }
}

//		Here’s a structured flowchart diagram for the `TSPUsingMST` class, outlining the step-by-step process for solving the Traveling Salesman Problem (TSP) using the Minimum Spanning Tree (MST) approximation:
//		
//		(Start)
//		   |
//		   V
//		(Define `main()` Method)
//		   |
//		   V
//		(Define Graph Representation):
//		   |
//		   V
//		   - `int[][] graph`: Adjacency matrix representing distances between cities.
//		   |
//		   V
//		(Call `calcTSPCost(graph)`):
//		   |
//		   V
//		(Print Approximate TSP Cost):
//		   |
//		   V
//		(End)
//		
//		(Define `calcTSPCost(int[][] graph)` Method)
//		   |
//		   V
//		(Initialize Variables):
//		   |
//		   V
//		   - `int n = graph.length`: Number of cities (nodes).
//		   - `boolean[] visited = new boolean[n]`: Track visited nodes.
//		   - `int[] key = new int[n]`: Minimum edge weight to connect a node to the MST.
//		   - `int[] parent = new int[n]`: Parent of each node in the MST.
//		   |
//		   V
//		(Fill `key` Array with Infinity):
//		   |
//		   V
//		   - `Arrays.fill(key, Integer.MAX_VALUE)`
//		   |
//		   V
//		(Start MST from First Node):
//		   |
//		   V
//		   - `key[0] = 0`
//		   - `parent[0] = -1` (Root node)
//		   |
//		   V
//		(Create and Initialize Priority Queue):
//		   |
//		   V
//		   - `PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> key[i]))`
//		   - `pq.add(0)` (Add starting node to the queue)
//		   |
//		   V
//		(Loop Until Priority Queue is Empty):
//		   |
//		   V
//		   (Extract Node with Minimum Key Value):
//		      |
//		      V
//		      - `int u = pq.poll()`
//		      - `visited[u] = true`
//		      |
//		      V
//		   (Iterate Through Adjacent Nodes):
//		      |
//		      V
//		      (Check Edge and Update Values):
//		         |
//		         V
//		         - If edge `u` to `v` exists and `v` is not visited:
//		            |
//		            V
//		            - `if (graph[u][v] < key[v])`
//		               |
//		               V
//		               - Update `key[v]` and `parent[v]`
//		               - Add `v` to the priority queue
//		   |
//		   V
//		(Calculate MST Weight):
//		   |
//		   V
//		   - `int mstWeight = 0`
//		   - Loop through nodes:
//		     |
//		     V
//		     - `mstWeight += graph[i][parent[i]]`
//		   |
//		   V
//		(Return Approximate TSP Cost):
//		   |
//		   V
//		   - Return `2 * mstWeight`
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		2. **Define `main()` Method**:
//		   - **Purpose**: To execute the TSP solution using MST approximation.
//		   - **Define Graph Representation**: 
//		     - `int[][] graph`: Represents the distances between cities.
//		   - **Call `calcTSPCost(graph)`**: Calculate the TSP cost.
//		   - **Print Approximate TSP Cost**: Display the result.
//		3. **Define `calcTSPCost(int[][] graph)` Method**:
//		   - **Initialize Variables**:
//		     - `int n = graph.length`: Number of cities (nodes).
//		     - `boolean[] visited = new boolean[n]`: To track visited nodes.
//		     - `int[] key = new int[n]`: Minimum edge weight for MST connection.
//		     - `int[] parent = new int[n]`: Stores the parent node in MST.
//		   - **Fill `key` Array with Infinity**: Initialize all `key` values to infinity.
//		   - **Start MST from First Node**:
//		     - Set the key of the starting node (0) to 0.
//		     - Set the parent of the starting node to -1 (root node).
//		   - **Create and Initialize Priority Queue**:
//		     - Use a priority queue to process nodes based on the minimum key value.
//		   - **Loop Until Priority Queue is Empty**:
//		     - Extract the node with the minimum key value.
//		     - Mark the node as visited.
//		     - Iterate through adjacent nodes:
//		       - Update the key and parent for nodes connected by the minimum edge.
//		   - **Calculate MST Weight**:
//		     - Initialize `mstWeight`.
//		     - Sum the weights of the edges in the MST.
//		   - **Return Approximate TSP Cost**:
//		     - Return twice the weight of the MST as the TSP approximation.
//		4. **End**: Completion of the TSP approximation solution.