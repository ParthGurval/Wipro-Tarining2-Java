package com.wipro.CombinedLL;

//CombinedLinkedList.java
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

class CombinedLinkedList {
 Node head;
 boolean isCircular;
 
 CombinedLinkedList(boolean isCircular) {
     this.isCircular = isCircular;
 }
 
 void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         if (isCircular) newNode.next = head;
     } else {
         Node temp = head;
         while (temp.next != null && (temp.next != head || !isCircular)) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.prev = temp;
         if (isCircular) newNode.next = head;
     }
 }
 
 void display() {
     if (head == null) return;
     Node temp = head;
     do {
         System.out.print(temp.data + " ");
         temp = temp.next;
     } while (temp != head && (temp != null));
     System.out.println();
 }
 
 public static void main(String[] args) {
     System.out.println("Singly Linked List:");
     CombinedLinkedList singlyList = new CombinedLinkedList(false);
     singlyList.insert(1);
     singlyList.insert(2);
     singlyList.insert(3);
     singlyList.display(); // Output: 1 2 3
     
     System.out.println("Doubly Linked List:");
     CombinedLinkedList doublyList = new CombinedLinkedList(false);
     doublyList.insert(1);
     doublyList.insert(2);
     doublyList.insert(3);
     doublyList.display(); // Output: 1 2 3
     
     System.out.println("Circular Linked List:");
     CombinedLinkedList circularList = new CombinedLinkedList(true);
     circularList.insert(1);
     circularList.insert(2);
     circularList.insert(3);
     circularList.display(); // Output: 1 2 3
 }
}

