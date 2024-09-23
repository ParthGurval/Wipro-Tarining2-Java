package pract.linkedlist; // Declares the package name

// Class to represent a node in the Doubly Linked List
class Node1 {
    int data;       // Data held by the node
    Node1 next;     // Reference to the next node in the list
    Node1 prev;     // Reference to the previous node in the list
    
    // Constructor to initialize a node with data
    Node1(int data) {
        this.data = data;   // Initialize the node with the given data
        this.next = null;   // Initialize next pointer to null (no next node yet)
        this.prev = null;   // Initialize previous pointer to null (no previous node yet)
    }
}

// Class to represent a Doubly Linked List
class DoublyLL {
    Node1 head; // Reference to the first node in the list
    
    // Method to insert a new node with given data at the end of the list
    void insert(int data) {
        Node1 newNode = new Node1(data); // Create a new node with the given data
        
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode; // Set the new node as the head
        } else {
            Node1 temp = head;           // Start from the head node
            // Traverse to the last node in the list
            while (temp.next != null) {
                temp = temp.next;        // Move to the next node until the last node is found
            }
            // Add the new node at the end of the list
            temp.next = newNode;         // Link the last node's next to the new node
            newNode.prev = temp;         // Set the previous pointer of the new node to the last node
        }
    }
    
    // Method to display all nodes in the doubly linked list from head to end
    void display() {
        Node1 temp = head;               // Start from the head node
        // Traverse and print each node's data until we reach the end of the list
        while (temp != null) {
            System.out.print(temp.data + " "); // Print the data of the current node
            temp = temp.next;                 // Move to the next node
        }
        System.out.println();                 // Print a newline after displaying the list
    }
    
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL(); // Create a new doubly linked list
        list.insert(1); // Insert nodes with data 1, 2, and 3
        list.insert(2);
        list.insert(3);
        list.display(); // Display the doubly linked list: Output: 1 2 3
    }
}


//		Here's a structured flowchart diagram for the `DoublyLL` class, which implements a Doubly Linked List:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `Node1` Class)
//		   |
//		   V
//		   (Constructor `Node1(int data)`)
//		   |
//		   V
//		   - Initializes `data`
//		   - Sets `next` to `null`
//		   - Sets `prev` to `null`
//		   |
//		   V
//		(Define `DoublyLL` Class)
//		   |
//		   V
//		   (Field `Node1 head`)
//		   |
//		   V
//		(Define `insert(int data)` Method)
//		   |
//		   V
//		   - Create a new `Node1` with `data`
//		   |
//		   V
//		   (Check if List is Empty)
//		      |
//		      V
//		      - `head == null`:
//		         |
//		         V
//		         - Set `head` to new node
//		         |
//		         V
//		   (Else)
//		   |
//		   V
//		   (Traverse to Last Node)
//		      |
//		      V
//		      - Loop until `temp.next == null`
//		         |
//		         V
//		         - Move `temp` to `temp.next`
//		   |
//		   V
//		   - Set `temp.next` to `newNode`
//		   - Set `newNode.prev` to `temp`
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
//		      - Loop until `temp == null`
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
//		   - Create `DoublyLL` instance
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
//		2. **Define `Node1` Class**:
//		   - **Constructor `Node1(int data)`**:
//		     - Initializes the node with the provided `data`.
//		     - Sets both `next` and `prev` pointers to `null`.
//		
//		3. **Define `DoublyLL` Class**:
//		   - **Field `Node1 head`**: A reference to the first node in the list.
//		
//		4. **Define `insert(int data)` Method**:
//		   - **Create a New `Node1`**:
//		     - Initializes a new node with the given `data`.
//		   - **Check if List is Empty**:
//		     - If `head` is `null`:
//		       - Set `head` to the new node.
//		   - **Else**:
//		     - **Traverse to Last Node**:
//		       - Loop through the list until reaching the last node (`temp.next == null`).
//		     - **Add New Node**:
//		       - Set the last node's `next` pointer to the new node.
//		       - Set the new node's `prev` pointer to the last node.
//		
//		5. **Define `display()` Method**:
//		   - **Check if List is Empty**:
//		     - If `head` is `null`, exit the method as there are no nodes to display.
//		   - **Traverse and Print Nodes**:
//		     - Start from `head`.
//		     - Loop through the list, printing each node's `data` until reaching the end (`temp == null`).
//		   - **Print Newline**: After displaying the list, print a newline for formatting.
//		
//		6. **Define `main(String[] args)` Method**:
//		   - **Create `DoublyLL` Instance**: Initialize a new `DoublyLL` object.
//		   - **Insert Nodes**: Add nodes with data 1, 2, and 3.
//		   - **Call `display()`**: Print the contents of the doubly linked list.
//		
//		7. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the steps for managing and displaying a doubly linked list, including node insertion at the end and traversal for displaying the list.