package com.wipro.Stack;


public class Stack {
 private int[] stack;
 private int top;
 private int capacity;
 
 // Constructor to initialize stack
 public Stack(int size) {
     capacity = size;
     stack = new int[capacity];
     top = -1; // Stack is empty initially
 }
 
 // Push operation
 public void push(int value) {
     if (top == capacity - 1) {
         System.out.println("Stack Overflow");
         return;
     }
     stack[++top] = value;
     System.out.println("\n"+ value + " pushed to stack");
 }
 
 // Pop operation
 public int pop() {
     if (isEmpty()) {
         System.out.println("Stack Underflow");
         return -1;
     }
     return stack[top--];
 }
 
 // Peek operation
 public int peek() {
     if (isEmpty()) {
         System.out.println("Stack is empty");
         return -1;
     }
     return stack[top];
 }
 
 // Check if stack is empty
 public boolean isEmpty() {
     return top == -1;
 }
 
 // Display the stack elements
 public void display() {
     if (isEmpty()) {
         System.out.println("\nStack is empty");
         return;
     }
     System.out.print("\nStack elements: ");
     for (int i = 0; i <= top; i++) {
         System.out.print(stack[i] + " ");
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
     // Create a stack of size 5
     Stack stack = new Stack(5);
     
     // Perform stack operations
     stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     stack.push(50);
     
     // Display stack
     stack.display(); // Output: Stack elements: 10 20 30 40 50 
     
     // Peek top element
     System.out.println("\nTop element is " + stack.peek()); // Output: Top element is 50
     
     // Pop elements
     System.out.println("\n"+stack.pop() + " popped from stack"); // Output: 50 popped from stack
     System.out.println("\n"+stack.pop() + " popped from stack"); // Output: 40 popped from stack
     
     // Display stack
     stack.display(); // Output: Stack elements: 10 20 30
     
     // Check if stack is empty
     System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
 }
}

