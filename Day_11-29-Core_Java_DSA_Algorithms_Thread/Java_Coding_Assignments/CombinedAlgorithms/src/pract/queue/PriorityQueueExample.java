package pract.queue;

import java.util.PriorityQueue;

//PriorityQueueExample.java
public class PriorityQueueExample {
 
 public static void main(String[] args) {
     // Create a priority queue
     PriorityQueue<Integer> queue = new PriorityQueue<>();
     
     // Add elements to the queue with priorities
     queue.add(30);
     queue.add(10);
     queue.add(20);
     queue.add(40);
     
     // Display the priority queue
     System.out.println("Priority Queue elements: " + queue); // Output: [10, 20, 30, 40]
     
     // Peek front element
     System.out.println("Front element is " + queue.peek()); // Output: Front element is 10
     
     // Remove elements
     System.out.println(queue.poll() + " removed from queue"); // Output: 10 removed from queue
     System.out.println(queue.poll() + " removed from queue"); // Output: 20 removed from queue
     
     // Display the priority queue
     System.out.println("Priority Queue elements: " + queue); // Output: [30, 40]
     
     // Check if queue is empty
     System.out.println("Is queue empty? " + queue.isEmpty()); // Output: Is queue empty? false
 }
}


//		Here's a structured flowchart diagram for the `PriorityQueueExample` class, demonstrating basic operations on a priority queue using the `PriorityQueue` class:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `PriorityQueueExample` Class)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		- Create a priority queue:
//		  - `PriorityQueue<Integer> queue = new PriorityQueue<>();`
//		   |
//		   V
//		- Add elements to the queue with priorities:
//		  - `queue.add(30);`
//		  - `queue.add(10);`
//		  - `queue.add(20);`
//		  - `queue.add(40);`
//		   |
//		   V
//		- Display the priority queue elements:
//		  - Print "Priority Queue elements: " + queue
//		   |
//		   V
//		- Peek front element:
//		  - Print "Front element is " + queue.peek()
//		   |
//		   V
//		- Remove elements:
//		  - `queue.poll();` and print "<value> removed from queue"
//		  - `queue.poll();` and print "<value> removed from queue"
//		   |
//		   V
//		- Display the priority queue elements again:
//		  - Print "Priority Queue elements: " + queue
//		   |
//		   V
//		- Check if queue is empty:
//		  - Print "Is queue empty? " + queue.isEmpty()
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `PriorityQueueExample` Class**: The class encapsulates operations on a priority queue.
//		
//		3. **Define `main(String[] args)` Method**: The main method where priority queue operations are demonstrated.
//		
//		4. **Create a Priority Queue**:
//		   - Instantiate a `PriorityQueue` object for integers.
//		
//		5. **Add Elements to the Queue with Priorities**:
//		   - Add elements using `add()`. The priority queue will automatically sort elements according to their natural ordering.
//		
//		6. **Display the Priority Queue Elements**:
//		   - Print the elements currently in the queue.
//		
//		7. **Peek Front Element**:
//		   - Use `peek()` to get the front element of the queue without removing it.
//		
//		8. **Remove Elements**:
//		   - Remove the front element using `poll()` and print it.
//		   - Remove the next element using `poll()` and print it.
//		
//		9. **Display the Priority Queue Elements Again**:
//		   - Print the elements remaining in the queue after removals.
//		
//		10. **Check if Queue is Empty**:
//		    - Use `isEmpty()` to check if the queue is empty and print the result.
//		
//		11. **End**: Completion of the program execution and output.
//		
//		This flowchart provides a clear sequence of operations for managing a `PriorityQueue`, including adding, peeking, removing elements, and checking if the queue is empty.