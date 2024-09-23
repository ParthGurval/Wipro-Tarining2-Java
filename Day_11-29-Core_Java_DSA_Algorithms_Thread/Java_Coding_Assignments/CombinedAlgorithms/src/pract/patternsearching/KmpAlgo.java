package pract.patternsearching;

public class KmpAlgo {

    // Purpose: Function to search for a pattern in the given text using the KMP algorithm
    // Parameters:
    //   - String pattern: The pattern to search for
    //   - String text: The text in which to search
    void KMPSearch(String pattern, String text) {
        
        int m = pattern.length();  // Explanation: Length of the pattern
        int n = text.length();     // Explanation: Length of the text
        
        int[] lps = new int[m];    // Explanation: Array to store the longest prefix suffix values
        int j = 0;                 // Explanation: Index for the pattern
        
        compLpsArray(pattern, m, lps); // Explanation: Compute the LPS (Longest Prefix Suffix) array
        
        int i = 0;  // Explanation: Index for the text
        while (i < n) {  // Explanation: Iterate through the text
            
//        	Purpose: This condition compares the character at position j in the pattern with the character at position i in the text.
//        	Explanation: charAt(j) retrieves the character at index j from the pattern, and charAt(i) retrieves the character at index i from the text. 
//        	If these characters are the same, the condition evaluates to true.
            if (pattern.charAt(j) == text.charAt(i)) {  // Explanation: Match characters of pattern and text
                j++; // Purpose: Move to the next character in the pattern.
                i++; // Move to the next character in the text.
            }
            
            if (j == m) {  // Explanation: Pattern is found
                System.out.println("Pattern Found at Index: " + (i - j));  // Explanation: Print the index where pattern is found
                j = lps[j - 1];  // Explanation: Use LPS array to avoid unnecessary comparisons
            } 
            else if (i < n && pattern.charAt(j) != text.charAt(i)) {  // Explanation: Mismatch after some matches
                if (j != 0) {  // Explanation: If some characters of pattern matched
                    j = lps[j - 1];  // Explanation: Use LPS array to skip matched characters
                } else {
                    i++;  // Explanation: Move to next character in text
                }
            }
        }
    }

    // Purpose: Function to compute the LPS array for the pattern
    // Parameters:
    //   - String pattern: The pattern to preprocess
    //   - int m: Length of the pattern
    //   - int[] lps: Array to store the LPS values
    void compLpsArray(String pattern, int m, int[] lps) {
        
        int len = 0;  // Explanation: Length of the previous longest prefix suffix
        int i = 1;    // Explanation: Index for the pattern
        
        lps[0] = 0;   // Explanation: LPS value for the first character is always 0
        
        while (i < m) {  // Explanation: Iterate through the pattern
            
            if (pattern.charAt(i) == pattern.charAt(len)) {  // Explanation: Characters match
                len++;
                lps[i] = len;  // Explanation: Update LPS array with new length
                i++;
            } else {
                if (len != 0) {  // Explanation: Mismatch after some matches
                    len = lps[len - 1];  // Explanation: Use LPS array to skip matched prefix
                } else {
                    lps[i] = 0;  // Explanation: No matching prefix, set LPS to 0
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Purpose: Main method to demonstrate KMP algorithm
        
        KmpAlgo kmpa = new KmpAlgo();  // Explanation: Create an instance of KmpAlgo
        
        // Example 1
        String txt1 = "AABAACAADAABAABA";  // Explanation: Text to search in
        String pat1 = "AABA";              // Explanation: Pattern to search for
        System.out.println("Example: 1");  // Explanation: Print example number
        kmpa.KMPSearch(pat1, txt1);       // Explanation: Call KMPSearch to find the pattern in the text
        
        // Example 2
        String txt2 = "when life gets blurry adjust focus of life";  // Explanation: Text to search in
        String pat2 = "life";  // Explanation: Pattern to search for
        System.out.println("\nExample: 2");  // Explanation: Print example number
        kmpa.KMPSearch(pat2, txt2);  // Explanation: Call KMPSearch to find the pattern in the text
    }
}


//		Here's a structured flowchart diagram for the `KmpAlgo` class, which implements the Knuth-Morris-Pratt (KMP) string matching algorithm:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `KmpAlgo` Class)
//		   |
//		   V
//		(Define `KMPSearch(String pattern, String text)` Method)
//		   |
//		   V
//		   - Initialize `m`, `n`, `lps`, `j`, `i`
//		   - Call `compLpsArray(pattern, m, lps)` to compute LPS array
//		   - While `i < n`:
//		     - If `pattern[j] == text[i]`:
//		       - Increment `j` and `i`
//		       - If `j == m`:
//		         - Print "Pattern Found at Index: (i - j)"
//		         - Set `j` to `lps[j - 1]`
//		     - Else if `i < n && pattern[j] != text[i]`:
//		       - If `j != 0`:
//		         - Set `j` to `lps[j - 1]`
//		       - Else:
//		         - Increment `i`
//		   |
//		   V
//		(Define `compLpsArray(String pattern, int m, int[] lps)` Method)
//		   |
//		   V
//		   - Initialize `len`, `i`
//		   - Set `lps[0] = 0`
//		   - While `i < m`:
//		     - If `pattern[i] == pattern[len]`:
//		       - Increment `len` and set `lps[i] = len`
//		       - Increment `i`
//		     - Else:
//		       - If `len != 0`:
//		         - Set `len` to `lps[len - 1]`
//		       - Else:
//		         - Set `lps[i] = 0`
//		         - Increment `i`
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create an instance of `KmpAlgo`
//		   - Example 1:
//		     - Define `txt1` and `pat1`
//		     - Call `KMPSearch(pat1, txt1)`
//		   - Example 2:
//		     - Define `txt2` and `pat2`
//		     - Call `KMPSearch(pat2, txt2)`
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `KmpAlgo` Class**: The class encapsulates the KMP algorithm implementation.
//		
//		3. **Define `KMPSearch(String pattern, String text)` Method**:
//		   - **Initialize Variables**: Set lengths of the pattern and text, and initialize the LPS array.
//		   - **Compute LPS Array**: Call `compLpsArray` to get the LPS values.
//		   - **Search Pattern in Text**:
//		     - **Match Characters**: Compare characters from pattern and text, updating indices and printing results as needed.
//		     - **Mismatch Handling**: Use LPS array to avoid unnecessary comparisons.
//		
//		4. **Define `compLpsArray(String pattern, int m, int[] lps)` Method**:
//		   - **Initialize LPS Values**: Set up the LPS array by iterating through the pattern and updating the values based on matches.
//		
//		5. **Define `main(String[] args)` Method**:
//		   - **Create Instance**: Instantiate `KmpAlgo`.
//		   - **Example 1**: Search for the pattern "AABA" in the text "AABAACAADAABAABA".
//		   - **Example 2**: Search for the pattern "life" in the text "when life gets blurry adjust focus of life".
//		
//		6. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the steps involved in implementing and using the KMP string matching algorithm, including preprocessing for the LPS array and performing the search operation.