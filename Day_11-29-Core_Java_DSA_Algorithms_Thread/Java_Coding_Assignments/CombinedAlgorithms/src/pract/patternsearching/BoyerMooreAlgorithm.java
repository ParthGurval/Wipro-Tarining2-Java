package pract.patternsearching;

import java.util.*;

public class BoyerMooreAlgorithm {

    // Purpose: Preprocesses the pattern to create the bad character heuristic table
	// Arguments:
    // - pattern: The pattern string converted to a char array.
    // - m: The length of the pattern.
    // - badChar: An array to store the last occurrence of each character in the pattern.
    private void badCharHeuristic(char[] pattern, int m, int[] badChar) {
    	
        // Purpose: Initialize all entries in the badChar array to -1
        Arrays.fill(badChar, -1);
//        The fill method in Java's Arrays class sets all elements of a specified array to a given value. 
//        It's commonly used to initialize or reset arrays to a default value.
        
       // This is part of the Boyer-Moore algorithm's "bad character heuristic," which helps in efficiently skipping sections of the text that don't match the pattern.
        // Purpose: Fill the badChar array with the last occurrence of each character in the pattern
        for (int i = 0; i < m; i++) {
            badChar[(int) pattern[i]] = i;  // Purpose: Store the index of the last occurrence of the character in the pattern
//       1.     (int) pattern[i]: Converts the character at position i in the pattern array to its corresponding ASCII integer value.
//       2.     badChar[...]: This array stores the index of the last occurrence of each character in the pattern. The position in the badChar array corresponds 
//            to the ASCII value of the character.
//       3.     = i: Assigns the index i (the current position of the character in the pattern array) to the corresponding position in the badChar array.
            
        }
    }

    // Purpose: Preprocesses the pattern to create the suffix and prefix arrays for the good suffix heuristic
 // Arguments:
    // - pattern: The pattern string converted to a char array.
    // - m: The length of the pattern.
    // - suffix: An array to store the last occurrence of a suffix in the pattern.
    // - prefix: A boolean array to indicate if a prefix matches a suffix in the pattern.
    private void preprocessGoodSuffix(char[] pattern, int m, int[] suffix, boolean[] prefix) {
        // Purpose: Initialize all entries in the suffix array to -1 and prefix array to false
        for (int i = 0; i < m; i++) {
            suffix[i] = -1;
            prefix[i] = false;        
//            suffix[i] = -1;: Initializes each element of the suffix array to -1, indicating that no suffix matches have been found yet.
//            prefix[i] = false;: Initializes each element of the prefix array to false, meaning no proper prefix that matches a suffix has been identified yet.
        }

        // Purpose: Preprocess the pattern to fill the suffix and prefix arrays
        for (int i = 0; i < m - 1; i++) {
            int j = i;  // Purpose: Start from the current index of the pattern
            int k = 0;  // Purpose: Initialize a variable to track the length of the matching suffix
            
            // Purpose: While characters in pattern match from the end, update suffix and prefix arrays
            while (j >= 0 && pattern[j] == pattern[m - 1 - k]) {
//            	j >= 0: Ensures the loop continues as long as j is a valid index within the pattern array, meaning it hasn't moved out of bounds to the left.
//
//            	pattern[j] == pattern[m - 1 - k]: Compares the character at the current index j of the pattern with the character at the index m - 1 - k, 
//            	where m - 1 is the last index of the pattern, and k is the current offset. 
//            	This checks if the current character from the beginning of the pattern matches the corresponding character from the end, 
//            	moving towards the middle as j decreases and k increases.
            	
                j--;
                k++;
//                j--;: This decreases the value of j by 1, moving the index j one position to the left in the pattern. 
//                It effectively checks the previous character in the pattern in the next iteration.
//
//                k++;: This increases the value of k by 1, moving the index k one position to the right. 
//                It tracks how many characters have matched between the current portion of the pattern and the suffix being checked.
                

                // Purpose: Update suffix array with the position of the matching suffix
                if (k < m) {
                    suffix[k] = j + 1;
                }
//                The line if(suffix[k] != -1) { return j - suffix[k] + 1; } checks if a suffix of length k has been found; if so, 
//                it calculates the shift value based on this suffix. If no such suffix is found, return j - suffix[k] + 1; 
//                provides a default shift based on the suffix array.
                
            }

            // Purpose: If a prefix of the pattern matches a suffix, update the prefix array
//            Purpose: Check if the pattern’s suffix of length k is also a prefix.
//            Explanation: If j is -1, it means the entire suffix of length k matches a prefix of the pattern, so mark prefix[k] as true.
            if (j == -1) {
                prefix[k] = true;
            }
        }
    }

