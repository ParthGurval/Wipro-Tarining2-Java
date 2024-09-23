package pract.patternsearching;

public class RobinKarpSearch {
	
//	Purpose: Define constants for the algorithm.
//	Variables:
//	d (int): Number of possible characters in the input (e.g., ASCII characters).
//	q (int): A prime number used as the modulus for hash calculations.
	final static int d = 256;
	final static int q = 101;
	
//	Purpose: Method to search for pattern in text using the Rabin-Karp algorithm.
//	Variables:
//	pattern (String): The substring we are searching for.
//	text (String): The main text in which we are searching.
	void search(String pattern, String text) {
		
		int m = pattern.length(); // m (int): Length of the pattern.
		int n = text.length(); // n (int): Length of the text.
		int i, j;
		int p = 0; // p (int): Hash value of pattern.
		int t = 0; // t (int): Hash value of the current window of text.
		int h = 1; // h (int): Pre-computed value used for hash rolling.
		
		
		
//		Purpose: Calculate the value of h, which is used in the rolling hash.
//		Explanation: h is (d^(m-1)) % q and is used to remove the first character of the current window.
//		Purpose: To compute h as the multiplier for the rolling hash calculation.
//		Loop: Runs m - 1 times, where m is the length of the pattern.
//		The loop computes the value of h which will be used to adjust the hash value when sliding the window over the text.

		for(i = 0; i < m - 1; i++) {
			
//			Update h: Each iteration updates h by multiplying it by d and taking the result modulo q.
			h = (h * d) % q;
		}
		
//		Purpose: This loop calculates the hash values for the pattern and the initial window of text.
		for(i = 0; i < m; i++) {
			p = (d * p + pattern.charAt(i)) % q;  // Hash value of the pattern
//			Calculate Hash for Pattern:
//				p = (d * p + pattern.charAt(i)) % q;
//				d * p: This part shifts the current hash value p by multiplying it by d, effectively making room for the next character.
//				+ pattern.charAt(i): Add the numeric value of the current character in the pattern to the hash value.
//				% q: Take the result modulo q to keep the hash value within a manageable range.
			
			t = (d * t + text.charAt(i)) % q;     // Hash value of the first window of the text
//			Calculate Hash for Text Window:
//				t = (d * t + text.charAt(i)) % q;
//				d * t: Similarly, shift the current hash value t for the text window.
//				+ text.charAt(i): Add the numeric value of the current character in the text to the hash value.
//				% q: Take the result modulo q to keep the hash value within a manageable range.
		}
		
		// Slide the window over the text and compare hash values
		for(i = 0; i <= n - m; i++) {
			
			// If the hash values match, check the characters one by one
			if(p == t) {
				for(j = 0; j < m; j++) {
					
//					Purpose: To check if the current window in the text matches the pattern.
//					Condition: If a character in the text (at position i + j) does not match the corresponding character in the pattern (at position j).
					if(text.charAt(i + j) != pattern.charAt(j))
						break;  // Break if any character does not match
				}
				
				// If all characters match, print the index where the pattern is found
				if(j == m) {
					System.out.println("Pattern Found at index " + i);
				}
			}
			
			// Compute the hash value for the next window of the text
//			Purpose: To update the hash value for the next window in the text after sliding the window one position to the right.
//			Operation: Subtract the contribution of the character that is sliding out, then add the contribution of the new character coming into the window.
			if(i < n - m) {
				t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;  // Rolling hash calculation
				
				// Adjust hash value if it becomes negative
//				Purpose: To handle negative hash values that may result from the modulo operation.
//				Operation: If the hash value is negative, adjust it to a positive value by adding the modulus.
				if(t < 0) {
					t = (t + q);
				}
			}
		}
	}

