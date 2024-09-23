package pract.queue;

// CircularQueue.java
public class CircularQueue {

    private int[] queue; // 1. Purpose: To hold the elements of the circular queue.
                         // 2. Explanation: An array to store the elements of the queue.

    private int front, rear, size, capacity; // 1. Purpose: To track the queue's front, rear, current size, and capacity.
                                             // 2. Explanation: `front` points to the first element, `rear` to the last, `size` tracks the number of elements, and `capacity` is the maximum size.

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity; // 1. Purpose: To set the queue's capacity.
                                  // 2. Explanation: `capacity` is initialized to the value passed in the constructor.
        queue = new int[capacity]; // 1. Purpose: To initialize the array with the specified capacity.
                                   // 2. Explanation: Creates an array of size `capacity` to hold the queue elements.
        front = 0; // 1. Purpose: To set the initial front position.
                   // 2. Explanation: `front` is initialized to 0, meaning the queue starts empty.
        rear = -1; // 1. Purpose: To set the initial rear position.
                   // 2. Explanation: `rear` is set to -1, indicating no elements are present initially.
        size = 0; // 1. Purpose: To set the initial size of the queue.
                  // 2. Explanation: `size` is initialized to 0, indicating the queue is empty.
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (size == capacity) { // 1. Purpose: To check if the queue is full.
                                // 2. Explanation: If `size` equals `capacity`, the queue is full, and enqueue is not allowed.
            System.out.println("\nQueue Overflow");
            return; // 1. Purpose: To exit the method if the queue is full.
                    // 2. Explanation: Stops further execution to prevent adding an element to a full queue.
        }
        rear = (rear + 1) % capacity; // 1. Purpose: To calculate the new rear position in a circular manner.
                                      // 2. Explanation: `(rear + 1) % capacity` ensures the rear wraps around to the start if it exceeds the array bounds.
        queue[rear] = value; // 1. Purpose: To insert the new element at the rear of the queue.
                             // 2. Explanation: The value is stored at the position calculated for `rear`.
        size++; // 1. Purpose: To increase the size of the queue.
                // 2. Explanation: The size is incremented to reflect the addition of the new element.
        System.out.println("\n" + value + " added to queue"); // 1. Purpose: To display a message indicating the added value.
                                                              // 2. Explanation: Prints the value added to the queue.
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) { // 1. Purpose: To check if the queue is empty.
                         // 2. Explanation: If `size` is 0, the queue is empty, and dequeue is not allowed.
            System.out.println("\nQueue Underflow");
            return -1; // 1. Purpose: To return an error code if the queue is empty.
                       // 2. Explanation: Returns -1 to indicate an unsuccessful dequeue operation.
        }
        int value = queue[front]; // 1. Purpose: To retrieve the element at the front of the queue.
                                  // 2. Explanation: The element at the `front` is stored in `value`.
        front = (front + 1) % capacity; // 1. Purpose: To calculate the new front position in a circular manner.
                                        // 2. Explanation: `(front + 1) % capacity` ensures the front wraps around to the start if it exceeds the array bounds.
        size--; // 1. Purpose: To decrease the size of the queue.
                // 2. Explanation: The size is decremented to reflect the removal of the element.
        return value; // 1. Purpose: To return the dequeued element.
                      // 2. Explanation: The retrieved element is returned to the caller.
    }

    // Peek operation
    public int peek() {
        if (size == 0) { // 1. Purpose: To check if the queue is empty.
                         // 2. Explanation: If `size` is 0, the queue is empty, and peek is not allowed.
            System.out.println("\nQueue is empty");
            return -1; // 1. Purpose: To return an error code if the queue is empty.
                       // 2. Explanation: Returns -1 to indicate that there's no element to peek at.
        }
        return queue[front]; // 1. Purpose: To return the element at the front of the queue without removing it.
                             // 2. Explanation: The element at `front` is returned without modifying the queue.
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0; // 1. Purpose: To check if the queue is empty.
                          // 2. Explanation: Returns `true` if the `size` is 0, meaning the queue has no elements.
    }

    // Display the queue elements
    public void display() {
        if (size == 0) { // 1. Purpose: To check if the queue is empty before displaying elements.
                         // 2. Explanation: If `size` is 0, a message is printed, and the method returns.
            System.out.println("\nQueue is empty");
            return; // 1. Purpose: To exit the method if the queue is empty.
                    // 2. Explanation: Stops further execution since there's nothing to display.
        }
        System.out.print("\nQueue elements: "); // 1. Purpose: To start displaying the queue elements.
                                                // 2. Explanation: Prints a prompt before listing the elements.
        for (int i = 0; i < size; i++) { // 1. Purpose: To iterate through the queue elements.
                                         // 2. Explanation: Loops through the queue, starting from `front` to the end of the queue.
            System.out.print(queue[(front + i) % capacity] + " "); // 1. Purpose: To display each element in the queue.
                                                                  // 2. Explanation: Accesses elements using circular indexing and prints them.
        }
        System.out.println(); // 1. Purpose: To move to the next line after displaying elements.
                              // 2. Explanation: Adds a line break after the queue elements are printed.
    }

    public static void main(String[] args) {
        // Create a circular queue of size 5
        CircularQueue queue = new CircularQueue(5); // 1. Purpose: To initialize a circular queue with a capacity of 5.
                                                    // 2. Explanation: A `CircularQueue` object is created with 5 as the maximum number of elements it can hold.

        // Perform queue operations
        queue.enqueue(10); // 1. Purpose: To add an element to the queue.
                           // 2. Explanation: Enqueues the value 10 into the queue.
        queue.enqueue(20); // 1. Purpose: To add an element to the queue.
                           // 2. Explanation: Enqueues the value 20 into the queue.
        queue.enqueue(30); // 1. Purpose: To add an element to the queue.
                           // 2. Explanation: Enqueues the value 30 into the queue.
        queue.enqueue(40); // 1. Purpose: To add an element to the queue.
                           // 2. Explanation: Enqueues the value 40 into the queue.
        queue.enqueue(50); // 1. Purpose: To add an element to the queue.
                           // 2. Explanation: Enqueues the value 50 into the queue.

        // Display queue
        queue.display(); // 1. Purpose: To display all elements in the queue.
                         // 2. Explanation: The elements in the queue are printed in order.

        // Peek front element
        System.out.println("\nFront element is " + queue.peek()); // 1. Purpose: To view the front element of the queue.
                                                                  // 2. Explanation: Prints the element at the front without removing it.

        // Dequeue elements
        System.out.println("\n" + queue.dequeue() + " removed from queue"); // 1. Purpose: To remove the front element of the queue.
                                                                            // 2. Explanation: Dequeues and prints the element removed from the front.
        System.out.println("\n" + queue.dequeue() + " removed from queue"); // 1. Purpose: To remove the front element of the queue.
                                                                            // 2. Explanation: Dequeues and prints the element removed from the front.

        // Display queue
        queue.display(); // 1. Purpose: To display all elements in the queue after dequeuing.
                         // 2. Explanation: Prints the remaining elements in the queue.

        // Check if queue is empty
        System.out.println("\nIs queue empty? " + queue.isEmpty()); // 1. Purpose: To check if the queue is empty.
                                                                    // 2. Explanation: Prints `true` if the queue has no elements, otherwise `false`.
    }
}


