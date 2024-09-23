package pract.queue; // Declares the package name

// SimpleQueue.java
public class SimpleQueue {
    private int[] queue; // Array to store queue elements
    private int front, rear, size, capacity; // Variables to track the front, rear, size, and capacity of the queue
    
    // Constructor to initialize queue
    public SimpleQueue(int capacity) {
        this.capacity = capacity; // Sets the queue capacity
        queue = new int[capacity]; // Initializes the queue array with the specified capacity
        front = 0; // Initializes the front pointer to 0
        rear = -1; // Initializes the rear pointer to -1 (indicating the queue is empty)
        size = 0; // Initializes the size of the queue to 0
    }
    
    // Enqueue operation
    public void enqueue(int value) {
        if (size == capacity) { // Checks if the queue is full
            System.out.println("\nQueue Overflow"); // Prints a message if the queue is full
            return; // Exits the method to prevent overflow
        }
        rear = (rear + 1) % capacity; // Moves the rear pointer forward, wrapping around if necessary
        queue[rear] = value; // Adds the new value to the rear of the queue
        size++; // Increments the size of the queue
        System.out.println("\n" + value + " added to queue"); // Prints a message indicating the value added to the queue
    }
    
    // Dequeue operation
    public int dequeue() {
        if (size == 0) { // Checks if the queue is empty
            System.out.println("\nQueue Underflow"); // Prints a message if the queue is empty
            return -1; // Returns -1 to indicate underflow
        }
        int value = queue[front]; // Stores the front element of the queue
        front = (front + 1) % capacity; // Moves the front pointer forward, wrapping around if necessary
        size--; // Decrements the size of the queue
        return value; // Returns the dequeued value
    }
    
    // Peek operation
    public int peek() {
        if (size == 0) { // Checks if the queue is empty
            System.out.println("\nQueue is empty"); // Prints a message if the queue is empty
            return -1; // Returns -1 to indicate the queue is empty
        }
        return queue[front]; // Returns the front element of the queue without removing it
    }
    
    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0; // Returns true if the queue size is 0, indicating the queue is empty
    }
    
    // Display the queue elements
    public void display() {
        if (size == 0) { // Checks if the queue is empty
            System.out.println("Queue is empty"); // Prints a message if the queue is empty
            return; // Exits the method
        }
        System.out.print("Queue elements: "); // Prints the queue elements
        for (int i = 0; i < size; i++) { // Iterates over the queue elements
            System.out.print(queue[(front + i) % capacity] + " "); // Prints each element using circular indexing
        }
        System.out.println(); // Moves to the next line after printing all elements
    }
    
    public static void main(String[] args) {
        // Create a queue of size 5
        SimpleQueue queue = new SimpleQueue(5); // Initializes a queue with a capacity of 5
        
        // Perform queue operations
        queue.enqueue(10); // Adds 10 to the queue
        queue.enqueue(20); // Adds 20 to the queue
        queue.enqueue(30); // Adds 30 to the queue
        queue.enqueue(40); // Adds 40 to the queue
        queue.enqueue(50); // Adds 50 to the queue
        
        // Display queue
        queue.display(); // Displays the current elements in the queue
        
        // Peek front element
        System.out.println("\nFront element is " + queue.peek()); // Displays the front element of the queue
        
        // Dequeue elements
        System.out.println("\n" + queue.dequeue() + " removed from queue"); // Removes and prints the front element from the queue
        System.out.println("\n" + queue.dequeue() + " removed from queue"); // Removes and prints the next front element from the queue
        
        // Display queue
        queue.display(); // Displays the current elements in the queue after dequeue operations
        
        // Check if queue is empty
        System.out.println("\nIs queue empty? " + queue.isEmpty()); // Checks and prints if the queue is empty
    }
}


//		Here's a structured flowchart diagram for the `SimpleQueue` class, which demonstrates basic operations on a circular queue using a fixed-size array:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `SimpleQueue` Class)
//		   |
//		   V
//		(Define Queue Attributes)
//		   - `queue[]`: Array to store elements
//		   - `front`: Pointer to the front of the queue
//		   - `rear`: Pointer to the rear of the queue
//		   - `size`: Current number of elements
//		   - `capacity`: Maximum size of the queue
//		   |
//		   V
//		(Define `SimpleQueue(int capacity)` Constructor)
//		   - Initialize `capacity`, `queue[]`, `front`, `rear`, and `size`
//		   |
//		   V
//		(Define `enqueue(int value)` Method)
//		   - Check if the queue is full (`size == capacity`)
//		       - If full, print "Queue Overflow" and return
//		   - Move `rear` pointer forward, wrapping around if needed
//		   - Add `value` to the `rear` of the queue
//		   - Increment `size`
//		   - Print "<value> added to queue"
//		   |
//		   V
//		(Define `dequeue()` Method)
//		   - Check if the queue is empty (`size == 0`)
//		       - If empty, print "Queue Underflow" and return -1
//		   - Store the element at `front`
//		   - Move `front` pointer forward, wrapping around if needed
//		   - Decrement `size`
//		   - Return the dequeued value
//		   |
//		   V
//		(Define `peek()` Method)
//		   - Check if the queue is empty (`size == 0`)
//		       - If empty, print "Queue is empty" and return -1
//		   - Return the element at `front`
//		   |
//		   V
//		(Define `isEmpty()` Method)
//		   - Return true if `size == 0`, indicating the queue is empty
//		   |
//		   V
//		(Define `display()` Method)
//		   - Check if the queue is empty (`size == 0`)
//		       - If empty, print "Queue is empty" and return
//		   - Print "Queue elements: "
//		   - Iterate over the queue elements using circular indexing
//		   - Print each element
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   - Create a `SimpleQueue` object with a capacity of 5
//		   - Perform operations:
//		       - `enqueue(10)`, `enqueue(20)`, `enqueue(30)`, `enqueue(40)`, `enqueue(50)`
//		       - Display queue elements
//		       - Peek the front element
//		       - Dequeue elements and print removed values
//		       - Display queue elements again
//		       - Check and print if the queue is empty
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `SimpleQueue` Class**: The class encapsulates operations for a circular queue implemented with an array.
//		
//		3. **Define Queue Attributes**:
//		   - `queue[]`: Array to store queue elements.
//		   - `front`, `rear`, `size`, `capacity`: Variables to manage queue state.
//		
//		4. **Define Constructor (`SimpleQueue(int capacity)`)**:
//		   - Initialize the queue with the specified capacity and set pointers and size.
//		
//		5. **Define `enqueue(int value)` Method**:
//		   - Check for overflow conditions.
//		   - Update `rear` pointer and add the new element.
//		   - Increase the size and print a message.
//		
//		6. **Define `dequeue()` Method**:
//		   - Check for underflow conditions.
//		   - Retrieve the front element, update `front` pointer, and decrease the size.
//		   - Return the dequeued value.
//		
//		7. **Define `peek()` Method**:
//		   - Check if the queue is empty.
//		   - Return the front element without modifying the queue.
//		
//		8. **Define `isEmpty()` Method**:
//		   - Return whether the queue is empty based on the size.
//		
//		9. **Define `display()` Method**:
//		   - Print the current elements in the queue using circular indexing.
//		
//		10. **Define `main(String[] args)` Method**:
//		    - Create a `SimpleQueue` instance.
//		    - Perform enqueue, dequeue, peek, and display operations.
//		    - Check if the queue is empty.
//		
//		11. **End**: Completion of the program execution and output.
//		
//		This flowchart helps visualize the structure and operations of the `SimpleQueue` class, showing how elements are managed in a circular queue.
