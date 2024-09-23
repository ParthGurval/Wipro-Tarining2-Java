package com.wipro.SimpleQueue;

//SimpleQueue.java
public class SimpleQueue {
 private int[] queue;
 private int front, rear, size, capacity;
 
 // Constructor to initialize queue
 public SimpleQueue(int capacity) {
     this.capacity = capacity;
     queue = new int[capacity];
     front = 0;
     rear = -1;
     size = 0;
 }
 
 // Enqueue operation
 public void enqueue(int value) {
     if (size == capacity) {
         System.out.println("\nQueue Overflow");
         return;
     }
     rear = (rear + 1) % capacity;
     queue[rear] = value;
     size++;
     System.out.println("\n"+value + " added to queue");
 }
 
 // Dequeue operation
 public int dequeue() {
     if (size == 0) {
         System.out.println("\nQueue Underflow");
         return -1;
     }
     int value = queue[front];
     front = (front + 1) % capacity;
     size--;
     return value;
 }
 
 // Peek operation
 public int peek() {
     if (size == 0) {
         System.out.println("\nQueue is empty");
         return -1;
     }
     return queue[front];
 }
 
 // Check if queue is empty
 public boolean isEmpty() {
     return size == 0;
 }
 
 // Display the queue elements
 public void display() {
     if (size == 0) {
         System.out.println("Queue is empty");
         return;
     }
     System.out.print("Queue elements: ");
     for (int i = 0; i < size; i++) {
         System.out.print(queue[(front + i) % capacity] + " ");
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
     // Create a queue of size 5
     SimpleQueue queue = new SimpleQueue(5);
     
     // Perform queue operations
     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);
     queue.enqueue(40);
     queue.enqueue(50);
     
     // Display queue
     queue.display(); // Output: Queue elements: 10 20 30 40 50 
     
     // Peek front element
     System.out.println("\nFront element is " + queue.peek()); // Output: Front element is 10
     
     // Dequeue elements
     System.out.println("\n"+queue.dequeue() + " removed from queue"); // Output: 10 removed from queue
     System.out.println("\n"+queue.dequeue() + " removed from queue"); // Output: 20 removed from queue
     
     // Display queue
     queue.display(); // Output: Queue elements: 30 40 50
     
     // Check if queue is empty
     System.out.println("\nIs queue empty? " + queue.isEmpty()); // Output: Is queue empty? false
 }
}

