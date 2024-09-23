package pract.queue;


//Double-ended queue
import java.util.ArrayDeque;
import java.util.Deque;

// DequeExample.java
public class DequeExample {
    
    public static void main(String[] args) {
        // Create a deque
        Deque<Integer> deque = new ArrayDeque<>();
        
        // Add elements to both ends of the deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);
        deque.addLast(40);
        
        
        // Display the deque
        System.out.println("Deque elements: " + deque); // Output: [30, 10, 20, 40]
        
        // Peek front and rear elements
        System.out.println("Front element is " + deque.peekFirst()); // Output: Front element is 30
        System.out.println("Rear element is " + deque.peekLast()); // Output: Rear element is 40
        
        // Remove elements from both ends
        System.out.println(deque.removeFirst() + " removed from front"); // Output: 30 removed from front
        System.out.println(deque.removeLast() + " removed from rear"); // Output: 40 removed from rear
        
        // Display the deque
        System.out.println("Deque elements: " + deque); // Output: [10, 20]
        
        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty()); // Output: Is deque empty? false
    }
}


//		Here's a structured flowchart diagram for the `DequeExample` class, which demonstrates basic operations on a double-ended queue (deque) using the `ArrayDeque` class:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `DequeExample` Class)
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		- Create a deque:
//		  - `Deque<Integer> deque = new ArrayDeque<>();`
//		   |
//		   V
//		- Add elements to both ends of the deque:
//		  - `deque.addFirst(10);`
//		  - `deque.addLast(20);`
//		  - `deque.addFirst(30);`
//		  - `deque.addLast(40);`
//		   |
//		   V
//		- Display the deque elements:
//		  - Print "Deque elements: " + deque
//		   |
//		   V
//		- Peek front and rear elements:
//		  - Print "Front element is " + deque.peekFirst()
//		  - Print "Rear element is " + deque.peekLast()
//		   |
//		   V
//		- Remove elements from both ends:
//		  - `deque.removeFirst();` and print "<value> removed from front"
//		  - `deque.removeLast();` and print "<value> removed from rear"
//		   |
//		   V
//		- Display the deque elements again:
//		  - Print "Deque elements: " + deque
//		   |
//		   V
//		- Check if deque is empty:
//		  - Print "Is deque empty? " + deque.isEmpty()
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `DequeExample` Class**: The class encapsulates operations on a double-ended queue.
//		
//		3. **Define `main(String[] args)` Method**: The main method where deque operations are demonstrated.
//		
//		4. **Create a Deque**: 
//		   - Instantiate a `Deque` using `ArrayDeque`.
//		
//		5. **Add Elements to Both Ends**:
//		   - Add elements to the front using `addFirst()`.
//		   - Add elements to the rear using `addLast()`.
//		
//		6. **Display the Deque Elements**:
//		   - Print the elements currently in the deque.
//		
//		7. **Peek Front and Rear Elements**:
//		   - Use `peekFirst()` to get the front element without removing it.
//		   - Use `peekLast()` to get the rear element without removing it.
//		
//		8. **Remove Elements from Both Ends**:
//		   - Remove the front element using `removeFirst()` and print it.
//		   - Remove the rear element using `removeLast()` and print it.
//		
//		9. **Display the Deque Elements Again**:
//		   - Print the elements remaining in the deque after removals.
//		
//		10. **Check if Deque is Empty**:
//		    - Use `isEmpty()` to check if the deque is empty and print the result.
//		
//		11. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the sequence of operations performed on a `Deque` using the `ArrayDeque` class, including adding, peeking, removing elements, and checking if the deque is empty.