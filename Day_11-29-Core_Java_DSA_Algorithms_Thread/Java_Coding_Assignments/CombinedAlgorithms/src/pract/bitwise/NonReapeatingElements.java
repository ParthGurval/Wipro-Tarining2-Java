package pract.bitwise;

public class NonReapeatingElements {

    // Method to find the two non-repeating elements in an array
    public static void nonReapElements(int[] arr) {
        
        int xorNum = 0, num1 = 0, num2 = 0; 
        // Purpose: Initialize variables. Explanation: `xorNum` will store the XOR of all elements, `num1` and `num2` will store the two non-repeating elements.
        
        
        // XOR all elements in the array to get XOR of the two non-repeating elements
        for(int num : arr) { // Purpose: Iterate through all elements in the array. Explanation: This loop calculates the XOR of all elements.
            xorNum ^= num; 
            // Purpose: XOR each element with `xorNum`. 
            //Explanation: This operation will cancel out the elements that appear twice,   
            // leaving XOR of the two unique elements.
            
        }
        
        // Get the rightmost set bit in xorNum
        // Here rMostBit is RightMost bit
        int rMostBit = xorNum & (-xorNum);  // -xorNum is using the concept of two's complement to represent the negative of the number xorNum.
        // Purpose: Isolate the rightmost set bit. Explanation: `xorNum & (-xorNum)` isolates the rightmost bit that is set to 1 in `xorNum`.
//      Two's Complement:
//      In binary representation, the two's complement of a number is found by inverting all the bits (changing 1s to 0s and vice versa) and then adding 1 to the result.
//      For example, if xorNum is 5, its binary representation is 0101. The two's complement of 5 is calculated as:
//      Invert the bits: 1010.
//      Add 1: 1010 + 1 = 1011.
//      1011 is the binary representation of -5.
        
        
        // Divide the elements into two groups based on the rightmost set bit
        for(int num : arr) { // Purpose: Iterate through all elements again. 
        	//Explanation: This loop separates elements into two groups based on the isolated bit.
        	
            if((num & rMostBit) == 0) { 
            	// Purpose: Check if the rightmost set bit is 0. Explanation: If true, the element belongs to the first group.
            	
                num1 ^= num; // Purpose: XOR the element with `num1`. Explanation: This operation accumulates the XOR of elements in the first group, 
                // resulting in one of the non-repeating elements.
                
            } else { // Purpose: Handle elements where the rightmost set bit is 1. Explanation: These elements belong to the second group.
            	
                num2 ^= num; 
                // Purpose: XOR the element with `num2`. Explanation: This operation accumulates the XOR of elements in the second group, 
                // resulting in the other non-repeating element.
            }
        }
        
        // Print the two non-repeating elements
        System.out.println("The two Non-Repeating Elements are: " + num1 + " & " + num2); 
        // Purpose: Output the results. Explanation: This prints the two unique elements found in the array.
    }
    
    public static void main(String[] args) {
        // Test case
        int[] array = { 2, 3, 7, 9, 11, 2, 3, 11 }; 
        // Purpose: Define the test array. Explanation: This array contains the numbers with two non-repeating elements.
        
        // Find and print the two non-repeating elements
        nonReapElements(array); 
        // Purpose: Call the method to find and print the non-repeating elements. Explanation: Executes the `nonReapElements` 
        // method with the test array as input.
    }
}







// ************** Code to find all non-repeating elements ***************************
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class NonRepeatingElements {
//
//    public static void findAllNonRepeatingElements(int[] arr) {
//        // Step 1: Create a map to store frequency of each element
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // Step 2: Populate the frequency map
//        for (int num : arr) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Step 3: Find and print elements that appear exactly once
//        System.out.print("The non-repeating elements are: ");
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.print(entry.getKey() + " ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {2, 3, 7, 9, 11, 2, 3, 11, 13, 15, 18, 13, 20, 26, 18};
//        findAllNonRepeatingElements(array);
//    }
//}


// javascript code

//function findAllNonRepeatingElements(arr) {
//    // Step 1: Create a map to store frequency of each element
//    const frequencyMap = new Map();
//
//    // Step 2: Populate the frequency map
//    arr.forEach(num => {
//        frequencyMap.set(num, (frequencyMap.get(num) || 0) + 1);
//    });
//
//    // Step 3: Find and print elements that appear exactly once
//    console.log("The non-repeating elements are:");
//    frequencyMap.forEach((value, key) => {
//        if (value === 1) {
//            console.log(key);
//        }
//    });
//}
//
//// Test the function
//const array = [2, 3, 7, 9, 11, 2, 3, 11, 13, 15, 18, 13, 20, 26, 18];
//findAllNonRepeatingElements(array);


//
//				(Start)
//				|
//				V
//				(Initialize Variables: xorNum = 0, num1 = 0, num2 = 0)
//				|
//				V
//				(XOR All Elements in Array)
//				|
//				V
//				(Calculate Rightmost Set Bit: rMostBit = xorNum & (-xorNum))
//				|
//				V
//				(Divide Elements Based on Rightmost Set Bit)
//				|
//				V
//				(Print Results: num1 and num2)
//				|
//				V
//				(End)
