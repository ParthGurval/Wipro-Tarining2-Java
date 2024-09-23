package com.wipro.RatMazeProblem;

public class RatMaze {
	
	final int n = 4;
	
	void finalSoln(int[][] sol) {
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				System.out.print(sol[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
	
	boolean isSafe(int[][] maze, int x, int y) {
		
		return( x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
	}

	boolean solnMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		
		if(x == n - 1 && y == n - 1 && maze[x][y] == 1) {
			
			sol[x][y] = 1;
			return true;
		}
		
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
	
	
	boolean solveMaze() {
		
		int[][] maze = {
				
				{1, 0, 0, 0},
				{1, 1, 0, 1},
				{0, 1, 0, 0},
				{1, 1, 1, 1}
		};
		
		int[][] sol = new int[n][n];
		
		if(!solnMazeUtil(maze, 0, 0, sol)) {
			
			System.out.println("Solution does not exist");
			return false;
		}
		
		finalSoln(sol);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RatMaze rat = new RatMaze();
		
		rat.solveMaze();
	}

}