    // Purpose: Calculate the shift using the good suffix heuristic
    private int goodSuffixShift(int j, int m, int[] suffix, boolean[] prefix) {
        int k = m - 1 - j;  // Purpose: Calculate the length of the matching suffix
        
        // Purpose: If the matching suffix length is greater than or equal to the pattern length, return the pattern length
        if (k >= m) {
            return m;
        }
        
        // Purpose: If there's a valid suffix, return the shift
//      Purpose: Check if there's a valid suffix of length k ending at suffix[k].
//      Explanation: If suffix[k] is not -1, return the shift calculated by j - suffix[k] + 1, aligning the pattern with the previously found suffix.
        if (suffix[k] != -1) {
            return j - suffix[k] + 1;
        }
        
        // Purpose: Check if any prefix of the pattern matches a suffix and return the shift
//        Purpose: Find the longest prefix of the pattern that matches a suffix of the current substring.
//        Explanation: Iterate over possible prefix lengths and return the first one that matches the suffix, allowing for efficient pattern alignment.
        for (int r = j + 2; r <= m - 1; r++) {
            if (prefix[m - r]) {
//            	prefix[m - r] accesses the boolean array prefix to see if the prefix of length m - r exists. If prefix[m - r] is true, 
//            	it means a suffix of length m - r matches a prefix of the pattern.
            	
                return r;
            }
        }

        // Purpose: If no good suffix shift is found, return the pattern length
        return m;
    }

    // Purpose: The main search function that uses the Boyer-Moore algorithm to find the pattern in the text
    public void search(String text, String pattern) {
        char[] txt = text.toCharArray();  // Purpose: Convert the text string into a character array
        char[] pat = pattern.toCharArray();  // Purpose: Convert the pattern string into a character array
        int n = txt.length;  // Purpose: Get the length of the text
        int m = pat.length;  // Purpose: Get the length of the pattern
        
        int[] badChar = new int[256];  // Purpose: Create an array to store the bad character heuristic (size 256 for all ASCII characters)
        int[] suffix = new int[m];  // Purpose: Create an array to store the good suffix heuristic
        boolean[] prefix = new boolean[m];  // Purpose: Create an array to store the prefix matches

        // Purpose: Preprocess the pattern using the bad character heuristic
        badCharHeuristic(pat, m, badChar);
        // Purpose: Preprocess the pattern using the good suffix heuristic
        preprocessGoodSuffix(pat, m, suffix, prefix);
        
        int shift = 0;  // Purpose: Initialize the shift for pattern alignment
        
        // Purpose: Search through the text until the pattern has been fully checked
        while (shift <= (n - m)) {
            int j = m - 1;  // Purpose: Start from the last character of the pattern
            
            // Purpose: Compare the pattern with the text starting from the end
            while (j >= 0 && pat[j] == txt[shift + j]) {
                j--;  // Purpose: Move left if the characters match
            }

            // Purpose: If the pattern matches the text at the current shift
            if (j < 0) {
                System.out.println("Pattern found at index " + shift);  // Purpose: Print the index where the pattern is found
                
                // Purpose: Shift the pattern using the good suffix shift heuristic
                shift += goodSuffixShift(0, m, suffix, prefix);
            } else {
                // Purpose: Calculate the shift using the bad character and good suffix heuristics
                int badCharShift = j - badChar[txt[shift + j]];
                int goodSuffixShift = goodSuffixShift(j, m, suffix, prefix);
                
                // Purpose: Shift the pattern by the maximum value of the two heuristics
                shift += Math.max(badCharShift, goodSuffixShift);
            }
        }
    }

    public static void main(String[] args) {
        // Purpose: Create an instance of the BoyerMooreAlgorithm class
        BoyerMooreAlgorithm bm = new BoyerMooreAlgorithm();
        
        // Example 1: Searching for the pattern "AABA" in the text "AABAACAADAABAABA"
        String txt1 = "AABAACAADAABAABA";
        String pat1 = "AABA";
        System.out.println("Example: 1");
        bm.search(txt1, pat1);
        
        // Example 2: Searching for the pattern "life" in the text "life is a good life if life keeps life"
        String txt2 = "life is a good life if life keeps life";
        String pat2 = "life";
        System.out.println("\nExample: 2");
        bm.search(txt2, pat2);
    }

}


