package com.wipro.KnightsTourProblem;

public class KnightsTour {
	
	static final int  n = 8;
	
	static boolean isSafe(int x, int y, int[][] sol) {
		
		return( x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
	}
	
	static void printSoln(int[][] sol) {
		
		for(int x  = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
				System.out.print(sol[x][y] + "\t");
			}
			
			System.out.println();
		}
	}
	
	static boolean KTUtil(int x, int y, int move, int[][] sol, int[] xMove, int[] yMove) {
		
		int next_x, next_y;
		
		if(move == n * n) {
			
			return true;
		}
		
		for(int k = 0; k < 8; k++) {
			
			next_x = x + xMove[k];
			next_y = y + yMove[k];
			
			if(isSafe(next_x, next_y, sol)) {
				sol[next_x][next_y] = move;
				if(KTUtil(next_x, next_y, move + 1, sol, xMove, yMove)) {
					
					return true;
				}
				
				else {
					
					sol[next_x][next_y] = -1;
				}
			}
		}
		
		return false;
	}
	
	static boolean fnlknightTour() {
		
		int[][] sol = new int[n][n];
		
		for(int x = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
				sol[x][y] = -1;
			}
		}
		
		int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
		
		sol[0][0] = 0;
		
		if(!KTUtil(0, 0, 1, sol, xMove, yMove)) {
			
			System.out.println("Solution does not exist");
			return false;
		}
		
		else {
			
			printSoln(sol);
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		fnlknightTour();
	}
}
