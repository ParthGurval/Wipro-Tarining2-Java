package pract.backtracking;


//The goal of the N-Queen problem is to place n queens on an n x n chessboard such that no two queens threaten each other.

public class NQueen {
	
//	final int n = 4;: This defines the size of the chessboard (n x n). The final keyword means that n is a constant and cannot be changed once initialized.	
	final int n = 4;
	
//	Method: printSoln(int board[][])
//	Purpose: This method prints the current configuration of the chessboard.
//	Parameters: It takes a 2D array board representing the chessboard.
//	Logic: It iterates through the board and prints each element, with \t used to separate elements in a row, making the output easier to read.
	void printSoln(int board[][]) {
		
		for(int x  = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
				System.out.print(board[x][y] + "\t");
			}
			
			System.out.println();
		}
	}

//	Purpose: This method checks whether it's safe to place a queen at position (row, col) on the chessboard.
	boolean isSafe(int board[][], int row, int col) {
		
		int i, j;
		
//		It checks three directions:



//		The left side of the current row.
		for(i = 0; i < col; i++) {
			
//			If any of these positions already have a queen (board[i][j] == 1), it's not safe to place another queen, and the method returns false.	
			if(board[row][i] == 1) {
				
				return false;
			}
		}
		
//		The upper left diagonal.
		for(i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			
//			If any of these positions already have a queen (board[i][j] == 1), it's not safe to place another queen, and the method returns false.	
			if(board[i][j] == 1) {
				
				return false;
			}
		}
		
//		The lower left diagonal.
		for(i = row, j = col; j >= 0 && i < n; i++, j--) {
			
//			If any of these positions already have a queen (board[i][j] == 1), it's not safe to place another queen, and the method returns false.	
			if(board[i][j] == 1) {
				
				return false;
			}
		}
		
//		If all checks pass, the method returns true, indicating that the position is safe.
		return true;
	}
	
//	Purpose: This is the main recursive method to solve the N-Queen problem using backtracking.
//	Parameters: It takes the current state of the board and the column where the next queen needs to be placed.
	boolean fnlNQUtil(int board[][], int col) {
		
//		Base Case: If all columns are filled (col >= n), it returns true, indicating that a solution has been found.
		if(col >= n) {
			
			return true;
		}
		
//		Recursive Case: For each row in the current column:
		for(int i = 0; i < n; i++) {
			
//			It checks if placing a queen is safe using the isSafe method.
			if(isSafe(board, i, col)) {
				
//				If safe, it places a queen (board[i][col] = 1).
				board[i][col] = 1;
				
//				It then recursively calls itself to place the next queen in the next column.
				if(fnlNQUtil(board, col + 1)) {
					
					return true;
				}
				
//				If placing the next queen fails, it backtracks by removing the queen (board[i][col] = 0).
				board[i][col] = 0; //backtracking
			}
		}
		
//		If no placement works, it returns false.
		return false;
	}
	
//	Purpose: This method sets up the board and initiates the backtracking process.
	boolean resultNQ() {
		
//		It initializes the board as a n x n grid filled with zeros.
		int board[][] = new int[n][n];
		
//		It calls fnlNQUtil to start placing queens from the first column.
		if(!fnlNQUtil(board, 0)) {
			
//			If no solution exists, it prints a message; otherwise 
			System.out.println("Solution does not exist");
			return false;
		}
		
//		it prints the solution.
		printSoln(board);
		return true;
	}
	
//	Purpose: The entry point of the program.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		It creates an instance of the NQueen class.
		NQueen Queen = new NQueen();
		
//		It calls resultNQ() to find and print a solution for the N-Queen problem.
		Queen.resultNQ();
	}

}

	//This code solves the N-Queen problem using backtracking.
	//It places queens one by one in different columns, ensuring that no two queens can attack each other.
	//If it finds a valid placement for all queens, it prints the solution; otherwise, it backtracks and tries a different arrangement.


//		Here's a diagram outlining the flow of the `NQueen` class from your code. It captures the step-by-step process for solving the N-Queen problem using backtracking:
//		
//		(Start)
//		   |
//		   V
//		(Initialize the chessboard: Create an n x n board filled with zeros)
//		   |
//		   V
//		(Call resultNQ to start solving the N-Queen problem)
//		   |
//		   V
//		(Inside resultNQ:
//		   |
//		   V
//		   (Call fnlNQUtil to place queens starting from the first column (col = 0))
//		      |
//		      V
//		      (Inside fnlNQUtil:
//		         |
//		         V
//		         (Check if all columns are filled (col >= n))
//		            |
//		            V
//		            (If true, return true indicating a solution has been found)
//		            |
//		            V
//		         (For each row in the current column:
//		            |
//		            V
//		            (Check if placing a queen at (row, col) is safe using isSafe)
//		               |
//		               V
//		               (If safe, place a queen (board[row][col] = 1))
//		                  |
//		                  V
//		                  (Recursively call fnlNQUtil to place the next queen in the next column)
//		                     |
//		                     V
//		                     (If the recursive call returns true, return true indicating success)
//		                     |
//		                     V
//		                  (If not successful, remove the queen (board[row][col] = 0) and backtrack)
//		            |
//		            V
//		         (If no row placement works, return false indicating failure))
//		   |
//		   V
//		(If fnlNQUtil returns true, print the solution matrix using printSoln)
//		   |
//		   V
//		(Print "Solution does not exist" if fnlNQUtil returns false)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize the Chessboard**: 
//		   - Create an `n x n` chessboard initialized with zeros.
//		3. **Call resultNQ**: 
//		   - Start solving the N-Queen problem by calling `resultNQ()`.
//		4. **Inside resultNQ**:
//		   - **Call fnlNQUtil**: Begin placing queens from the first column (column index 0).
//		5. **Inside fnlNQUtil**:
//		   - **Check Completion**: If all columns are filled (i.e., `col >= n`), return `true`, indicating a solution has been found.
//		   - **For Each Row in Column**:
//		     - **Check Safety**: Verify if placing a queen at the current position (row, col) is safe using the `isSafe` method.
//		       - **If Safe**: Place the queen on the board and make a recursive call to try placing the next queen in the next column.
//		         - **If Recursive Call Succeeds**: Return `true` indicating a solution has been found.
//		         - **If Recursive Call Fails**: Remove the queen from the current position and backtrack.
//		   - **If No Placement Works**: Return `false`, indicating that no solution is possible from the current configuration.
//		6. **Print Solution**:
//		   - **If Solution Found**: Print the board configuration showing the placement of queens.
//		   - **If No Solution**: Print "Solution does not exist."
//		7. **End**: Finish the execution of the program.
//		
//		This diagram outlines the logical flow and purpose of each section in solving the N-Queen problem using backtracking.
