package com.wipro.FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    // Constructor to initialize the value and weight of the item
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {

    // Function to calculate the maximum value we can obtain
    static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;
        
        // Loop through the sorted items
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                // If the item can fit entirely in the knapsack, take it
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // If only part of the item can fit, take the fraction that fits
                double fraction = ((double) capacity / item.weight);
                totalValue += (item.value * fraction);
                break;  // No more capacity left in the knapsack
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Array of items with their respective values and weights
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        
        // Knapsack capacity
        int capacity = 50;

        // Get the maximum value that can be obtained
        double maxValue = getMaxValue(items, capacity);
        
        // Print the result
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
