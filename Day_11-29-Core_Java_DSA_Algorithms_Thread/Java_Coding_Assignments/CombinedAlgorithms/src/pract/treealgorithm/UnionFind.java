package pract.treealgorithm;

// Importing required classes
import java.util.*;

public class UnionFind {

    private int[] parent; // 1. Purpose: To keep track of the parent of each node.
                          // 2. Explanation: Each index represents a node, and the value at each index represents its parent node.
    //Initially, each node is its own parent.

    private int[] rank;   // 1. Purpose: To keep track of the rank (depth) of each node's tree.
                          // 2. Explanation: The rank helps to optimize the union operation by attaching the smaller tree under the root of the larger tree.

    // Constructor to initialize the Union-Find data structure
    public UnionFind(int size) {
        parent = new int[size]; // 1. Purpose: To initialize the parent array.
                                // 2. Explanation: Creates an array to hold the parent of each node, sized according to the number of elements.
        rank = new int[size];   // 1. Purpose: To initialize the rank array.
                                // 2. Explanation: Creates an array to hold the rank of each node, initially set to 0.

        // Initialize each node as its own parent (self-loop) and rank to 0
        for(int i = 0; i < size; i++) {
            parent[i] = i;      // 1. Purpose: To set each node as its own parent.
                                // 2. Explanation: At the beginning, each node points to itself, indicating it's its own root.
            rank[i] = 0;        // 1. Purpose: To set the initial rank of each node to 0.
                                // 2. Explanation: All nodes start with a rank of 0 since they are individual trees.
        }
    }

    // Find method with path compression
    public int find(int x) {
        if(parent[x] != x) {    // 1. Purpose: To check if the current node is not its own parent.
                                // 2. Explanation: If the node is not a root, find its root recursively.
            parent[x] = find(parent[x]); // 1. Purpose: To perform path compression.
                                         // 2. Explanation: The root of x is found and set directly as the parent of x, flattening the tree structure.
        }
        return parent[x];       // 1. Purpose: To return the root of the node.
                                // 2. Explanation: After path compression, the direct root of x is returned.
    }

    // Union method with union by rank
    public void union(int x, int y) {
        int rootX = find(x);    // 1. Purpose: To find the root of the set containing x.
                                // 2. Explanation: Uses the find method to get the root of x.
        int rootY = find(y);    // 1. Purpose: To find the root of the set containing y.
                                // 2. Explanation: Uses the find method to get the root of y.

        if(rootX != rootY) {    // 1. Purpose: To check if x and y are in different sets.
                                // 2. Explanation: If they are in different sets, they should be united.
            if(rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX; // 1. Purpose: To attach the smaller tree under the root of the larger tree.
                                      // 2. Explanation: Since rootX has a higher rank, rootY becomes a child of rootX.
            }
            else if(rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY; // 1. Purpose: To attach the smaller tree under the root of the larger tree.
                                      // 2. Explanation: Since rootY has a higher rank, rootX becomes a child of rootY.
            }
            else {
                parent[rootY] = rootX; // 1. Purpose: To attach rootY to rootX.
                                      // 2. Explanation: If both ranks are equal, rootY becomes a child of rootX.
                rank[rootX]++;         // 1. Purpose: To increase the rank of rootX.
                                      // 2. Explanation: Since rootX now has an additional subtree, its rank is incremented.
            }
        }
    }

    // Check if two nodes are in the same set
    public boolean connected(int x, int y) {
        return find(x) == find(y); // 1. Purpose: To check if x and y are in the same set.
                                   // 2. Explanation: If the roots of x and y are the same, they are connected.
    }

