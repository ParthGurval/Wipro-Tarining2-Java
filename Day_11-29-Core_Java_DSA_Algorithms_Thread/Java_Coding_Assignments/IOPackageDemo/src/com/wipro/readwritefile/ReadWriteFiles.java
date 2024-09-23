package com.wipro.readwritefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream    reader = null;
		
		FileOutputStream  writer = null;
		
		try {
			//FileReader    reader  = new FileReader("Input.txt");
			
			 reader = new FileInputStream("Input.txt");
			
			//FileWriter  writer  = new FileWriter("Output.txt"); // created by JVM
			
			writer  = new FileOutputStream("Output.txt");
			
				int n =	0;
				
				while( (n= reader.read())  !=  -1 ) {
					
					System.out.print((char)n);
					
					   writer.write(n);
					   
					   writer.flush();  // it will flush data manually
					
				}
				
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
				try {
					reader.close();
					writer.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

}
