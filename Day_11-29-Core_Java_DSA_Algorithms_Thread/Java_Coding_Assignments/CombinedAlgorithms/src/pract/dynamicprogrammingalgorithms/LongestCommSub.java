package pract.dynamicprogrammingalgorithms;

public class LongestCommSub {

    // Purpose: Computes the length of the longest common subsequence (LCS) between two strings
    static int lcs(String s1, String s2) {
        
        // Purpose: Get the length of the first and second strings
        int n = s1.length();  // Length of string s1
        int m = s2.length();  // Length of string s2
        
        // Purpose: Initializes a 2D array dp used to store the length of the longest common subsequence (LCS) for different substrings of s1 and s2.
        int[][] dp = new int[m + 1][n + 1];
        // dp[i][j] will hold the length of LCS of s1[0..i-1] and s2[0..j-1]
   //     m + 1: The number of rows in the dp array is m + 1, where m is the length of the second string s2.
  //      The extra row (i.e., m + 1 instead of m) is used to handle the base case where one of the strings is empty.
//        n + 1: The number of columns in the dp array is n + 1, where n is the length of the first string s1. 
//        The extra column (i.e., n + 1 instead of n) is used for the same reason as above.
        
        // Purpose: Fill the dp table using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                // This condition checks if the characters at the current positions of s1 and s2 match. If they do, 
            	// the LCS length for the current substrings is updated.
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                	//s1.charAt(i - 1): Gets the character from s1 at index i - 1 (since the array is 1-based).
                	//s2.charAt(j - 1): Gets the character from s2 at index j - 1 (since the array is 1-based)
                    
                    // Purpose: Update the LCS length when the characters from s1 and s2 match.
                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    If the characters match, the LCS length for the substrings s1[0..i-1] and s2[0..j-1] can be extended by 1 from the LCS length of 
//                    the substrings s1[0..i-2] and s2[0..j-2]. Thus, the value dp[i][j] is set to dp[i - 1][j - 1] + 1.
           //         dp[i][j]: This value is stored in a 2D array dp where:
//                    	i represents the length of the substring from the first string s1 (up to the i-th character).
//                    	j represents the length of the substring from the second string s2 (up to the j-th character).
                //    	Purpose: dp[i][j] keeps track of the length of the LCS for the substrings s1[0..i-1] and s2[0..j-1].
                } 
                
                // Purpose: If characters don't match, take the maximum LCS length by excluding one of the characters
                else {
                    
                    // Purpose: The value of dp[i][j] is the maximum of excluding the character from s1 or s2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                    Math.max(dp[i - 1][j], dp[i][j - 1]) is used to select the longer of two possible LCS lengths: 
//                    dp[i - 1][j]: Represents the LCS length for the substring s1[0..i-2] and s2[0..j-1]. 
//                    This corresponds to excluding the current character from s1.
//                    dp[i][j - 1]: Represents the LCS length for the substring s1[0..i-1] and s2[0..j-2]. 
//                    This corresponds to excluding the current character from s2.
                }
                
                // debug
                // System.out.println("dp[" + i + "][" + j + "] = " + dp[i][j]);
            }
        }
        
        // debug
        /*
        System.out.println("\nFinal DP Table: "); 
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                
                // Purpose: Print the current state of the dp table
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        */
        
        // Purpose: Return the length of the longest common subsequence found
        return dp[m][n];
    }

    public static void main(String[] args) {
        // Purpose: Entry point of the program

        String s1 = "ABAABA";  // First string
        String s2 = "BABBAB";  // Second string
        
        // Purpose: Print the length of the LCS between s1 and s2
        System.out.println("Length of the LCS: " + lcs(s1, s2));
    }
}


//		Here’s a structured flowchart diagram for the `LongestCommSub` class, which calculates the Longest Common Subsequence (LCS) between two strings using dynamic programming:
//		
//		(Start)
//		   |
//		   V
//		(Define `main()` Method)
//		   |
//		   V
//		(Initialize Strings):
//		   |
//		   V
//		   - `String s1 = "ABAABA"`
//		   - `String s2 = "BABBAB"`
//		   |
//		   V
//		(Call `lcs(s1, s2)`):
//		   |
//		   V
//		(Print Length of the LCS):
//		   |
//		   V
//		(End)
//		
//		(Define `lcs(String s1, String s2)` Method)
//		   |
//		   V
//		(Initialize Variables):
//		   |
//		   V
//		   - `int n = s1.length()`: Length of the first string s1
//		   - `int m = s2.length()`: Length of the second string s2
//		   - `int[][] dp = new int[m + 1][n + 1]`: 2D array to store LCS lengths
//		   |
//		   V
//		(Fill the DP Table):
//		   |
//		   V
//		   (Loop through Each Character of s2):
//		      |
//		      V
//		      (Loop through Each Character of s1):
//		         |
//		         V
//		         (Check if Characters Match):
//		            |
//		            V
//		            - If `s1.charAt(i - 1) == s2.charAt(j - 1)`:
//		               |
//		               V
//		               - Update `dp[i][j] = dp[i - 1][j - 1] + 1`
//		               |
//		               V
//		               (dp[i][j] represents the length of LCS of s1[0..i-1] and s2[0..j-1])
//		         |
//		         V
//		         (If Characters Don’t Match):
//		            |
//		            V
//		            - Update `dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])`
//		            |
//		            V
//		            (dp[i][j] represents the maximum LCS length by excluding one character)
//		   |
//		   V
//		(Return Length of LCS):
//		   |
//		   V
//		   - `return dp[m][n]`
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `main()` Method**:
//		   - **Initialize Strings**:
//		     - `String s1 = "ABAABA"`: First string.
//		     - `String s2 = "BABBAB"`: Second string.
//		   - **Call `lcs(s1, s2)`**: Calculate the length of the LCS.
//		   - **Print Length of the LCS**: Display the result.
//		
//		3. **Define `lcs(String s1, String s2)` Method**:
//		   - **Initialize Variables**:
//		     - `int n = s1.length()`: Length of the first string.
//		     - `int m = s2.length()`: Length of the second string.
//		     - `int[][] dp = new int[m + 1][n + 1]`: 2D array for storing LCS lengths.
//		   - **Fill the DP Table**:
//		     - **Loop through Each Character of s2**:
//		       - **Loop through Each Character of s1**:
//		         - **Check if Characters Match**:
//		           - **If `s1.charAt(i - 1) == s2.charAt(j - 1)`**:
//		             - Update `dp[i][j]` to be `dp[i - 1][j - 1] + 1`.
//		         - **If Characters Don’t Match**:
//		           - Update `dp[i][j]` to be the maximum of `dp[i - 1][j]` and `dp[i][j - 1]`.
//		   - **Return Length of LCS**:
//		     - Return `dp[m][n]`, which holds the length of the longest common subsequence.
//		
//		4. **End**: Completion of the LCS calculation and output.