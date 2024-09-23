package com.wipro.TowerOfHanoi;

public class TowerOfHanoi {
	
	static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
		
		if(n == 1) {
			
			System.out.println("Moving Disk 1 from rod " + fromRod + " to rod " + toRod);
			return;
		}
		
		solveHanoi(n-1, fromRod, auxRod, toRod);
		
		System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
		
		solveHanoi(n-1, auxRod, toRod, fromRod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numDisk = 3;
		System.out.println("Tower og Hanoi has " + numDisk + " Disks");
		solveHanoi(numDisk, 'A', 'C', 'B');
	}

}
