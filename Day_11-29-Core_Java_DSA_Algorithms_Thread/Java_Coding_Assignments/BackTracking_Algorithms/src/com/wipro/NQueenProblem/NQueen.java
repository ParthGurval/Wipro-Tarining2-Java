package com.wipro.NQueenProblem;

public class NQueen {
	
	final int n = 4;
	
	void printSoln(int board[][]) {
		
		for(int x  = 0; x < n; x++) {
			
			for(int y = 0; y < n; y++) {
				
				System.out.print(board[x][y] + "\t");
			}
			
			System.out.println();
		}
	}

	boolean isSafe(int board[][], int row, int col) {
		
		int i, j;
		
		for(i = 0; i < col; i++) {
			
			if(board[row][i] == 1) {
				
				return false;
			}
		}
		
		for(i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			
			if(board[i][j] == 1) {
				
				return false;
			}
		}
		
		for(i = row, j = col; j >= 0 && i < n; i++, j--) {
			
			if(board[i][j] == 1) {
				
				return false;
			}
		}
		
		return true;
	}
	
	boolean fnlNQUtil(int board[][], int col) {
		
		if(col >= n) {
			
			return true;
		}
		
		for(int i = 0; i < n; i++) {
			
			if(isSafe(board, i, col)) {
				
				board[i][col] = 1;
				
				if(fnlNQUtil(board, col + 1)) {
					
					return true;
				}
				
				board[i][col] = 0;
			}
		}
		
		return false;
	}
	
	boolean resultNQ() {
		
		int board[][] = new int[n][n];
		
		if(!fnlNQUtil(board, 0)) {
			
			System.out.println("Solution does not exist");
			return false;
		}
		
		printSoln(board);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NQueen Queen = new NQueen();
		
		Queen.resultNQ();
	}

}
