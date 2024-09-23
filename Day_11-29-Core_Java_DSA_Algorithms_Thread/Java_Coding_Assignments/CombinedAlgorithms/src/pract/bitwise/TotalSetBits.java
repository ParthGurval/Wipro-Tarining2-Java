package pract.bitwise;

public class TotalSetBits {
    
    // Method to calculate the total number of set bits in numbers from 1 to n
    static int totalSetBits(int n) {
  //  	int n: The upper limit of the range of numbers for which we want to calculate the total number of set bits.
        
        int totSetBits = 0; // Variable to store the total number of set bits
        
        // Loop through each number from 0 to n
        for(int i = 0; i <= n; i++) {
            // Count the number of set bits (1s) in the binary representation of i
            // and add it to the total set bits count
            totSetBits += Integer.bitCount(i);
            // Purpose: Count set bits in the number `i` and add to the total count.
            // Explanation: `Integer.bitCount(i)` returns the number of 1s in the binary representation of `i`.
            // This value is then added to `totSetBits` to accumulate the total count of set bits from 0 to `n`.
        }
        
        // Return the total number of set bits
        return totSetBits;
        // Purpose: Return the accumulated total count of set bits.
        // Explanation: `totSetBits` holds the sum of all set bits from numbers 0 to `n`.
    }

    public static void main(String[] args) {
        // Test case
        int num = 3; // Number up to which we want to calculate the total set bits
        
        // Call the method to calculate total set bits and store the result
        int res = totalSetBits(num);
        // Purpose: Calculate the total number of set bits from 0 to `num`.
        // Explanation: `totalSetBits(num)` is called with `num` to compute the total number of set bits.
        
        // Print the result
        System.out.print("Total set bits from 1 to " + num + " is: " + res);
        // Purpose: Output the result of the total set bits calculation.
        // Explanation: Prints the total count of set bits for numbers from 1 to `num`.
    }
}

//
//		Here's a diagram outlining the flow of the `totalSetBits` method from your code. It represents the step-by-step process:
//		
//		(Start)
//		   |
//		   V
//		(Initialize Variables:
//		 totSetBits = 0
//		 i = 0 to n)
//		   |
//		   V
//		(Loop through each number from 0 to n:
//		   i = 0
//		   |
//		   V
//		   Count the number of set bits in `i`:
//		   totSetBits += Integer.bitCount(i))
//		   |
//		   V
//		   Increment `i` and continue the loop until `i > n`)
//		   |
//		   V
//		(Return total number of set bits:
//		   return totSetBits)
//		   |
//		   V
//		(Print Results:
//		   "Total set bits from 1 to " + num + " is: " + res)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		1. **Start**: Begin the execution of the method.
//		2. **Initialize Variables**: Set `totSetBits` to 0 and prepare to iterate through numbers from 0 to `n`.
//		3. **Loop through each number from 0 to n**: Iterate over all numbers in the range.
//		4. **Count the number of set bits in `i`**: Use `Integer.bitCount(i)` to find the number of 1s in the binary representation of `i` and add it to `totSetBits`.
//		5. **Increment `i`**: Move to the next number in the range and repeat the counting process.
//		6. **Return total number of set bits**: After the loop completes, return the total count of set bits.
//		7. **Print Results**: Output the result showing the total number of set bits from 1 to `num`.
//		8. **End**: Finish the execution of the method.
//		
//		This diagram provides a clear view of the flow of the `totalSetBits` method.