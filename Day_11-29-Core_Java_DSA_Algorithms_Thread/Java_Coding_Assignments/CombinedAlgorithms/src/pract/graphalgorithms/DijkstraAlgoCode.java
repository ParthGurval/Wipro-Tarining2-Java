package pract.graphalgorithms;

import java.util.*;

public class DijkstraAlgoCode {
	
    // Method to perform Dijkstra's algorithm
    public static int[] dijkstra(int[][] graph, int source) {
        // Argument graph: 2D array representing the adjacency matrix of the graph
        // Argument source: The starting vertex for which shortest paths are computed
        
        int n = graph.length; // Number of vertices in the graph
        
        int[] dist = new int[n]; // Array to store the shortest distance from source to each vertex
        
        boolean[] visited = new boolean[n]; // Array to track visited vertices
        
        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances as infinity
        dist[source] = 0; // Distance to the source vertex is zero
        
        // Loop to find the shortest path for all vertices
        for (int i = 0; i < n - 1; i++) {
            // Find the vertex with the minimum distance value from the set of vertices not yet processed
            int u = minDist(dist, visited);
            
            visited[u] = true; // Mark the selected vertex as visited
            
            // Update the distance value of the adjacent vertices of the selected vertex
            for (int v = 0; v < n; v++) {
                // Check if there is an edge from u to v, and the vertex v is not yet processed
                // Also check if the total distance from source to v through u is smaller
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v]; // Update the distance to vertex v
                }
            }
        }
        
        return dist; // Return the array containing shortest distances from the source
    }
    
    // Method to find the vertex with the minimum distance value from the set of vertices not yet processed
    public static int minDist(int[] dist, boolean[] visited) {
        // Argument dist: Array containing the shortest distances from the source vertex
        // Argument visited: Array indicating whether a vertex has been processed
        
        int min = Integer.MAX_VALUE; // Initialize minimum distance value
        int minIndex = -1; // Initialize index of the vertex with minimum distance
        
        // Loop to find the vertex with the smallest distance value
        for (int v = 0; v < dist.length; v++) {
            // Check if the vertex is not yet processed and has a smaller distance value
            if (!visited[v] && dist[v] <= min) {
                min = dist[v]; // Update minimum distance value
                minIndex = v; // Update index of the vertex with minimum distance
            }
        }
        
        return minIndex; // Return the index of the vertex with the minimum distance value
    }
    
    // Method to display the shortest distances from the source vertex
    public static void displaySoln(int[] dist) {
        // Argument dist: Array containing shortest distances from the source vertex
        
        System.out.println("Vertex \t\t Distance from source");
        
        // Loop to print the vertex number and its shortest distance from the source
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
    
    // Method to get the shortest distance to a specific node
    public static int shortestPath(int[] dist, int node) {
        // Argument dist: Array containing shortest distances from the source vertex
        // Argument node: The target vertex for which the shortest distance is queried
        
        return dist[node]; // Return the shortest distance to the target vertex
    }

    public static void main(String[] args) {
        // Example graph represented by an adjacency matrix
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        
        // Calculate shortest distances from vertex 0
        int[] totDist = dijkstra(graph, 0);
        
        // Display the shortest distances from vertex 0
        displaySoln(totDist);
        
        // Target node for which shortest distance is to be queried
        int tgtNode = 4;
        
        // Print the shortest distance from vertex 0 to the target node
        System.out.println("\nShortest Distance from node 0 to node " + tgtNode + " is: " + shortestPath(totDist, tgtNode));
    }
}

