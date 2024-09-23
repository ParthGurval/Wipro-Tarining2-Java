package com.wipro.DsQueue;

import java.util.PriorityQueue;

public class PriQue {

    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator
        PriorityQueue<Product> prquq = new PriorityQueue<>(15, new ProdPriceComparator());

        // Offer products to the priority queue
        prquq.offer(new Product(100, "Laptop", 70000));
        prquq.offer(new Product(104, "HeadPhones", 12000));
        prquq.offer(new Product(103, "Keyboard", 4000));
        prquq.offer(new Product(102, "GraphicsCard", 30000));

        // Poll and print products in order of their price
        while (!prquq.isEmpty()) {
            System.out.println(prquq.poll());
        }
    }
}