    public static void main(String[] args) {
        // Create a Union-Find data structure for 10 elements
        UnionFind uf = new UnionFind(10); // 1. Purpose: To initialize the Union-Find structure with 10 elements.
                                          // 2. Explanation: A UnionFind object is created with 10 elements, initializing the parent and rank arrays.

        // Perform union operations
        uf.union(0, 1); // 1. Purpose: To union the sets containing nodes 0 and 1.
                        // 2. Explanation: Nodes 0 and 1 are now in the same set.
        uf.union(1, 2); // 1. Purpose: To union the sets containing nodes 1 and 2.
                        // 2. Explanation: Nodes 0, 1, and 2 are now in the same set.
        uf.union(3, 4); // 1. Purpose: To union the sets containing nodes 3 and 4.
                        // 2. Explanation: Nodes 3 and 4 are now in the same set.
        uf.union(4, 5); // 1. Purpose: To union the sets containing nodes 4 and 5.
                        // 2. Explanation: Nodes 3, 4, and 5 are now in the same set.

        // Output connection status before additional unions
        System.out.println("Before Union: ");
        System.out.println("\nAre nodes 0 & 2 Connected: " + uf.connected(0, 2)); // 1. Purpose: To check if nodes 0 and 2 are connected.
                                                                                  // 2. Explanation: Should return true as they are connected through node 1.
        System.out.println("Are nodes 0 & 3 Connected: " + uf.connected(0, 3)); // 1. Purpose: To check if nodes 0 and 3 are connected.
                                                                                // 2. Explanation: Should return false as they are in different sets.
        System.out.println("Are nodes 1 & 5 Connected: " + uf.connected(1, 5)); // 1. Purpose: To check if nodes 1 and 5 are connected.
                                                                                // 2. Explanation: Should return false as they are in different sets.

        // Perform additional union operations
        uf.union(2, 3); // 1. Purpose: To union the sets containing nodes 2 and 3.
                        // 2. Explanation: Nodes 0, 1, 2, 3, 4, and 5 are now in the same set.

        // Output connection status after additional unions
        System.out.println("\nAfter Union: ");
        System.out.println("\nAre nodes 0 & 2 Connected: " + uf.connected(0, 2)); // 1. Purpose: To check if nodes 0 and 2 are connected.
                                                                                  // 2. Explanation: Should return true as they are in the same set.
        System.out.println("Are nodes 0 & 3 Connected: " + uf.connected(0, 3)); // 1. Purpose: To check if nodes 0 and 3 are connected.
                                                                                // 2. Explanation: Should return true as they are in the same set.
        System.out.println("Are nodes 1 & 5 Connected: " + uf.connected(1, 5)); // 1. Purpose: To check if nodes 1 and 5 are connected.
                                                                                // 2. Explanation: Should return true as they are in the same set.
    }
}

