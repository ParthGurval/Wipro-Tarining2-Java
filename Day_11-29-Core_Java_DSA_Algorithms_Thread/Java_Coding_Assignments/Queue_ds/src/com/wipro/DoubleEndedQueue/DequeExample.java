package com.wipro.DoubleEndedQueue;

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


