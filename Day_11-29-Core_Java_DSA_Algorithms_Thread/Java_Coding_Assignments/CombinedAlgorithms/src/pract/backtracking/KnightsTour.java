package pract.backtracking;

public class KnightsTour {
	
//	Class-Level Variable Declaration
//	n: The size of the chessboard (8x8). Declared as static final meaning it's a constant that doesn't change and is shared among all instances of the class.
	static final int  n = 8;
	
//	Checks if the move to position (x, y) is within the board boundaries and hasn't been visited yet.
	static boolean isSafe(int x, int y, int[][] sol) {
		
//		Returns: true if the move is safe, otherwise false.
		return( x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
	}
	
//	Purpose: Prints the board, showing the order in which the knight visited each square.
	static void printSoln(int[][] sol) {
		
		for(int x  = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
//				\t: Adds a tab space between numbers for better formatting.
				System.out.print(sol[x][y] + "\t");
			}
			
			System.out.println();
		}
	}
	
//	Purpose: This is the recursive backtracking function that tries to solve the Knight’s Tour problem.
//	Parameters:
//		x, y: Current coordinates of the knight.
//		move: The move number, starting from 1 up to n*n.
//		sol: The solution matrix.
//		xMove, yMove: Arrays defining the possible moves for a knight.
	static boolean KTUtil(int x, int y, int move, int[][] sol, int[] xMove, int[] yMove) {
		
//		Purpose: To store the next potential position of the knight.
		int next_x, next_y;
		
//		Purpose: If the knight has made n*n moves (covering the entire board), return true indicating success.
		if(move == n * n) {
			
			return true;
		}
		
//		Purpose: Iterate through all 8 possible knight moves
		for(int k = 0; k < 8; k++) {
			
//			Calculate next_x and next_y: New position based on the current move direction.
			next_x = x + xMove[k];
			next_y = y + yMove[k];
			
//			Purpose: Check if the new position (next_x, next_y) is within the board and not yet visited.
			if(isSafe(next_x, next_y, sol)) {
				
//				Purpose: Mark the new position with the current move number.
				sol[next_x][next_y] = move;
				
//				Purpose: Recursively attempt to solve from the new position. If successful, return true
				if(KTUtil(next_x, next_y, move + 1, sol, xMove, yMove)) {
					
					return true;
				}
				
				else {
					
//					If moving to (next_x, next_y) does not lead to a solution, reset the position to -1 and try the next move.
					sol[next_x][next_y] = -1;
				}
			}
		}
		
//		If none of the moves lead to a solution, return false indicating failure to find a valid path.
		return false;
	}
	
//	Initializes the board and attempts to solve the Knight's Tour starting from the top-left corner.
	static boolean fnlknightTour() {
		
//		sol: Initializes the board with -1 indicating unvisited squares.
		int[][] sol = new int[n][n];
		
		for(int x = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
				sol[x][y] = -1;
			}
		}
		
//		xMove, yMove: Arrays representing all possible knight moves.
//		Represents changes in the x-coordinate. like 2 means move 2 steps right. -> 1 means move 1 step right. -> -1 means move 1 step left. likewise
		int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
		
//		yMove: Represents changes in the y-coordinate. 1 means move 1 step up. -> 2 means move 2 steps up. -> -1 means move 1 step down. likewise
		int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
//		Reason for These Values: These represent the 8 possible moves of a knight in chess, combining these x and y changes will 
//		move the knight in all possible directions on the board.
		
		
		
//		sol[0][0] = 0: Marks the starting position.
		sol[0][0] = 0;
		
//		Purpose: Call the KTUtil method to start the knight's tour from position (0,0) with move 1. If no solution is found, print a message and return false.
		if(!KTUtil(0, 0, 1, sol, xMove, yMove)) {
			
			System.out.println("Solution does not exist");
			return false;
		}
		
//		Purpose: If a solution is found, print the solution matrix using printSoln and return true.
		else {
			
			printSoln(sol);
		}
		
//		Returns: true if a solution is found, otherwise false.
		return true;
	}

//	Purpose: Entry point of the program. Calls fnlknightTour to start solving the problem.
	public static void main(String[] args) {
		
		fnlknightTour();
	}
}




//		Here's a diagram outlining the flow of the `KnightsTour` class from your code. It represents the step-by-step process for solving the Knight’s Tour problem using backtracking:
//		
//		(Start)
//		   |
//		   V
//		(Initialize Board and Moves)
//		   |
//		   V
//		(Set initial position of the knight:
//		   sol[0][0] = 0)
//		   |
//		   V
//		(Call KTUtil to start the Knight's Tour from (0, 0) with move 1)
//		   |
//		   V
//		(Inside KTUtil:
//		   |
//		   V
//		   (Check if move == n * n)
//		      |
//		      V
//		      (If true, return true)
//		      |
//		      V
//		   (For each of the 8 possible knight moves:
//		      |
//		      V
//		      (Calculate next_x and next_y)
//		      |
//		      V
//		      (Check if (next_x, next_y) is safe)
//		         |
//		         V
//		         (If safe, mark sol[next_x][next_y] = move)
//		         |
//		         V
//		         (Call KTUtil recursively from (next_x, next_y))
//		            |
//		            V
//		            (If recursive call returns true, return true)
//		            |
//		            V
//		            (If not successful, reset sol[next_x][next_y] to -1)
//		      |
//		      V
//		   (If none of the moves lead to a solution, return false))
//		   |
//		   V
//		(If KTUtil returns true, print the solution matrix using printSoln)
//		   |
//		   V
//		(Print "Solution does not exist" if KTUtil returns false)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Board and Moves**: 
//		   - Create an 8x8 chessboard initialized with -1.
//		   - Define possible moves for the knight using `xMove` and `yMove` arrays.
//		3. **Set Initial Position**: 
//		   - Set the starting position of the knight at `(0, 0)` with move `0`.
//		4. **Call KTUtil**: 
//		   - Start the knight’s tour from position `(0, 0)` with move number `1`.
//		5. **Inside KTUtil**:
//		   - **Check Completion**: If the move number equals `n * n` (all squares covered), return `true`.
//		   - **Iterate Possible Moves**: For each of the 8 knight moves, calculate the next position.
//		     - **Check Safety**: If the next position is safe (within bounds and not visited), mark it and recursively attempt the tour from this position.
//		     - **Reset Position**: If the recursive call fails, backtrack by resetting the position to `-1`.
//		   - If no moves lead to a solution, return `false`.
//		6. **Print Solution**: 
//		   - If `KTUtil` returns `true`, print the solution matrix.
//		   - If `KTUtil` returns `false`, print "Solution does not exist."
//		7. **End**: Finish the execution of the program.
//		
//		This diagram captures the logical flow and purpose of each section in the Knight’s Tour solution using backtracking.