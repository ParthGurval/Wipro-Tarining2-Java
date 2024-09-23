package pract.graphalgorithms;

public class FloydWarshallAlgo {
	
	final static int INF = 99999; // Define a constant for infinity, representing no path between vertices
	
	// Method to perform Floyd-Warshall algorithm to find shortest paths between all pairs of vertices
	void floydWarshall(int graph[][], int V) {
		// Argument graph: 2D array representing the adjacency matrix of the graph
		// Argument V: Number of vertices in the graph
		
		int dist[][] = new int[V][V]; // Create a 2D array to store shortest distances between each pair of vertices
		
		// Initialize the distance array with the values from the input graph
		for(int i = 0; i < V; i++) {
			for(int j = 0; j < V; j++) {
				dist[i][j] = graph[i][j]; // Copy the initial distances from the graph
			}
		}
		
		// Apply the Floyd-Warshall algorithm to update distances between all pairs of vertices
		for(int k = 0; k < V; k++) { // Iterate over all possible intermediate vertices
			for(int i = 0; i < V; i++) { // Iterate over all source vertices
				for(int j = 0; j < V; j++) { // Iterate over all destination vertices
					// Update the distance if a shorter path is found through vertex k
					if(dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		printSoln(dist, V); // Call method to print the shortest distances
	}

	// Method to print the shortest distance matrix
	void printSoln(int dist[][], int V) {
		// Argument dist: 2D array containing shortest distances between every pair of vertices
		// Argument V: Number of vertices in the graph
		
		System.out.println("Shortest distance between every pair of vertices: ");
		
		for(int i = 0; i < V; i++) { // Iterate over each row of the distance matrix
			for(int j = 0; j < V; j++) { // Iterate over each column of the distance matrix
				// Print "INF" if the distance is infinity, otherwise print the distance
				if(dist[i][j] == INF) {
					System.out.print("INF" + "  ");
				} else {
					System.out.print(dist[i][j] + "  ");
				}
			}
			System.out.println(); // Print a new line after each row
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V = 5; // Number of vertices in the graph
		
		// Adjacency matrix representation of the graph
		int graph[][] = {
			{0, 4, 2, INF, 1}, // Distances from vertex 0
			{INF, 0, INF, INF, 6}, // Distances from vertex 1
			{1, INF, 0, 3, INF}, // Distances from vertex 2
			{INF, INF, INF, 0, 2}, // Distances from vertex 3
			{INF, INF, INF, 4, 0} // Distances from vertex 4
		};
		
		FloydWarshallAlgo fwa = new FloydWarshallAlgo(); // Create an instance of the FloydWarshallAlgo class
		
		fwa.floydWarshall(graph, V); // Call the Floyd-Warshall method to find and print shortest paths
	}
}


//		Here's a structured flowchart diagram for the `FloydWarshallAlgo` class, which implements the Floyd-Warshall algorithm to find shortest paths between all pairs of vertices in a weighted graph:
//		
//		(Start)
//		   |
//		   V
//		(Define `FloydWarshallAlgo` Class)
//		   |
//		   V
//		(Define `floydWarshall(int[][] graph, int V)` Method)
//		   |
//		   V
//		(Initialize Distance Matrix):
//		   |
//		   V
//		   - Create 2D array `dist[][]` to store shortest distances
//		   - Copy initial distances from `graph` to `dist`
//		   |
//		   V
//		(Apply Floyd-Warshall Algorithm):
//		   |
//		   V
//		   (Loop through `k` from 0 to V-1):
//		      |
//		      V
//		      (Loop through `i` from 0 to V-1):
//		         |
//		         V
//		         (Loop through `j` from 0 to V-1):
//		            |
//		            V
//		            - Check if `dist[i][k] + dist[k][j] < dist[i][j]`
//		            - Update `dist[i][j] = dist[i][k] + dist[k][j]` if true
//		   |
//		   V
//		(Call `printSoln(dist, V)` Method to Print Shortest Distances)
//		   |
//		   V
//		(Define `printSoln(int[][] dist, int V)` Method)
//		   |
//		   V
//		(Print Shortest Distance Matrix):
//		   |
//		   V
//		   - Print header "Shortest distance between every pair of vertices:"
//		   - Loop through each row `i` from 0 to V-1:
//		      |
//		      V
//		      (Loop through each column `j` from 0 to V-1):
//		         |
//		         V
//		         - Print "INF" if `dist[i][j] == INF`
//		         - Otherwise, print `dist[i][j]`
//		   |
//		   V
//		(End Row)
//		   |
//		   V
//		(End Column)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `FloydWarshallAlgo` Class**: The class to represent the Floyd-Warshall algorithm implementation.
//		
//		3. **Define `floydWarshall(int[][] graph, int V)` Method**:
//		   - **Initialize Distance Matrix**:
//		     - Create a 2D array `dist[][]` to store the shortest distances between each pair of vertices.
//		     - Copy initial values from the `graph` matrix into the `dist` matrix.
//		   - **Apply Floyd-Warshall Algorithm**:
//		     - Iterate over all possible intermediate vertices `k`.
//		     - For each source vertex `i`, and each destination vertex `j`, check if a shorter path exists through vertex `k`.
//		     - Update the distance `dist[i][j]` if a shorter path is found.
//		
//		4. **Call `printSoln(dist, V)` Method to Print Shortest Distances**:
//		   - **Print Shortest Distance Matrix**:
//		     - Print the header "Shortest distance between every pair of vertices".
//		     - Loop through each row `i` and each column `j` of the `dist` matrix.
//		     - Print "INF" if the distance is `INF`, otherwise print the distance value.
//		
//		5. **End**: Completion of the algorithm execution and output.
//		
//		This flowchart represents the process of calculating and displaying the shortest paths between all pairs of vertices using the Floyd-Warshall algorithm.
