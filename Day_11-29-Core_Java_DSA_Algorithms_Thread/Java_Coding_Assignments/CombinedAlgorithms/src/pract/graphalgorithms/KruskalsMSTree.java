package pract.graphalgorithms; // Declares the package name

import java.util.*; // Imports the Java utility package for data structures

public class KruskalsMSTree {
    
    // Inner class to represent an edge in the graph
    static class Edge implements Comparable<Edge> {
        
        int src, dest, weight; // Source and destination vertices, and the weight of the edge
        
        // Constructor to initialize an edge
        Edge(int src, int dest, int weight) {
            this.src = src;      // Set source vertex
            this.dest = dest;    // Set destination vertex
            this.weight = weight;// Set weight of the edge
        }
        
        // Method to compare edges based on weight for sorting
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight; // Compare by weight
        }
    }
    
    int V; // Number of vertices in the graph
    List<Edge> edge = new ArrayList<>(); // List to store all edges
    
    // Constructor to initialize the graph with the number of vertices
    KruskalsMSTree(int V) {
        this.V = V; // Set number of vertices
    }
    
    // Method to add an edge to the graph
    void addEdge(int src, int dest, int weight) {
        edge.add(new Edge(src, dest, weight)); // Add a new edge with given source, destination, and weight
    }
    
    // Method to find the root of the set in which the element i belongs
    int find(int[] parent, int i) {
        if (parent[i] != i) { // If i is not the root
            parent[i] = find(parent, parent[i]); // Path compression: set parent of i directly to the root
        }
        return parent[i]; // Return the root of the set
    }
    
    // Method to union two sets
    void union(int[] parent, int[] rank, int x, int y) {
        int xroot = find(parent, x); // Find root of x
        int yroot = find(parent, y); // Find root of y
        
        if (rank[xroot] < rank[yroot]) { // Union by rank: attach smaller tree under larger tree
            parent[xroot] = yroot;
        } else if (rank[xroot] > rank[yroot]) {
            parent[yroot] = xroot;
        } else { // If ranks are the same, make one root of the other and increase its rank
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }
    
    // Method to perform Kruskal's algorithm to find the Minimum Spanning Tree (MST)
    void KruskalsMSTree() {
        Collections.sort(edge); // Sort all edges by weight
        
        int[] parent = new int[V]; // Array to store parent of each vertex
        int[] rank = new int[V];   // Array to store rank (depth) of each set
        
        for (int i = 0; i < V; i++) {
            parent[i] = i; // Initialize parent of each vertex to itself
            rank[i] = 0;  // Initialize rank to 0
        }
        
        List<Edge> result = new ArrayList<>(); // List to store edges of the MST
        
        for (Edge e : edge) {
            int x = find(parent, e.src); // Find root of the set containing src
            int y = find(parent, e.dest); // Find root of the set containing dest
            
            if (x != y) { // If src and dest are in different sets
                result.add(e); // Add edge to result (MST)
                union(parent, rank, x, y); // Union the sets containing src and dest
            }
        }
        
        System.out.println("Edges in the constructing MST: ");
        
        int minimumCost = 0; // Variable to store the total cost of the MST
        
        for (Edge edge : result) {
            System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight); // Print edge and its weight
            minimumCost += edge.weight; // Add weight to the total cost
        }
        
        System.out.println("Minimum Cost Spanning Tree: " + minimumCost); // Print the total cost of the MST
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices in the graph
        
        KruskalsMSTree graph = new KruskalsMSTree(V); // Create a new graph with V vertices
        
        // Add edges to the graph
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);
        
        graph.KruskalsMSTree(); // Compute and print the Minimum Spanning Tree (MST)
    }
}


//		Here's a structured flowchart diagram for the `KruskalsMSTree` class, which implements Kruskal's algorithm to find the Minimum Spanning Tree (MST) of a graph:
//		
//		(Start)
//		   |
//		   V
//		(Define `KruskalsMSTree` Class)
//		   |
//		   V
//		(Define `Edge` Inner Class)
//		   |
//		   V
//		   (Constructor `Edge(int src, int dest, int weight)`)
//		   |
//		   V
//		   (Method `compareTo(Edge compareEdge)`)
//		   |
//		   V
//		(Define Fields in `KruskalsMSTree` Class)
//		   |
//		   V
//		   - `int V`: Number of vertices
//		   - `List<Edge> edge`: List to store edges
//		   |
//		   V
//		(Define `KruskalsMSTree(int V)` Constructor)
//		   |
//		   V
//		   - Initialize `V`
//		   |
//		   V
//		(Define `addEdge(int src, int dest, int weight)` Method)
//		   |
//		   V
//		   - Add edge to `edge` list
//		   |
//		   V
//		(Define `find(int[] parent, int i)` Method)
//		   |
//		   V
//		   - Check if `parent[i] != i`
//		   - Apply path compression
//		   - Return root of the set
//		   |
//		   V
//		(Define `union(int[] parent, int[] rank, int x, int y)` Method)
//		   |
//		   V
//		   - Find roots of `x` and `y`
//		   - Union by rank
//		   |
//		   V
//		(Define `KruskalsMSTree()` Method)
//		   |
//		   V
//		   (Sort Edges by Weight)
//		   |
//		   V
//		   (Initialize `parent[]` and `rank[]`)
//		   |
//		   V
//		   (Loop through Sorted Edges):
//		      |
//		      V
//		      (Find Roots of `src` and `dest`)
//		      |
//		      V
//		      - Check if roots are different
//		      - Add edge to `result`
//		      - Perform union
//		   |
//		   V
//		   (Print Edges in MST and Total Cost)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `KruskalsMSTree` Class**: The class to represent Kruskal's algorithm implementation.
//		
//		3. **Define `Edge` Inner Class**:
//		   - **Constructor `Edge(int src, int dest, int weight)`**: Initializes an edge with source, destination, and weight.
//		   - **Method `compareTo(Edge compareEdge)`**: Compares edges based on their weight for sorting.
//		
//		4. **Define Fields in `KruskalsMSTree` Class**:
//		   - `int V`: Number of vertices in the graph.
//		   - `List<Edge> edge`: List to store edges of the graph.
//		
//		5. **Define `KruskalsMSTree(int V)` Constructor**:
//		   - Initializes the number of vertices `V`.
//		
//		6. **Define `addEdge(int src, int dest, int weight)` Method**:
//		   - Adds an edge with specified source, destination, and weight to the `edge` list.
//		
//		7. **Define `find(int[] parent, int i)` Method**:
//		   - Finds the root of the set containing vertex `i` with path compression.
//		
//		8. **Define `union(int[] parent, int[] rank, int x, int y)` Method**:
//		   - Unites two sets by rank.
//		
//		9. **Define `KruskalsMSTree()` Method**:
//		   - **Sort Edges by Weight**: Sorts the edges based on their weights.
//		   - **Initialize `parent[]` and `rank[]`**: Sets initial values for parent and rank arrays.
//		   - **Loop through Sorted Edges**:
//		     - Finds roots of the source and destination vertices.
//		     - If they belong to different sets, adds the edge to the MST and performs union.
//		   - **Print Edges in MST and Total Cost**: Displays the edges included in the MST and the total cost.
//		
//		10. **End**: Completion of the algorithm execution and output.
//		
//		This flowchart outlines the steps to implement Kruskal's algorithm for finding the Minimum Spanning Tree, including edge management, union-find operations, and MST calculation.