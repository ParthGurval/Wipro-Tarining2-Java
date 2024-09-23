package com.wipro.PriorityQueue;

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
