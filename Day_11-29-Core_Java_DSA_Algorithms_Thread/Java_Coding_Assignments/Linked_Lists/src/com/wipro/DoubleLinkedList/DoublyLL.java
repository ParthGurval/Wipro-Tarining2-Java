package com.wipro.DoubleLinkedList;

//DoublyLinkedList.java
class Node {
 int data;
 Node next;
 Node prev;
 
 Node(int data) {
     this.data = data;
     this.next = null;
     this.prev = null;
 }
}

class DoublyLL {
 Node head;
 
 void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.prev = temp;
     }
 }
 
 void display() {
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
	 DoublyLL list = new DoublyLL();
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.display(); // Output: 1 2 3
 }
}
