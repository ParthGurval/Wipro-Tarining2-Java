package com.wipro.DsQueue;

import java.util.*;

public class CollDemoCom {

    public static void main(String[] args) {
        // Create an ArrayList with Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("K");
        list.add("L");

        System.out.println("Before sorting: " + list); // Output: [Z, A, K, L]
        
        // Sort the list using a comparator
        Collections.sort(list, new MyComparator());
        
        System.out.println("After sorting: " + list); // Output: [Z, L, K, A]
    }
}

// Custom comparator to sort strings in reverse order
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Compare strings in reverse order
        return s2.compareTo(s1);
    }
}
