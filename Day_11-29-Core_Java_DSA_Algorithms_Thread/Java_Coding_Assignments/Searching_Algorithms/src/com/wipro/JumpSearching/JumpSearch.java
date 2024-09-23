package com.wipro.JumpSearching;


public class JumpSearch {
 

 public static int jumpSearch(int[] arr, int target) {
     int n = arr.length;
     int step = (int) Math.sqrt(n); // Calculate the optimal block size (step)
     int prev = 0;
     
     
     while (arr[Math.min(step, n) - 1] < target) {
         prev = step; // Update the previous block
         step += (int) Math.sqrt(n); // Jump to the next block
         if (prev >= n) return -1; // If step exceeds array length, target not found
     }
     
     // Linear search within the block
     for (int i = prev; i < Math.min(step, n); i++) {
         if (arr[i] == target) return i; // Target found
     }
     
     return -1; // Target not found
 }
 
 public static void main(String[] args) {
    
     int[] arr = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28};
     int target = 19;
     
     
     int result = jumpSearch(arr, target);
     
   
     if (result != -1) {
         System.out.println("Element " + target + " found at index " + result);
     } else {
         System.out.println("Element " + target + " not found in the array");
     }
 }
}
