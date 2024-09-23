package com.wipro.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	private   int sid;  // transient
	private  String sname;   //static
	
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
