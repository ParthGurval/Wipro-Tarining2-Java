package pract.treealgorithm;

import java.util.*;

// Define the BfsGraph class
public class BfsGraph {
    
    // Method to perform Breadth-First Search (BFS) on the graph
//	int startNode: This is a parameter representing the node from which the BFS will start.
    public static void bfSearch(int startNode, List<List<Integer>> graph) {
//   List<List<Integer>> graph 	This is a parameter that representing the graph. It is a list where each element is another list of integers, 
 //   	showing the neighbors of each node.
    	
 // Definition:   	List: This is a Java interface that represents an ordered collection (also known as a sequence). 
    	
//    	List<Integer>: This is a List that holds Integer values. In the context of a graph, this represents the neighbors of a specific node. 
//    	For example, if node 0 has neighbors 1 and 2, then List<Integer> for node 0 would contain the integers 1 and 2.
    	
//    	List<List<Integer>> graph: It is a variable declaration representing a nested collection (or data structure) used to store the adjacency list of a graph.
//    	Type: It is a type of collection that provides a way to store and manipulate graph data efficiently.
    	
        // Create a queue to manage the BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Create an array to keep track of visited nodes
        boolean[] visited = new boolean[graph.size()];
        
        // Start BFS from the startNode
        queue.add(startNode); // Enqueue the starting node
        visited[startNode] = true; // Mark it as visited
        
        // Process nodes in the queue
        while (!queue.isEmpty()) {
            int node = queue.poll(); // Dequeue a node
            System.out.print(node + " "); // Print the node
            
            // Visit all the neighbors of the current node
          //  Purpose: Iterates over each neighbor of the current node.
        //    Explanation: graph.get(node) retrieves the list of neighbors for the current node. The for loop goes through each neighbor in this list.
            for (int neighbor : graph.get(node)) {
            	
     //       	Explanation: !visited[neighbor] checks if the neighbor has a value of false in the visited array, indicating it has not been visited.
                if (!visited[neighbor]) { // Check if the neighbor has not been visited
                
                	//Explanation: Sets visited[neighbor] to true, indicating that this neighbor has now been visited.
                    visited[neighbor] = true; // Mark neighbor as visited
                    
               //     queue.add(neighbor) enqueues the neighbor so that it will be processed later in the BFS traversal.
                    queue.add(neighbor); // Adds the neighbor node to the queue for future processing.
                }
            }
        }
    }

    // Main method to run the BFS example
    public static void main(String[] args) {
        // Create a graph represented as an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        
//      List<List<Integer>>:
//    	Type/Interface: This specifies the type of the variable graph. It means that graph is a list that will contain other lists of integers. 
//    	The outer List holds elements, and each element is another List that holds Integer values.
//    	
//    	graph:
//    	Variable: This is the name of the variable that will reference or point to the ArrayList object. 
//    	In this case, graph is the variable that will hold a reference to the ArrayList object.
//    	
//    	new ArrayList<>():
//    	Object: This is the actual object being created. ArrayList<> is a concrete class that implements the List interface. 
//    	This line creates an instance of an ArrayList object that can hold lists of integers (List<Integer>).
//    	
//    	ArrayList<>:
//    	Constructor Call: The new ArrayList<>() part calls the constructor of the ArrayList class to create a new object of type ArrayList. 
//    	The diamond operator <> automatically infers the type from the variable declaration (List<List<Integer>>).
        
        // Initialize the graph with 7 nodes
        for (int i = 0; i < 7; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add edges to the graph
        graph.get(0).add(1); 
        graph.get(0).add(2); // graph.get(0) returns the list of neighbors for node 0, which contains [1, 2].
        
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4); // graph.get(1) returns the list of neighbors for node 1, which contains [0, 3, 4].
        
        graph.get(2).add(1);
        graph.get(2).add(5);
        graph.get(2).add(6);
        
        graph.get(3).add(1);
        graph.get(4).add(1);
        
        graph.get(5).add(2);
        graph.get(6).add(2);
        
        // Start BFS from node 0
        System.out.print("BFS Starting from Node 0: ");
        bfSearch(0, graph); // Call BFS method
    }
}


//		Here’s the flowchart for the `BfsGraph` class, which demonstrates the Breadth-First Search (BFS) algorithm on a graph:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `BfsGraph` Class)
//		   |
//		   V
//		(Define `bfSearch(int startNode, List<List<Integer>> graph)` Method)
//		   |
//		   V
//		(Create Queue `queue` for BFS) // Initialize queue for managing nodes
//		   |
//		   V
//		(Create Array `visited` for Tracking Visited Nodes) // Initialize visited array
//		   |
//		   V
//		(Enqueue `startNode`) // Add start node to the queue
//		   |
//		   V
//		(Mark `startNode` as Visited) // Set visited[startNode] to true
//		   |
//		   V
//		(While Queue is Not Empty)
//		   |
//		   V
//		(Dequeue Node `node`) // Remove and get the node from the queue
//		   |
//		   V
//		(Print `node`) // Output the node value
//		   |
//		   V
//		(For Each Neighbor of `node`)
//		   |
//		   V
//		   (If Neighbor Not Visited) // Check if neighbor has not been visited
//		   |
//		   V
//		   (Mark Neighbor as Visited) // Set visited[neighbor] to true
//		   |
//		   V
//		   (Enqueue Neighbor) // Add neighbor to the queue
//		   |
//		   V
//		(End For Each Neighbor)
//		   |
//		   V
//		(End While Loop)
//		   |
//		   V
//		(End `bfSearch` Method)
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
//		(Add Edges to Graph) // Add edges to the adjacency list
//		   |
//		   V
//		(Print "BFS Starting from Node 0:") // Output message before BFS
//		   |
//		   V
//		(Call `bfSearch(0, graph)`) // Perform BFS starting from node 0
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `BfsGraph` Class**: This class contains the BFS algorithm and graph initialization.
//		
//		3. **Define `bfSearch(int startNode, List<List<Integer>> graph)` Method**:
//		   - **Create Queue `queue`**: Initialize a queue to manage nodes for BFS.
//		   - **Create Array `visited`**: Initialize an array to track visited nodes.
//		   - **Enqueue `startNode`**: Add the starting node to the queue.
//		   - **Mark `startNode` as Visited**: Set `visited[startNode]` to `true` to indicate it has been visited.
//		   - **While Queue is Not Empty**: Continue processing while there are nodes in the queue.
//		     - **Dequeue Node `node`**: Remove the front node from the queue.
//		     - **Print `node`**: Output the current node.
//		     - **For Each Neighbor of `node`**: Iterate through all neighbors of the current node.
//		       - **If Neighbor Not Visited**: Check if the neighbor node has not been visited.
//		         - **Mark Neighbor as Visited**: Set `visited[neighbor]` to `true`.
//		         - **Enqueue Neighbor**: Add the neighbor to the queue for future processing.
//		   - **End While Loop**: Finish processing all nodes.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Create Graph as Adjacency List**: Initialize the graph as a list of lists.
//		   - **Initialize Graph with Nodes**: Create empty lists for each node to hold neighbors.
//		   - **Add Edges to Graph**: Populate the adjacency list with edges.
//		   - **Print "BFS Starting from Node 0:"**: Output a message indicating the start of BFS.
//		   - **Call `bfSearch(0, graph)`**: Execute the BFS algorithm starting from node 0.
//		
//		5. **End**: Complete the execution of the program.
//		
//		This flowchart visualizes the steps involved in performing a Breadth-First Search (BFS) on a graph, from initializing the graph to traversing it using BFS.