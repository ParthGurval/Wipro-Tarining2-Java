package pract.treealgorithm;

import java.util.ArrayList;
import java.util.List;

public class DepthSearch {

    // Method to perform Depth First Search on the graph
//	int startNode: This is a parameter representing the node from which the BFS will start.
    public static void dfsGraph(int node, boolean[] visited, List<List<Integer>> graph) {
    	
   //   List<List<Integer>> graph 	This is a parameter that representing the graph. It is a list where each element is another list of integers, 
    	 //   	showing the neighbors of each node.
    	    	
    	 // Definition:   	List: This is a Java interface that represents an ordered collection (also known as a sequence). 
    	    	
//    	    	List<Integer>: This is a List that holds Integer values. In the context of a graph, this represents the neighbors of a specific node. 
//    	    	For example, if node 0 has neighbors 1 and 2, then List<Integer> for node 0 would contain the integers 1 and 2.
    	    	
//    	    	List<List<Integer>> graph: It is a variable declaration representing a nested collection (or data structure) used to store the adjacency list of a graph.
//    	    	Type: It is a type of collection that provides a way to store and manipulate graph data efficiently.
    	
    	
        // 1. Purpose: Mark the current node as visited
        // 2. Explanation: Set the visited array at the index of the current node to true
        visited[node] = true;
        
        // 1. Purpose: Print the current node
        // 2. Explanation: Output the current node to the console as part of the DFS traversal
        System.out.print(node + " ");

        // 1. Purpose: Traverse through all the neighbors of the current node
        // 2. Explanation: Loop through each neighbor connected to the current node
        for (int neighbor : graph.get(node)) {
        	
            // 1. Purpose: Check if the neighbor has not been visited
            // 2. Explanation: If the neighbor is not visited, recursively call dfsGraph
            if (!visited[neighbor]) {
                dfsGraph(neighbor, visited, graph); // Recursive call for DFS on the neighbor node
            }
        }
    }

    public static void main(String[] args) {
    	
        // 1. Purpose: Create an adjacency list to represent the graph
        // 2. Explanation: Initialize a list of lists to hold edges for each node in the graph
        List<List<Integer>> graph = new ArrayList<>();
        
        
//        List<List<Integer>>:
//        	Type/Interface: This specifies the type of the variable graph. It means that graph is a list that will contain other lists of integers. 
//        	The outer List holds elements, and each element is another List that holds Integer values.
//        	
//        	graph:
//        	Variable: This is the name of the variable that will reference or point to the ArrayList object. 
//        	In this case, graph is the variable that will hold a reference to the ArrayList object.
//        	
//        	new ArrayList<>():
//        	Object: This is the actual object being created. ArrayList<> is a concrete class that implements the List interface. 
//        	This line creates an instance of an ArrayList object that can hold lists of integers (List<Integer>).
//        	
//        	ArrayList<>:
//        	Constructor Call: The new ArrayList<>() part calls the constructor of the ArrayList class to create a new object of type ArrayList. 
//        	The diamond operator <> automatically infers the type from the variable declaration (List<List<Integer>>).

        // 1. Purpose: Initialize the graph with empty lists for each node
        // 2. Explanation: Add an empty list for each node (total 7 nodes) to store its neighbors
        for (int i = 0; i < 7; i++) {
            graph.add(new ArrayList<>());
        }

        // 1. Purpose: Add edges (connections) to the graph
        // 2. Explanation: Establish connections (edges) between nodes to build the graph
        graph.get(0).add(1); // Edge between node 0 and node 1
        graph.get(0).add(2); // Edge between node 0 and node 2

        graph.get(1).add(0); // Edge between node 1 and node 0
        graph.get(1).add(3); // Edge between node 1 and node 3
        graph.get(1).add(4); // Edge between node 1 and node 4

        graph.get(2).add(0); // Edge between node 2 and node 0
        graph.get(2).add(5); // Edge between node 2 and node 5
        graph.get(2).add(6); // Edge between node 2 and node 6

        graph.get(3).add(1); // Edge between node 3 and node 1
        graph.get(4).add(1); // Edge between node 4 and node 1

        graph.get(5).add(2); // Edge between node 5 and node 2
        graph.get(6).add(2); // Edge between node 6 and node 2

        // 1. Purpose: Indicate the start of DFS traversal from node 0
        // 2. Explanation: Print the message before starting DFS to show the starting node
        System.out.print("DFS Starting from Node 0: ");

        // 1. Purpose: Create an array to keep track of visited nodes
        // 2. Explanation: Initialize a boolean array of the same size as the graph to track visited nodes
        boolean[] visited = new boolean[graph.size()];

        // 1. Purpose: Start DFS traversal from node 0
        // 2. Explanation: Call dfsGraph method with the starting node, visited array, and graph
        dfsGraph(0, visited, graph);
    }
}


//		Here’s the flowchart for the `DepthSearch` class, which demonstrates the Depth-First Search (DFS) algorithm on a graph:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `DepthSearch` Class)
//		   |
//		   V
//		(Define `dfsGraph(int node, boolean[] visited, List<List<Integer>> graph)` Method)
//		   |
//		   V
//		(Mark `node` as Visited) // Set visited[node] to true
//		   |
//		   V
//		(Print `node`) // Output the current node
//		   |
//		   V
//		(For Each Neighbor of `node`)
//		   |
//		   V
//		   (If Neighbor Not Visited) // Check if neighbor has not been visited
//		   |
//		   V
//		   (Call `dfsGraph` Recursively) // Recursive call for DFS on the neighbor node
//		   |
//		   V
//		(End For Each Neighbor)
//		   |
//		   V
//		(End `dfsGraph` Method)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		(Create Graph as Adjacency List) // Initialize the graph
//		   |
//		   V
//		(Initialize Graph with Nodes) // Create empty lists for each node
//		   |
//		   V
//		(Add Edges to Graph) // Populate adjacency lists with edges
//		   |
//		   V
//		(Print "DFS Starting from Node 0:") // Output message before DFS starts
//		   |
//		   V
//		(Create Array `visited` for Tracking Visited Nodes) // Initialize visited array
//		   |
//		   V
//		(Call `dfsGraph(0, visited, graph)`) // Perform DFS starting from node 0
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `DepthSearch` Class**: This class contains the DFS algorithm and graph initialization.
//		
//		3. **Define `dfsGraph(int node, boolean[] visited, List<List<Integer>> graph)` Method**:
//		   - **Mark `node` as Visited**: Set `visited[node]` to `true` to indicate the node has been visited.
//		   - **Print `node`**: Output the current node value as part of the DFS traversal.
//		   - **For Each Neighbor of `node`**: Iterate through all neighbors connected to the current node.
//		     - **If Neighbor Not Visited**: Check if the neighbor node has not been visited.
//		       - **Call `dfsGraph` Recursively**: Perform a recursive DFS call for the neighbor node.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Create Graph as Adjacency List**: Initialize the graph as a list of lists.
//		   - **Initialize Graph with Nodes**: Add empty lists for each node to store neighbors.
//		   - **Add Edges to Graph**: Populate the adjacency list with edges to establish connections between nodes.
//		   - **Print "DFS Starting from Node 0:"**: Output a message indicating the start of DFS traversal.
//		   - **Create Array `visited` for Tracking Visited Nodes**: Initialize an array to track visited nodes.
//		   - **Call `dfsGraph(0, visited, graph)`**: Execute the DFS algorithm starting from node 0.
//		
//		5. **End**: Complete the execution of the program.
//		
//		This flowchart illustrates the process of performing a Depth-First Search (DFS) on a graph, including graph initialization, DFS traversal, and the recursive nature of DFS.