//		Here's a structured flowchart diagram for the `DijkstraAlgoCode` class, which implements Dijkstra's algorithm to find the shortest paths from a source vertex in a weighted graph:
//		
//		(Start)
//		   |
//		   V
//		(Define `DijkstraAlgoCode` Class)
//		   |
//		   V
//		(Define `dijkstra(int[][] graph, int source)` Method)
//		   |
//		   V
//		(Initialize Variables):
//		   |
//		   V
//		   - `int n = graph.length` (Number of vertices)
//		   - `int[] dist = new int[n]` (Array for shortest distances)
//		   - `boolean[] visited = new boolean[n]` (Array to track visited vertices)
//		   - `Arrays.fill(dist, Integer.MAX_VALUE)` (Initialize distances to infinity)
//		   - `dist[source] = 0` (Distance to source vertex is zero)
//		   |
//		   V
//		(Find Shortest Path for All Vertices):
//		   |
//		   V
//		   (Loop through `i` from 0 to n-2):
//		      |
//		      V
//		      - Call `minDist(dist, visited)` to find the vertex with minimum distance
//		      - Set `visited[u] = true` (Mark the selected vertex as visited)
//		      |
//		      V
//		      (Loop through `v` from 0 to n-1):
//		         |
//		         V
//		         - Check if there's an edge from `u` to `v`, and `v` is not processed
//		         - Check if `dist[u] + graph[u][v] < dist[v]`
//		         - Update `dist[v] = dist[u] + graph[u][v]`
//		   |
//		   V
//		(Return Shortest Distances):
//		   |
//		   V
//		   - Return `dist` array
//		   |
//		   V
//		(Define `minDist(int[] dist, boolean[] visited)` Method)
//		   |
//		   V
//		(Find Vertex with Minimum Distance):
//		   |
//		   V
//		   - Initialize `min = Integer.MAX_VALUE`
//		   - Initialize `minIndex = -1`
//		   |
//		   V
//		   (Loop through `v` from 0 to dist.length - 1):
//		      |
//		      V
//		      - Check if vertex `v` is not processed and `dist[v]` is smaller than `min`
//		      - Update `min` and `minIndex`
//		   |
//		   V
//		(Return Vertex Index with Minimum Distance):
//		   |
//		   V
//		   - Return `minIndex`
//		   |
//		   V
//		(Define `displaySoln(int[] dist)` Method)
//		   |
//		   V
//		(Print Vertex Distances):
//		   |
//		   V
//		   - Print "Vertex \t\t Distance from source"
//		   - Loop through `i` from 0 to dist.length - 1:
//		     - Print `i` and `dist[i]`
//		   |
//		   V
//		(Define `shortestPath(int[] dist, int node)` Method)
//		   |
//		   V
//		(Return Shortest Distance to Target Node):
//		   |
//		   V
//		   - Return `dist[node]`
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Initialize Example Graph):
//		   |
//		   V
//		   - Define graph as a 2D adjacency matrix
//		   |
//		   V
//		(Calculate Shortest Distances):
//		   |
//		   V
//		   - Call `dijkstra(graph, 0)` to find shortest distances from vertex 0
//		   |
//		   V
//		(Display Shortest Distances):
//		   |
//		   V
//		   - Call `displaySoln(totDist)` to print distances
//		   |
//		   V
//		(Query Shortest Distance to Target Node):
//		   |
//		   V
//		   - Define target node `tgtNode = 4`
//		   - Print shortest distance from vertex 0 to `tgtNode`
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `DijkstraAlgoCode` Class**: The class to represent Dijkstra's algorithm implementation.
//		
//		3. **Define `dijkstra(int[][] graph, int source)` Method**:
//		   - **Initialize Variables**:
//		     - `n`: Number of vertices.
//		     - `dist[]`: Array to store the shortest distances from the source.
//		     - `visited[]`: Array to track if a vertex has been processed.
//		     - Initialize distances to infinity and set the source vertex distance to zero.
//		   - **Find Shortest Path for All Vertices**:
//		     - Loop through all vertices to process the shortest path.
//		     - Use `minDist` method to get the vertex with the smallest distance.
//		     - Update distances for adjacent vertices of the selected vertex.
//		   - **Return Shortest Distances**:
//		     - Return the `dist` array containing shortest distances from the source vertex.
//		
//		4. **Define `minDist(int[] dist, boolean[] visited)` Method**:
//		   - **Find Vertex with Minimum Distance**:
//		     - Initialize `min` and `minIndex`.
//		     - Loop through vertices to find the vertex with the minimum distance value that hasn't been visited.
//		   - **Return Vertex Index with Minimum Distance**:
//		     - Return the index of the vertex with the minimum distance.
//		
//		5. **Define `displaySoln(int[] dist)` Method**:
//		   - **Print Vertex Distances**:
//		     - Print the shortest distance from the source for each vertex.
//		
//		6. **Define `shortestPath(int[] dist, int node)` Method**:
//		   - **Return Shortest Distance to Target Node**:
//		     - Return the shortest distance to the specified node.
//		
//		7. **Define `main(String[] args)` Method**:
//		   - **Initialize Example Graph**:
//		     - Define a sample graph using an adjacency matrix.
//		   - **Calculate Shortest Distances**:
//		     - Call the `dijkstra` method to compute shortest distances from the source vertex.
//		   - **Display Shortest Distances**:
//		     - Print the distances using `displaySoln`.
//		   - **Query Shortest Distance to Target Node**:
//		     - Print the shortest distance from the source to a specific target node.
//		
//		8. **End**: Completion of the algorithm execution and output.