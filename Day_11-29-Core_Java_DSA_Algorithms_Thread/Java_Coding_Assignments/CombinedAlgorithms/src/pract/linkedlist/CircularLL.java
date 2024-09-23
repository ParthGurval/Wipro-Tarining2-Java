package pract.linkedlist; // Declares the package name

// Class to represent a node in the Circular Linked List
class Node {
    int data;      // Data held by the node
    Node next;     // Reference to the next node in the list
    
    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data; // Initializes the node with the given data
        this.next = null; // Sets the next pointer to null (no next node yet)
    }
}

// Class to represent a Circular Linked List
class CircularLL {
    Node head;     // Reference to the first node in the list
    
    // Method to insert a new node with given data into the circular linked list
    void insert(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        
        // If the list is empty, make the new node the head and point it to itself
        if (head == null) {
            head = newNode;            // Assign the new node as the head
            newNode.next = head;       // Point the new node's next to itself (circular reference)
        } else {
            Node temp = head;          // Start from the head node
            // Traverse to the last node (the one which points to head)
            while (temp.next != head) { 
                temp = temp.next;      // Move to the next node until the last node is found
            }
            // Insert the new node at the end of the list
            temp.next = newNode;       // Link the last node to the new node
            newNode.next = head;       // Point the new node to the head to maintain the circular structure
        }
    }
    
    // Method to display all nodes in the circular linked list
    void display() {
        // If the list is empty, simply return
        if (head == null) return;       // Exit if the list is empty
        
        Node temp = head;               // Start from the head node
        // Traverse and print each node's data until we come back to the head
        do {
            System.out.print(temp.data + " "); // Print the data of the current node
            temp = temp.next;                 // Move to the next node
        } while (temp != head);               // Continue until the loop reaches the head node again
        System.out.println();                 // Print a newline after displaying the list
    }
    
    public static void main(String[] args) {
        CircularLL list = new CircularLL(); // Create a new circular linked list
        list.insert(1); // Insert nodes with data 1, 2, and 3
        list.insert(2);
        list.insert(3);
        list.display(); // Display the circular linked list: Output: 1 2 3
    }
}


//		Here's a structured flowchart diagram for the `CircularLL` class, which implements a Circular Linked List:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `Node` Class)
//		   |
//		   V
//		   (Constructor `Node(int data)`)
//		   |
//		   V
//		   - Initializes `data`
//		   - Sets `next` to `null`
//		   |
//		   V
//		(Define `CircularLL` Class)
//		   |
//		   V
//		   (Field `Node head`)
//		   |
//		   V
//		(Define `insert(int data)` Method)
//		   |
//		   V
//		   - Create a new `Node` with `data`
//		   |
//		   V
//		   (Check if List is Empty)
//		      |
//		      V
//		      - `head == null`:
//		         |
//		         V
//		         - Set `head` to new node
//		         - Point `newNode.next` to `head`
//		         |
//		         V
//		   (Else)
//		   |
//		   V
//		   (Traverse to Last Node)
//		      |
//		      V
//		      - Loop until `temp.next == head`
//		         |
//		         V
//		         - Move `temp` to `temp.next`
//		   |
//		   V
//		   - Set `temp.next` to `newNode`
//		   - Set `newNode.next` to `head`
//		   |
//		   V
//		(Define `display()` Method)
//		   |
//		   V
//		   (Check if List is Empty)
//		      |
//		      V
//		      - `head == null`:
//		         |
//		         V
//		         - Return (No nodes to display)
//		   |
//		   V
//		   (Traverse and Print Nodes)
//		      |
//		      V
//		      - Start from `head`
//		      - Loop until `temp == head`
//		         |
//		         V
//		         - Print `temp.data`
//		         - Move `temp` to `temp.next`
//		   |
//		   V
//		   (Print Newline)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create `CircularLL` instance
//		   - Insert nodes with data 1, 2, and 3
//		   - Call `display()` to show the list
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `Node` Class**:
//		   - **Constructor `Node(int data)`**:
//		     - Initializes the node with the provided `data`.
//		     - Sets the `next` pointer to `null`.
//		
//		3. **Define `CircularLL` Class**:
//		   - **Field `Node head`**: A reference to the first node in the list.
//		
//		4. **Define `insert(int data)` Method**:
//		   - **Create a New `Node`**:
//		     - Initializes a new node with the given `data`.
//		   - **Check if List is Empty**:
//		     - If `head` is `null`:
//		       - Set `head` to the new node.
//		       - Point `newNode.next` to `head` to create a circular reference.
//		   - **Else**:
//		     - **Traverse to Last Node**:
//		       - Loop through the list until reaching the node that points to `head`.
//		     - **Insert New Node**:
//		       - Set the last node's `next` to the new node.
//		       - Point `newNode.next` to `head` to maintain the circular structure.
//		
//		5. **Define `display()` Method**:
//		   - **Check if List is Empty**:
//		     - If `head` is `null`, exit the method as there are no nodes to display.
//		   - **Traverse and Print Nodes**:
//		     - Start from `head`.
//		     - Loop through the list, printing each node's `data` until reaching `head` again.
//		   - **Print Newline**: After displaying the list, print a newline for formatting.
//		
//		6. **Define `main(String[] args)` Method**:
//		   - **Create `CircularLL` Instance**: Initialize a new `CircularLL` object.
//		   - **Insert Nodes**: Add nodes with data 1, 2, and 3.
//		   - **Call `display()`**: Print the contents of the circular linked list.
//		
//		7. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the steps for managing and displaying a circular linked list, including node insertion and traversal.