package com.java.concepts;

public class Laptop {
	
	public void studentName () {
		System.out.println("public method");
		
	}
	
	public void studentId () {
		System.out.println("Private method");
		
	}
	
	protected void studentaddress() {
		System.out.println("Protected method");
		
	}
	
	void studentContact() {
		System.out.println( "Default method");
		
	}
	
	public static void main(String[] args) {
		Laptop rr = new Laptop();
		rr.studentName();
		rr.studentId();
		rr.studentaddress();
		rr.studentContact();
	}
	
}

	


