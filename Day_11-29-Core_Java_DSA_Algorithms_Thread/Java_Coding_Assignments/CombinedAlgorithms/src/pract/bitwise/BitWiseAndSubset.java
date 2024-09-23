package pract.bitwise;

public class BitWiseAndSubset {

    // Method to calculate the sum of bitwise AND of all subsets
    static int sumOfANDSubset(int[] arr) {
        
        int n = arr.length; // Purpose: Get the length of the input array. Explanation: Stores the number of elements in the array.
        int result = 0; // Purpose: Initialize the result variable. Explanation: This will store the final sum of bitwise AND of all subsets.

        // Iterate over each bit position (from 0 to 31 for 32-bit integers)
        for(int bit = 0; bit < 32; bit++) {
            
            int bitMask = 1 << bit; // Purpose: Create a bitmask to isolate the current bit position. 
            //Explanation: `1 << bit` shifts 1 to the left by `bit` positions, setting only the `bit`-th position to 1.
            
            int subsetCount = 0; // Purpose: Count how many numbers have the current bit set. 
            //Explanation: This variable keeps track of how many elements in the array have the current bit position set.

            // Iterate through each number in the array
            for(int num : arr) {
                
                // Check if the current number has the bit set using bitwise AND
                if((num & bitMask) != 0) {
                    
                    subsetCount++; // Purpose: Increment the count if the current bit is set. Explanation: If `num & bitMask` is not zero, 
                    // it means the `bit`-th bit is set in `num`.
                }
            }
            
            // Calculate the contribution of the current bit to the final result
            int bitContribute = subsetCount * (1 << bit); // Purpose: Calculate the total contribution of this bit to all subsets. 
            //Explanation: The contribution of each bit is `subsetCount` times its value, which is `1 << bit`.
            
            result += bitContribute; // Purpose: Add the contribution to the final result. Explanation: Aggregates the contributions of all 
            // bits to get the total sum.

        }
        
        return result; // Purpose: Return the final result. Explanation: This value is the sum of bitwise ANDs of all subsets.
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3}; // Purpose: Define the first test array. Explanation: Array of integers for which we want to compute the sum of bitwise AND 
        //of all subsets.
        
        int[] arr2 = {1, 2, 3, 4}; // Purpose: Define the second test array. Explanation: Another array for testing the method with more elements.
    
        // Print the result for the first array
        System.out.println("Sum of the Bitwise AND for array a1 = {1, 2, 3} is: " + sumOfANDSubset(arr1));
        // Print the result for the second array
        System.out.println("Sum of the Bitwise AND for array a2 = {1, 2, 3, 4} is: " + sumOfANDSubset(arr2));
    }
}


//		(Start)
//		|
//		V
//		(Initialize Variables: xorNum = 0, num1 = 0, num2 = 0)
//		|
//		V
//		(XOR All Elements in Array)
//		|
//		V
//		(Calculate Rightmost Set Bit: rMostBit = xorNum & (-xorNum))
//		|
//		V
//		(Divide Elements Based on Rightmost Set Bit)
//		|
//		V
//		(Print Results: num1 and num2)
//		|
//		V
//		(End)

