package com.wipro.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.wipro.serialization.Student;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis;
		ObjectInputStream ois;

				   try {
					 fis= new FileInputStream("student.ser");
					ois = new ObjectInputStream(fis);
					
					Student   s = (Student)		ois.readObject();
				
						System.out.println(s);
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
