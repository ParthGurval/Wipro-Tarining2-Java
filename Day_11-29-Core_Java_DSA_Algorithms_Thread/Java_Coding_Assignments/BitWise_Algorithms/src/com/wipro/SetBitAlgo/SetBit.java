package com.wipro.SetBitAlgo;

import java.util.Scanner;

public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		while(num > 0) {
			
			count += num & 1;
			num >>= 1;
		}
		
		System.out.print("Number of set bits: " + count);
	}

}
