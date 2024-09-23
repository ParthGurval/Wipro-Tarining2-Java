package pract.patternsearching;

public class NaiveStringMatch {

//	Purpose: This method searches for occurrences of pattern within text.
//	Variables:
//	text (String): The main text where we are searching.
//	pattern (String): The substring we are looking for in text.
	void search(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();
//		Purpose: Initialize the lengths of text and pattern.
//		Variables:
//		n (int): Length of text.
//		m (int): Length of pattern.
		
//		Purpose: Loop through text to check each possible starting position for pattern.
//		Variables:
//		i (int): Starting index in text from which to compare pattern.
		for(int i = 0; i <= n - m; i++) {
			
			int j;
//			Purpose: Declare a variable for iterating through characters in pattern.
//			Variables:
//			j (int): Index for traversing pattern.
			
			
//			Purpose: Compare characters of text and pattern starting from index i.
//			Variables:
//			j (int): Index for traversing pattern and checking against text.
			for(j = 0; j < m; j++) {
				
				
//				Purpose: Check if characters match. If not, exit the inner loop.
//				Explanation:
//				text.charAt(i + j) retrieves the character at position i + j in text.
//				pattern.charAt(j) retrieves the character at position j in pattern.
//				If they do not match, break exits the inner loop.
				if(text.charAt(i + j) != pattern.charAt(j)) {
					
					break;
				}
			}
			
//			Purpose: If all characters in pattern have been matched (j == m), print the starting index i.
//			Explanation: j == m means pattern matches a substring in text starting at index i.
			if(j == m) {
				
				System.out.println("Pattern Found at Index "+ i);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Purpose: Create an instance of NaiveStringMatch to call the search method.
		NaiveStringMatch nsm = new NaiveStringMatch();
		
//		Purpose: Test the search method with txt1 and pat1. Print the results.
		String txt1 = "AABAACAADAABAABA";
		String pat1 = "AABA";
		System.out.println("Example: 1");
		nsm.search(txt1, pat1);
		
//		Purpose: Test the search method with txt2 and pat2. Print the results.
		String txt2 = "agd";
		String pat2 = "g";
		System.out.println("\nExample: 2");
		nsm.search(txt2, pat2);
	}

}

//		Here's a structured flowchart diagram for the `NaiveStringMatch` class, which implements the naive string matching algorithm:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `NaiveStringMatch` Class)
//		   |
//		   V
//		(Define `search(String text, String pattern)` Method)
//		   |
//		   V
//		   - Initialize `n` and `m` for lengths of text and pattern
//		   - For `i = 0` to `n - m`:
//		     - Initialize `j` for pattern traversal
//		     - For `j = 0` to `m`:
//		       - If `text[i + j] != pattern[j]`:
//		         - Break the inner loop (mismatch)
//		     - If `j == m` (Pattern matches):
//		       - Print "Pattern Found at Index " + `i`
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create an instance of `NaiveStringMatch`
//		   - Example 1:
//		     - Define `txt1` and `pat1`
//		     - Call `search(txt1, pat1)`
//		   - Example 2:
//		     - Define `txt2` and `pat2`
//		     - Call `search(txt2, pat2)`
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `NaiveStringMatch` Class**: The class encapsulates the naive string matching algorithm.
//		
//		3. **Define `search(String text, String pattern)` Method**:
//		   - **Initialize Variables**: Set lengths of text (`n`) and pattern (`m`).
//		   - **Outer Loop (i)**: Loop through each possible starting position in the text where the pattern could match.
//		     - **Inner Loop (j)**: Traverse the pattern and compare it with the substring of text starting at index `i`.
//		       - **Mismatch Check**: If characters do not match, break the inner loop.
//		     - **Pattern Found Check**: If all characters of the pattern match (i.e., `j == m`), print the starting index where the pattern is found.
//		
//		4. **Define `main(String[] args)` Method**:
//		   - **Create Instance**: Instantiate `NaiveStringMatch`.
//		   - **Example 1**: Search for the pattern "AABA" in the text "AABAACAADAABAABA".
//		   - **Example 2**: Search for the pattern "g" in the text "agd".
//		
//		5. **End**: Completion of the program execution and output.
//		
//		This flowchart captures the steps involved in implementing and using the naive string matching algorithm, including searching through text and printing the results for different examples.