//		Here's a structured flowchart diagram for the `CircularQueue` class, which implements a circular queue:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `CircularQueue` Class)
//		   |
//		   V
//		(Define Variables)
//		   - `queue`: Array to hold elements
//		   - `front`: Points to the first element
//		   - `rear`: Points to the last element
//		   - `size`: Number of elements in the queue
//		   - `capacity`: Maximum size of the queue
//		   |
//		   V
//		(Define Constructor `CircularQueue(int capacity)`)
//		   |
//		   V
//		   - Initialize `capacity`
//		   - Create `queue` array of size `capacity`
//		   - Set `front` to 0
//		   - Set `rear` to -1
//		   - Set `size` to 0
//		   |
//		   V
//		(Define `enqueue(int value)` Method)
//		   |
//		   V
//		   - If `size == capacity`:
//		     - Print "Queue Overflow"
//		     - Return
//		   - Update `rear` to `(rear + 1) % capacity`
//		   - Insert `value` at `queue[rear]`
//		   - Increment `size`
//		   - Print "value added to queue"
//		   |
//		   V
//		(Define `dequeue()` Method)
//		   |
//		   V
//		   - If `size == 0`:
//		     - Print "Queue Underflow"
//		     - Return -1
//		   - Retrieve element at `queue[front]`
//		   - Update `front` to `(front + 1) % capacity`
//		   - Decrement `size`
//		   - Return retrieved element
//		   |
//		   V
//		(Define `peek()` Method)
//		   |
//		   V
//		   - If `size == 0`:
//		     - Print "Queue is empty"
//		     - Return -1
//		   - Return element at `queue[front]`
//		   |
//		   V
//		(Define `isEmpty()` Method)
//		   |
//		   V
//		   - Return `size == 0`
//		   |
//		   V
//		(Define `display()` Method)
//		   |
//		   V
//		   - If `size == 0`:
//		     - Print "Queue is empty"
//		     - Return
//		   - Print "Queue elements:"
//		   - For `i = 0` to `size - 1`:
//		     - Print `queue[(front + i) % capacity]`
//		   - Print newline
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create `CircularQueue` instance with capacity 5
//		   - Call `enqueue` method with values 10, 20, 30, 40, 50
//		   - Call `display` method
//		   - Call `peek` method
//		   - Call `dequeue` method twice
//		   - Call `display` method
//		   - Call `isEmpty` method
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `CircularQueue` Class**: This class implements a circular queue with basic operations like enqueue, dequeue, peek, isEmpty, and display.
//		
//		3. **Define Variables**:
//		   - **`queue`**: An array to hold the elements of the queue.
//		   - **`front`**: Points to the first element.
//		   - **`rear`**: Points to the last element.
//		   - **`size`**: Number of elements in the queue.
//		   - **`capacity`**: Maximum size of the queue.
//		
//		4. **Define Constructor `CircularQueue(int capacity)`**:
//		   - **Initialize `capacity`**: Set the maximum number of elements the queue can hold.
//		   - **Create `queue` array**: Allocate space for the queue elements.
//		   - **Set `front` and `rear`**: Initialize positions to indicate an empty queue.
//		   - **Set `size`**: Initialize size to zero.
//		
//		5. **Define `enqueue(int value)` Method**:
//		   - **Check if full**: If `size == capacity`, print "Queue Overflow" and return.
//		   - **Update `rear`**: Move rear position circularly.
//		   - **Insert element**: Add the new value to the rear position.
//		   - **Increment `size`**: Reflect the addition of the new element.
//		   - **Print message**: Indicate that the value has been added.
//		
//		6. **Define `dequeue()` Method**:
//		   - **Check if empty**: If `size == 0`, print "Queue Underflow" and return -1.
//		   - **Retrieve element**: Get the element at the front position.
//		   - **Update `front`**: Move front position circularly.
//		   - **Decrement `size`**: Reflect the removal of the element.
//		   - **Return element**: Provide the removed element.
//		
//		7. **Define `peek()` Method**:
//		   - **Check if empty**: If `size == 0`, print "Queue is empty" and return -1.
//		   - **Return front element**: Provide the element at the front position.
//		
//		8. **Define `isEmpty()` Method**:
//		   - **Check if empty**: Return `true` if the queue size is 0.
//		
//		9. **Define `display()` Method**:
//		   - **Check if empty**: If `size == 0`, print "Queue is empty" and return.
//		   - **Print elements**: Iterate through the queue and print each element.
//		   - **Print newline**: Move to the next line after displaying elements.
//		
//		10. **Define `main(String[] args)` Method**:
//		    - **Create instance**: Initialize a `CircularQueue` with capacity 5.
//		    - **Enqueue elements**: Add values 10, 20, 30, 40, and 50.
//		    - **Display queue**: Show the elements in the queue.
//		    - **Peek front element**: View the front element of the queue.
//		    - **Dequeue elements**: Remove and print the front element twice.
//		    - **Display queue**: Show the remaining elements in the queue.
//		    - **Check if empty**: Determine if the queue is empty.
//		
//		11. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the processes and operations of a circular queue, including initialization, element addition and removal, and various queue operations.