package pract.graphalgorithms;

import java.util.*;

public class BellManFordAlgo {

    // Inner class to represent an edge in the graph
    class Edge {
        int src, dest, weight;

        // Constructor to initialize an edge with source, destination, and weight
        Edge(int src, int dest, int weight) {
            this.src = src;   // Source vertex of the edge
            this.dest = dest; // Destination vertex of the edge
            this.weight = weight; // Weight of the edge
        }
    }

    int V, E; // Number of vertices (V) and edges (E) in the graph
    Edge[] edges; // Array to store edges of the graph

    // Constructor to initialize the graph with given number of vertices and edges
    BellManFordAlgo(int v, int e) {
        V = v; // Set number of vertices
        E = e; // Set number of edges

        edges = new Edge[E]; // Initialize the edges array

        for (int i = 0; i < e; i++) {
            edges[i] = new Edge(0, 0, 0); // Initialize each edge with default values
        }
    }

    // Method to perform the Bellman-Ford algorithm
    void BellManFord(int src) {
        // Argument src: The source vertex from which shortest paths are calculated

        int[] dist = new int[V]; // Array to store the shortest distance from src to each vertex

        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances as infinity
        dist[src] = 0; // Distance to the source vertex is zero

        // Relax all edges V-1 times (where V is the number of vertices)
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < E; j++) {
                int u = edges[j].src; // Source vertex of the edge
                int v = edges[j].dest; // Destination vertex of the edge
                int weight = edges[j].weight; // Weight of the edge

                // If the distance to u is not infinity and adding the weight of edge (u, v) is shorter
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight; // Update the distance to vertex v
                }
            }
        }

        // Check for negative weight cycles
        for (int j = 0; j < E; j++) {
            int u = edges[j].src; // Source vertex of the edge
            int v = edges[j].dest; // Destination vertex of the edge
            int weight = edges[j].weight; // Weight of the edge

            // If we can still reduce the distance, it means there is a negative weight cycle
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph Contains Negative weight cycle"); // Print message if negative cycle is detected
                return; // Exit the method if a negative weight cycle is found
            }
        }

        // Print the shortest distances from the source
        displaySoln(dist);
    }

    // Method to display the shortest distances from the source
    void displaySoln(int[] dist) {
        // Argument dist: Array containing shortest distances from the source vertex

        System.out.println("Vertex Distance From Source ");

        for (int i = 0; i < V; i++) {
            // Print the vertex number and its shortest distance from the source
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        // Number of vertices and edges in the graph
        int V = 5;
        int E = 8;

        // Create a new instance of BellManFordAlgo with the given number of vertices and edges
        BellManFordAlgo bmfa = new BellManFordAlgo(V, E);

        // Add edges to the graph
        bmfa.edges[0] = bmfa.new Edge(0, 1, -1); // Edge from vertex 0 to 1 with weight -1
        bmfa.edges[1] = bmfa.new Edge(0, 2, 4);  // Edge from vertex 0 to 2 with weight 4
        bmfa.edges[2] = bmfa.new Edge(1, 2, 3);  // Edge from vertex 1 to 2 with weight 3
        bmfa.edges[3] = bmfa.new Edge(1, 3, 2);  // Edge from vertex 1 to 3 with weight 2
        bmfa.edges[4] = bmfa.new Edge(1, 4, 2);  // Edge from vertex 1 to 4 with weight 2
        bmfa.edges[5] = bmfa.new Edge(3, 2, 5);  // Edge from vertex 3 to 2 with weight 5
        bmfa.edges[6] = bmfa.new Edge(3, 1, 1);  // Edge from vertex 3 to 1 with weight 1
        bmfa.edges[7] = bmfa.new Edge(4, 3, -3); // Edge from vertex 4 to 3 with weight -3

        // Perform the Bellman-Ford algorithm starting from vertex 0
        bmfa.BellManFord(0);
    }
}

