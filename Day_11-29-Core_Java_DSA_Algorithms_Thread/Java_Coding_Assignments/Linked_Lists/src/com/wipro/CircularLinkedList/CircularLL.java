package com.wipro.CircularLinkedList;

//CircularLinkedList.java
class Node {
 int data;
 Node next;
 
 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

class CircularLL {
 Node head;
 
 void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         newNode.next = head;
     } else {
         Node temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.next = head;
     }
 }
 
 void display() {
     if (head == null) return;
     Node temp = head;
     do {
         System.out.print(temp.data + " ");
         temp = temp.next;
     } while (temp != head);
     System.out.println();
 }
 
 public static void main(String[] args) {
	 CircularLL list = new CircularLL();
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.display(); // Output: 1 2 3
 }
}

