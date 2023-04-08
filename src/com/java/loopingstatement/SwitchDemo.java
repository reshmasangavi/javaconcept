package com.java.loopingstatement;

public class SwitchDemo {
	
	public void switchTest () {
		int errorCode = 400;
		
		if (errorCode==400) {
			System.out.println("bad request");
		}
		
		switch(errorCode) {
		case 302:
			System.out.println("tremporarily not found");
			
		case 500:
			System.out.println("internal server error");
			
		case 404:
			System.out.println("page not found");
			
		case 400:
			System.out.println("bad request");
			
		default:
			System.out.println("no error");
			
		}
	}

	public static void main(String[] args) {
		SwitchDemo s = new SwitchDemo();
		//s.switchTest();
		
		int a = 256;
		long l = a;
		System.out.println(l);  // widening
		
		float b = (float) a;
		System.out.println(b);  // narrowing
	}
}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	     
		