//		Here's a structured flowchart diagram for the `BellManFordAlgo` class, which implements the Bellman-Ford algorithm to find the shortest paths in a graph:
//		
//		(Start)
//		   |
//		   V
//		(Define `BellManFordAlgo` Class)
//		   |
//		   V
//		(Define `Edge` Inner Class)
//		   |
//		   V
//		(Define Constructor `BellManFordAlgo(int v, int e)`)
//		   |
//		   V
//		   - Initialize `V = v` and `E = e`
//		   - Initialize `edges = new Edge[E]`
//		   - Loop to initialize each edge in `edges` array
//		   |
//		   V
//		(Define `BellManFord(int src)` Method)
//		   |
//		   V
//		(Initialize Distance Array):
//		   |
//		   V
//		   - `int[] dist = new int[V]`
//		   - `Arrays.fill(dist, Integer.MAX_VALUE)`
//		   - `dist[src] = 0`
//		   |
//		   V
//		(Relax All Edges V-1 Times):
//		   |
//		   V
//		   (Loop through `i` from 0 to V-2):
//		      |
//		      V
//		      (Loop through `j` from 0 to E-1):
//		         |
//		         V
//		         - Extract `u`, `v`, `weight` from `edges[j]`
//		         - If `dist[u] != Integer.MAX_VALUE` and `dist[u] + weight < dist[v]`:
//		           - Update `dist[v] = dist[u] + weight`
//		   |
//		   V
//		(Check for Negative Weight Cycles):
//		   |
//		   V
//		   (Loop through `j` from 0 to E-1):
//		      |
//		      V
//		      - Extract `u`, `v`, `weight` from `edges[j]`
//		      - If `dist[u] != Integer.MAX_VALUE` and `dist[u] + weight < dist[v]`:
//		        - Print "Graph Contains Negative weight cycle"
//		        - Exit method
//		   |
//		   V
//		(Print Shortest Distances):
//		   |
//		   V
//		   - Call `displaySoln(dist)`
//		   |
//		   V
//		(End)
//		
//		(Define `displaySoln(int[] dist)` Method)
//		   |
//		   V
//		(Print Vertex Distances):
//		   |
//		   V
//		   - Print "Vertex Distance From Source"
//		   - Loop through `i` from 0 to V-1:
//		     - Print `i` and `dist[i]`
//		   |
//		   V
//		(End)
//		
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Initialize Graph Parameters):
//		   |
//		   V
//		   - `int V = 5`
//		   - `int E = 8`
//		   |
//		   V
//		(Create Instance of `BellManFordAlgo`):
//		   |
//		   V
//		   - `BellManFordAlgo bmfa = new BellManFordAlgo(V, E)`
//		   |
//		   V
//		(Add Edges to Graph):
//		   |
//		   V
//		   - Add edges to `bmfa.edges`
//		   |
//		   V
//		(Perform Bellman-Ford Algorithm):
//		   |
//		   V
//		   - Call `bmfa.BellManFord(0)`
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `BellManFordAlgo` Class**: The class to represent the Bellman-Ford algorithm.
//		
//		3. **Define `Edge` Inner Class**:
//		   - Represents an edge in the graph with `src` (source), `dest` (destination), and `weight`.
//		
//		4. **Define Constructor `BellManFordAlgo(int v, int e)`**:
//		   - Initializes the number of vertices (`V`) and edges (`E`).
//		   - Initializes the `edges` array to store the edges.
//		   - Fills the `edges` array with default values.
//		
//		5. **Define `BellManFord(int src)` Method**:
//		   - **Initialize Distance Array**:
//		     - `dist[]` to store shortest distances from the source vertex.
//		     - Set all distances to infinity and the source vertex distance to zero.
//		   - **Relax All Edges V-1 Times**:
//		     - For `V-1` iterations, update the shortest distances using the edges.
//		   - **Check for Negative Weight Cycles**:
//		     - Verify if any further relaxation is possible, indicating a negative weight cycle.
//		     - Print a message and exit if a negative cycle is detected.
//		   - **Print Shortest Distances**:
//		     - Call `displaySoln(dist)` to display the shortest distances from the source.
//		
//		6. **Define `displaySoln(int[] dist)` Method**:
//		   - **Print Vertex Distances**:
//		     - Print the shortest distance from the source for each vertex.
//		
//		7. **Define `main(String[] args)` Method**:
//		   - **Initialize Graph Parameters**:
//		     - Define the number of vertices (`V`) and edges (`E`).
//		   - **Create Instance of `BellManFordAlgo`**:
//		     - Instantiate the `BellManFordAlgo` class with the defined parameters.
//		   - **Add Edges to Graph**:
//		     - Populate the `edges` array with actual edge data.
//		   - **Perform Bellman-Ford Algorithm**:
//		     - Execute the Bellman-Ford algorithm starting from vertex `0`.
//		
//		8. **End**: Completion of the algorithm execution and output.