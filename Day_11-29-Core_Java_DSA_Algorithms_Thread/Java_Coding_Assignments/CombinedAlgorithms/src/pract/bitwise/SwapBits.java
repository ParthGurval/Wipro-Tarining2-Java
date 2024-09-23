package pract.bitwise;

public class SwapBits {

    // Method to swap bits in a number
    static int swappingBits(int x, int p1, int p2, int n) {
    	
//    	Parameters Explanation
//    	int x: The integer in which bits will be swapped.
//    	int p1: The starting position of the first set of bits to be swapped.
//    	int p2: The starting position of the second set of bits to be swapped.
//    	int n: The number of bits to swap.
        
        // Extract `n` bits from position `p1`
        int set1 = (x >> p1) & ((1 << n) - 1); 
        // Purpose: Extract `n` bits starting from position `p1`. 
        // Explanation: `(x >> p1)` shifts the number `x` right by `p1` bits so that the desired bits align with the least significant bits.
        // `((1 << n) - 1)` creates a bitmask of `n` bits set to `1`, which is used to isolate these `n` bits.
        
        // Extract `n` bits from position `p2`
        int set2 = (x >> p2) & ((1 << n) - 1); 
        // Purpose: Extract `n` bits starting from position `p2`. 
        // Explanation: Similar to the previous step but for position `p2`.

        // XOR the extracted bits to find differing bits
        int xor = set1 ^ set2; 
        // Purpose: Determine which bits are different between the two sets.
        // Explanation: XOR operation between `set1` and `set2` highlights the bits that differ. Bits that are the same will be `0`, and differing bits will be `1`.

        // Position the XORed bits back to the original positions
        xor = (xor << p1) | (xor << p2); 
        // Purpose: Move the XORed bits to the positions where they need to be swapped.
        // Explanation: `(xor << p1)` moves the differing bits to the `p1` position and `(xor << p2)` moves them to the `p2` position.
        // The `|` (bitwise OR) combines these two sets of bits to create a mask where the differing bits are positioned correctly for swapping.

        // XOR the original number with the XORed bits to swap them
        return x ^ xor; 
        // Purpose: Swap the bits in `x` using the mask `xor`.
        // Explanation: The XOR operation between `x` and `xor` will flip the bits in `x` at positions `p1` and `p2` as needed, effectively swapping them.
    }

    public static void main(String[] args) {
        // Test cases
        int number  = 28; // The number to perform the swap on
        int p1 = 0; // Starting position of the first set of bits
        int p2 = 3; // Starting position of the second set of bits
        int n = 2; // Number of bits to swap
        
        // Print the original number
        System.out.print("Original Number: " + number); 
        // Purpose: Output the original number. 
        // Explanation: Displays the number before swapping bits.

        // Perform the bit swap and print the result
        int res = swappingBits(number, p1, p2, n); 
        // Purpose: Call the method to perform the bit swap.
        // Explanation: The `swappingBits` method is invoked to swap the bits in `number` and store the result in `res`.

        System.out.println("\nNumber after swapping: " + res); 
        // Purpose: Output the number after swapping bits.
        // Explanation: Displays the result of the bit swap operation.
    }
}



//			(Start)
//			|
//			V
//			(Initialize Variables:
//			x = 28
//			p1 = 0
//			p2 = 3
//			n = 2)
//			|
//			V
//			(Extract `n` Bits from Position `p1`:
//			set1 = (x >> p1) & ((1 << n) - 1))
//			|
//			V
//			(Extract `n` Bits from Position `p2`:
//			set2 = (x >> p2) & ((1 << n) - 1))
//			|
//			V
//			(XOR the Extracted Bits:
//			xor = set1 ^ set2)
//			|
//			V
//			(Position XORed Bits:
//			xor = (xor << p1) | (xor << p2))
//			|
//			V
//			(Perform Bit Swap:
//			return x ^ xor)
//			|
//			V
//			(Print Results:
//			"Original Number: " + number
//			"Number after swapping: " + res)
//			|
//			V
//			(End)