//		Here's a structured flowchart diagram for the `BoyerMooreAlgorithm` class, which implements the Boyer-Moore string matching algorithm:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `BoyerMooreAlgorithm` Class)
//		   |
//		   V
//		   (Define `badCharHeuristic(char[] pattern, int m, int[] badChar)` Method)
//		   |
//		   V
//		   - Purpose: Initialize `badChar` array
//		   - Fill `badChar` with -1
//		   - Loop through `pattern`:
//		     - Update `badChar` with the last occurrence of each character
//		   |
//		   V
//		   (Define `preprocessGoodSuffix(char[] pattern, int m, int[] suffix, boolean[] prefix)` Method)
//		   |
//		   V
//		   - Purpose: Initialize `suffix` and `prefix` arrays
//		   - Loop through `pattern`:
//		     - Find and update suffix and prefix arrays based on matching suffixes
//		   |
//		   V
//		   (Define `goodSuffixShift(int j, int m, int[] suffix, boolean[] prefix)` Method)
//		   |
//		   V
//		   - Purpose: Calculate the shift for good suffix heuristic
//		   - Check suffix length and update shift based on suffix and prefix arrays
//		   |
//		   V
//		   (Define `search(String text, String pattern)` Method)
//		   |
//		   V
//		   - Convert `text` and `pattern` to char arrays
//		   - Initialize `badChar`, `suffix`, and `prefix` arrays
//		   - Preprocess pattern using `badCharHeuristic` and `preprocessGoodSuffix`
//		   - Initialize `shift` for pattern alignment
//		   - Loop through `text`:
//		     - Compare `pattern` with `text` from end
//		     - If pattern matches:
//		       - Print the index where pattern is found
//		       - Update shift using `goodSuffixShift`
//		     - Else:
//		       - Calculate shift using bad character and good suffix heuristics
//		       - Shift pattern by the maximum value
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create an instance of `BoyerMooreAlgorithm`
//		   - Example 1:
//		     - Search for pattern "AABA" in text "AABAACAADAABAABA"
//		   - Example 2:
//		     - Search for pattern "life" in text "life is a good life if life keeps life"
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `BoyerMooreAlgorithm` Class**: The class encapsulates the Boyer-Moore algorithm implementation.
//		
//		3. **Define `badCharHeuristic(char[] pattern, int m, int[] badChar)` Method**:
//		   - **Purpose**: Initialize `badChar` array to -1.
//		   - **Loop through `pattern`**:
//		     - Update `badChar` with the index of the last occurrence of each character.
//		
//		4. **Define `preprocessGoodSuffix(char[] pattern, int m, int[] suffix, boolean[] prefix)` Method**:
//		   - **Purpose**: Initialize `suffix` and `prefix` arrays.
//		   - **Loop through `pattern`**:
//		     - Update `suffix` and `prefix` based on matching suffixes and prefixes.
//		
//		5. **Define `goodSuffixShift(int j, int m, int[] suffix, boolean[] prefix)` Method**:
//		   - **Purpose**: Calculate the shift for good suffix heuristic.
//		   - **Check suffix length and update shift**:
//		     - Return the shift value based on suffix and prefix arrays.
//		
//		6. **Define `search(String text, String pattern)` Method**:
//		   - **Convert `text` and `pattern` to char arrays**.
//		   - **Initialize `badChar`, `suffix`, and `prefix` arrays**.
//		   - **Preprocess Pattern**:
//		     - Use `badCharHeuristic` and `preprocessGoodSuffix`.
//		   - **Initialize `shift`**.
//		   - **Loop through `text`**:
//		     - **Compare Pattern**:
//		       - If pattern matches, print the index and update shift.
//		       - If not, calculate the shift using heuristics and adjust pattern position.
//		
//		7. **Define `main(String[] args)` Method**:
//		   - **Create an instance of `BoyerMooreAlgorithm`**.
//		   - **Example 1**: Search for the pattern "AABA" in the text "AABAACAADAABAABA".
//		   - **Example 2**: Search for the pattern "life" in the text "life is a good life if life keeps life".
//		
//		8. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the steps involved in implementing and using the Boyer-Moore string matching algorithm, including preprocessing for bad character and good suffix heuristics and performing the search operation.