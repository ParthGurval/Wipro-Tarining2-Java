package com.wipro.DsQueue;

import java.util.*;

public class SearchingDemo {

    public static void main(String[] args) {
        // Create an ArrayList with Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("M");
        list.add("K");
        list.add("a");

        // Print the original list
        System.out.println("Original List: " + list); // Output: [Z, A, M, K, a]

        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list); // Output: [A, K, M, Z, a]

        // Perform binary search
        // Note: Binary search requires the list to be sorted
        System.out.println("Index of 'Z': " + Collections.binarySearch(list, "Z")); // Output: 3
        System.out.println("Index of 'J': " + Collections.binarySearch(list, "J")); // Output: -4
    }
}
