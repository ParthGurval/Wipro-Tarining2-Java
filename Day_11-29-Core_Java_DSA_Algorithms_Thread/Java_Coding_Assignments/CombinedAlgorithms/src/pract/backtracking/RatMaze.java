package pract.backtracking;



public class RatMaze {
	
	//This declares a constant n with a value of 4, representing the size of the maze (4x4 grid).
//	Why final is Used
//	Immutability: The keyword final ensures that the value of n cannot be changed once it has been assigned. This is useful for defining constants that should remain the same throughout the program's execution.
//	Readability: Using final makes it clear to anyone reading the code that n is a constant value, which won't be modified.
	
//	Alternatives to final
//	int n = 4; This would make n a regular variable that can be modified later in the code. However, this is not recommended if you want n to be a constant value representing the maze's size.
//	static final int n = 4;
//	static final would make n a class-level constant, meaning it is shared across all instances of the RatMaze class.
//	Use this if n is meant to be a constant that should be consistent for all instances of the class.
	final int n = 4;
	
	
//	This method prints the solution matrix sol to the console.
//	Parameters:
//	int[][] sol: A 2D array representing the solution path of the rat through the maze.
//	Explanation:
//	It iterates through each element of the 2D array sol, printing the values in a formatted manner.
//	In the code, \t is an escape sequence in Java that represents a tab character. It is used to insert a horizontal tab space in the output.
	void finalSoln(int[][] sol) {
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				System.out.print(sol[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
	
//	
//	This method checks if the rat can move to a given cell (x, y) in the maze.
//	Parameters:
//	int[][] maze: The 2D array representing the maze.
//	int x, int y: The coordinates in the maze to check.
	boolean isSafe(int[][] maze, int x, int y) {
		
//		It ensures the cell (x, y) is within the bounds of the maze and is a valid path (where maze[x][y] == 1).
		return( x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
	}

	
//	This is a recursive utility method that tries to solve the maze problem.
//	Parameters:
//	int[][] maze: The maze array.
//	int x, int y: The current coordinates of the rat.
//	int[][] sol: The solution matrix that marks the path taken.
	boolean solnMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		
//		Base Case:
//			Checks if the current cell (x, y) is the bottom-right corner of the maze (x == n - 1 && y == n - 1) and is a valid path. 
//			If so, it marks this cell as part of the solution and returns true.
		if(x == n - 1 && y == n - 1 && maze[x][y] == 1) {
			
			sol[x][y] = 1;
			return true;
		}
		
		
//		Recursive Case:
//			If the current cell (x, y) is safe, it marks the cell in the solution matrix.
//			Recursively tries to move to the next cell to the right (x + 1, y).
//			If moving right doesn’t work, it tries to move down (x, y + 1).
//			If neither move is successful, it backtracks by unmarking the cell (i.e., sets sol[x][y] = 0) and returns false.
		if(isSafe(maze, x, y)) {
			
			sol[x][y] = 1;
			
			if(solnMazeUtil(maze, x + 1, y, sol)) {
				
				return true;
			}
			
			if(isSafe(maze, x, y)) {
				
				sol[x][y] = 1;
				
				if(solnMazeUtil(maze, x, y + 1, sol)) {
					
					return true;
				}
			}
			
			sol[x][y] = 0;
			return false;
		}
		
		return false;
	}
	
//	This method is the starting point for solving the maze.
//	Explanation:




	boolean solveMaze() {
		
//		It initializes the maze and solution matrices.
		int[][] maze = {
				
				{1, 0, 0, 0},
				{1, 1, 0, 1},
				{0, 1, 0, 0},
				{1, 1, 1, 1}
		};
		
		int[][] sol = new int[n][n];
		
//		Calls solnMazeUtil to start solving the maze from the top-left corner (0, 0).
		if(!solnMazeUtil(maze, 0, 0, sol)) {
			
//			If no solution is found, it prints "Solution does not exist" and returns false.
			System.out.println("Solution does not exist");
			return false;
		}
		
//		If a solution is found, it calls finalSoln to print the solution matrix and returns true.
		finalSoln(sol);
		return true;
	}
	
//	The main method is the entry point of the program.
//	Explanation:


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		It creates an instance of the RatMaze class.
		RatMaze rat = new RatMaze();
		
//		Calls the solveMaze method to solve the maze and print the solution if one exists.
		rat.solveMaze();
	}

}


//Summary
//The program implements the Rat in a Maze problem using backtracking.
//It explores all possible paths from the start to the end of the maze and prints the path if a solution exists.
//Key concepts include recursion, backtracking, and matrix traversal.

	//final: 
	//	When a variable is declared as final, its value cannot be changed once it's assigned. It's like setting the value in stone—it becomes a constant.
	//
	//static: When a variable is declared as static, it belongs to the class rather than to any specific instance of the class. 
	//This means all instances of the class share this single variable.

	//1. Local Variables
	//Definition: Variables declared within a method, constructor, or block.
	//
	//Scope: Only accessible within the method or block where they are defined.
	//
	//Default Value: Local variables do not have a default value and must be initialized before use.
	//
	//Use: Used for temporary storage within methods.
	//
	//public void exampleMethod() {
	//    int localVar = 10; // local variable
	//    System.out.println(localVar);
	//}
	//
	//
	//2. Instance Variables
	//Definition: Variables declared inside a class but outside any method, constructor, or block. These are also known as non-static fields.
	//
	//Scope: Accessible by all methods in the class. Each instance of the class has its own copy of the instance variable.
	//
	//Default Value: Automatically initialized to default values (e.g., 0 for int, null for objects).
	//
	//Use: Store object state.
	//
	//public class Example {
	//    int instanceVar = 20; // instance variable
	//}
	//
	//3. Static Variables
	//Definition: Variables declared with the static keyword inside a class but outside any method or constructor.
	//
	//Scope: Belongs to the class, not to instances of the class. All instances share the same static variable.
	//
	//Default Value: Automatically initialized to default values.
	//
	//Use: Store values that should be shared across all instances of a class.
	//
	//public class Example {
	//    static int staticVar = 30; // static variable
	//}
	//
	//
	//4. Final Variables
	//Definition: Variables declared with the final keyword.
	//
	//Scope: Can be used with local, instance, or static variables.
	//
	//Use: Used to create constants. Once assigned, the value of a final variable cannot be changed.
	//
	//public class Example {
	//    final int finalVar = 40; // final variable
	//}


//		Here's a diagram outlining the flow of the `RatMaze` class from your code. It captures the step-by-step process for solving the Rat in a Maze problem using backtracking:
//		
//		(Start)
//		   |
//		   V
//		(Initialize the maze and solution matrices)
//		   |
//		   V
//		(Call solveMaze to start solving the maze)
//		   |
//		   V
//		(Inside solveMaze:
//		   |
//		   V
//		   (Initialize maze and solution matrices with predefined values)
//		   |
//		   V
//		   (Call solnMazeUtil to start solving the maze from the top-left corner (0, 0))
//		      |
//		      V
//		      (Inside solnMazeUtil:
//		         |
//		         V
//		         (Base Case: Check if current cell (x, y) is the destination (bottom-right corner))
//		            |
//		            V
//		            (If true and cell is valid, mark it as part of the solution and return true)
//		            |
//		            V
//		         (Recursive Case:
//		            |
//		            V
//		            (Check if current cell (x, y) is safe using isSafe)
//		               |
//		               V
//		               (If safe, mark the cell in the solution matrix)
//		               |
//		               V
//		               (Try to move right (x + 1, y))
//		                  |
//		                  V
//		                  (If moving right is successful, return true)
//		                  |
//		                  V
//		                  (If moving right fails, try to move down (x, y + 1))
//		                     |
//		                     V
//		                     (If moving down is successful, return true)
//		                     |
//		                     V
//		                     (If moving down fails, backtrack by unmarking the cell (sol[x][y] = 0) and return false)
//		            |
//		            V
//		         (If cell is not safe, return false)
//		   |
//		   V
//		(If solnMazeUtil returns true, print the solution matrix using finalSoln)
//		   |
//		   V
//		(Print "Solution does not exist" if solnMazeUtil returns false)
//		   |
//		   V
//		(End)
//		
//		### Explanation of Each Step:
//		1. **Start**: Begin the execution of the program.
//		2. **Initialize Maze and Solution Matrices**:
//		   - **Maze**: Define a 4x4 grid representing the maze.
//		   - **Solution Matrix**: Initialize as a 4x4 grid filled with zeros.
//		3. **Call solveMaze**:
//		   - Start solving the maze problem by calling `solveMaze()`.
//		4. **Inside solveMaze**:
//		   - **Initialize Matrices**: Define the `maze` with predefined values and the `sol` matrix.
//		   - **Call solnMazeUtil**: Start solving the maze from the top-left corner (0, 0).
//		5. **Inside solnMazeUtil**:
//		   - **Base Case**: Check if the current cell (x, y) is the bottom-right corner of the maze and valid.
//		     - **If True**: Mark this cell in the solution matrix and return `true`, indicating success.
//		   - **Recursive Case**:
//		     - **Check Safety**: Ensure the current cell (x, y) is within bounds and valid (i.e., `maze[x][y] == 1`).
//		       - **If Safe**: 
//		         - Mark the cell in the solution matrix.
//		         - **Move Right**: Try moving right (to cell (x + 1, y)).
//		           - **If Successful**: Return `true`.
//		           - **If Fails**: Try moving down (to cell (x, y + 1)).
//		             - **If Successful**: Return `true`.
//		             - **If Fails**: Backtrack by unmarking the cell and return `false`.
//		       - **If Not Safe**: Return `false`.
//		6. **Print Solution**:
//		   - **If Solution Found**: Print the board configuration using `finalSoln()`.
//		   - **If No Solution**: Print "Solution does not exist."
//		7. **End**: Finish the execution of the program.
//		
//		This diagram outlines the logical flow and purpose of each section in solving the Rat in a Maze problem using backtracking.