//		Here's the flowchart for the `UnionFind` class, which demonstrates the Union-Find (Disjoint Set) data structure:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `UnionFind` Class)
//		   |
//		   V
//		(Define `parent` and `rank` Arrays)
//		   |
//		   V
//		(Constructor `UnionFind(int size)`)
//		   |
//		   V
//		   (Initialize `parent` Array) // Create an array to hold parent of each node
//		   |
//		   V
//		   (Initialize `rank` Array) // Create an array to hold rank of each node
//		   |
//		   V
//		   (Set Each Node as Its Own Parent and Rank to 0) // Initialize parent[i] to i and rank[i] to 0
//		   |
//		   V
//		(End Constructor)
//		   |
//		   V
//		(Define `find(int x)` Method)
//		   |
//		   V
//		   (Check if `x` is not its own parent) // If parent[x] != x
//		   |
//		   V
//		   (Perform Path Compression) // Recursively find the root and set parent[x] to root
//		   |
//		   V
//		   (Return Root of `x`) // Return parent[x]
//		   |
//		   V
//		(End `find` Method)
//		   |
//		   V
//		(Define `union(int x, int y)` Method)
//		   |
//		   V
//		   (Find Root of `x` and `y`) // Use `find` method to get rootX and rootY
//		   |
//		   V
//		   (Check if Roots are Different) // If rootX != rootY
//		   |
//		   V
//		   (Union by Rank)
//		     |
//		     V
//		     (If `rank[rootX] > rank[rootY]`)
//		     | 
//		     V
//		     (Attach rootY to rootX)
//		     |
//		     V
//		     (Else If `rank[rootX] < rank[rootY]`)
//		     |
//		     V
//		     (Attach rootX to rootY)
//		     |
//		     V
//		     (Else)
//		     |
//		     V
//		     (Attach rootY to rootX and Increment Rank of rootX)
//		   |
//		   V
//		(End `union` Method)
//		   |
//		   V
//		(Define `connected(int x, int y)` Method)
//		   |
//		   V
//		   (Check if `x` and `y` are in the Same Set) // Compare roots of x and y
//		   |
//		   V
//		   (Return True or False) // If roots are the same, return true, else false
//		   |
//		   V
//		(End `connected` Method)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   (Create Union-Find Data Structure for 10 Elements) // Initialize with 10 elements
//		   |
//		   V
//		   (Perform Initial Union Operations)
//		     |
//		     V
//		     (Union(0, 1))
//		     |
//		     V
//		     (Union(1, 2))
//		     |
//		     V
//		     (Union(3, 4))
//		     |
//		     V
//		     (Union(4, 5))
//		   |
//		   V
//		   (Output Connection Status Before Additional Unions)
//		     |
//		     V
//		     (Check Connections: 0 & 2, 0 & 3, 1 & 5)
//		   |
//		   V
//		   (Perform Additional Union Operations)
//		     |
//		     V
//		     (Union(2, 3))
//		   |
//		   V
//		   (Output Connection Status After Additional Unions)
//		     |
//		     V
//		     (Check Connections: 0 & 2, 0 & 3, 1 & 5)
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `UnionFind` Class**: The class to implement the Union-Find data structure.
//		
//		3. **Define `parent` and `rank` Arrays**:
//		   - **`parent` Array**: Keeps track of each node's parent.
//		   - **`rank` Array**: Keeps track of the rank (depth) of each node's tree.
//		
//		4. **Constructor `UnionFind(int size)`**:
//		   - **Initialize `parent` Array**: Sets up the array for parent pointers.
//		   - **Initialize `rank` Array**: Sets up the array for ranks.
//		   - **Set Each Node as Its Own Parent and Rank to 0**: Initially, each node is its own parent with a rank of 0.
//		
//		5. **Define `find(int x)` Method**:
//		   - **Check if `x` is not its own parent**: Determine if the node is not its root.
//		   - **Perform Path Compression**: Flatten the tree by setting the parent directly to the root.
//		   - **Return Root of `x`**: Return the root of the node.
//		
//		6. **Define `union(int x, int y)` Method**:
//		   - **Find Root of `x` and `y`**: Get the root nodes for `x` and `y`.
//		   - **Check if Roots are Different**: Determine if `x` and `y` are in different sets.
//		   - **Union by Rank**: Attach the smaller tree to the root of the larger tree, or if ranks are equal, make one root the parent of the other and increment its rank.
//		
//		7. **Define `connected(int x, int y)` Method**:
//		   - **Check if `x` and `y` are in the Same Set**: Compare the roots of `x` and `y`.
//		   - **Return True or False**: Return whether `x` and `y` are connected.
//		
//		8. **Define `main(String[] args)` Method**:
//		   - **Create Union-Find Data Structure for 10 Elements**: Initialize with 10 nodes.
//		   - **Perform Initial Union Operations**: Connect some nodes together.
//		   - **Output Connection Status Before Additional Unions**: Check if certain nodes are connected.
//		   - **Perform Additional Union Operations**: Union more sets.
//		   - **Output Connection Status After Additional Unions**: Verify connections after additional unions.
//		
//		9. **End**: Complete the execution of the program.
//		
//		This flowchart illustrates the process of implementing and using the Union-Find data structure, including initialization, union operations, path compression, and connectivity checks.
