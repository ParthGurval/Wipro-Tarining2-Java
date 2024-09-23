package com.wipro.readingfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromKB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			/*
			 * System.out.println("Enter data"); int n = br.read();
			 * 
			 * System.out.println( (char)n );
			 */
			
			System.out.print("Enter Name: ");
			
			String name =	br.readLine();
			
			System.out.println(name);
			
			System.out.print("Enter amount: ");  //  "5000"  ---> 5000
			
				String s1 = br.readLine();
			
			int amount =	Integer.parseInt(s1);
			
			
			System.out.println("Total Amount is :  "+ (amount + 100));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