	public static void main(String[] args) {
		// Main method to run the Rabin-Karp search with example texts and patterns

		RobinKarpSearch rbks = new RobinKarpSearch();  // Create an instance of RobinKarpSearch
		
		String txt1 = "AABAACAADAABAABA";  // Example text
		String pat1 = "AABA";              // Example pattern
		System.out.println("Example: 1");
		rbks.search(pat1, txt1);  // Search for the pattern in the text
		
		String txt2 = "life is a good life if life keeps life";  // Another example text
		String pat2 = "life";  // Another example pattern
		System.out.println("\nExample: 2");
		rbks.search(pat2, txt2);  // Search for the pattern in the text
	}

}


//		Here's a structured flowchart diagram for the `RobinKarpSearch` class, which implements the Rabin-Karp algorithm for string matching:
//		
//		```plaintext
//		(Start)
//		   |
//		   V
//		(Define `RobinKarpSearch` Class)
//		   |
//		   V
//		(Define Constants)
//		   - d (int): Number of possible characters (e.g., ASCII characters)
//		   - q (int): A prime number used for hash calculations
//		   |
//		   V
//		(Define `search(String pattern, String text)` Method)
//		   |
//		   V
//		   - Initialize variables:
//		     - m (int): Length of pattern
//		     - n (int): Length of text
//		     - p (int): Hash value of pattern
//		     - t (int): Hash value of current text window
//		     - h (int): Pre-computed value for hash rolling
//		   |
//		   V
//		   - Calculate the value of `h`:
//		     - Loop from 0 to m-2
//		     - Update `h` using `(h * d) % q`
//		   |
//		   V
//		   - Calculate hash values for pattern and initial text window:
//		     - For i = 0 to m-1:
//		       - Update `p` (hash of pattern) using `(d * p + pattern.charAt(i)) % q`
//		       - Update `t` (hash of text window) using `(d * t + text.charAt(i)) % q`
//		   |
//		   V
//		   - Slide the window over the text:
//		     - For i = 0 to n - m:
//		       - If `p == t` (hash match):
//		         - Check each character in the window:
//		           - If any character does not match, break
//		         - If all characters match, print "Pattern Found at index " + i
//		       - Compute the hash value for the next window:
//		         - Update `t` using rolling hash calculation:
//		           - `t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q`
//		         - If `t < 0`, adjust `t` to be positive by adding `q`
//		   |
//		   V
//		(Define `main(String[] args)` Method)
//		   |
//		   V
//		   - Create an instance of `RobinKarpSearch`
//		   - Example 1:
//		     - Define `txt1` and `pat1`
//		     - Call `search(pat1, txt1)`
//		   - Example 2:
//		     - Define `txt2` and `pat2`
//		     - Call `search(pat2, txt2)`
//		   |
//		   V
//		(End)
//		```
//		
//		### Explanation of Each Step:
//		
//		1. **Start**: Begin the execution of the program.
//		
//		2. **Define `RobinKarpSearch` Class**: The class encapsulates the Rabin-Karp algorithm for pattern searching in text.
//		
//		3. **Define Constants**:
//		   - **d**: Number of possible characters (e.g., ASCII set size).
//		   - **q**: A prime number used to compute hash values.
//		
//		4. **Define `search(String pattern, String text)` Method**:
//		   - **Initialize Variables**: Set lengths for pattern (`m`) and text (`n`), and initialize hash values (`p` for pattern and `t` for text window), and compute `h` for rolling hash.
//		   - **Calculate `h`**: Compute the multiplier for the rolling hash by iterating from 0 to `m-2`.
//		   - **Calculate Hash Values**: Compute initial hash values for the pattern and the first window of the text.
//		   - **Slide the Window**:
//		     - Compare hash values (`p` and `t`). If they match, verify the actual substring.
//		     - Update hash value for the next window using rolling hash technique and adjust if negative.
//		
//		5. **Define `main(String[] args)` Method**:
//		   - **Create Instance**: Instantiate `RobinKarpSearch`.
//		   - **Example 1**: Search for pattern "AABA" in the text "AABAACAADAABAABA".
//		   - **Example 2**: Search for pattern "life" in the text "life is a good life if life keeps life".
//		
//		6. **End**: Completion of the program execution and output.
//		
//		This flowchart outlines the Rabin-Karp algorithm's process of searching for a pattern in a text using hashing and rolling hash techniques.