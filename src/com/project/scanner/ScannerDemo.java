package com.project.scanner;

import java.util.Scanner;

public class ScannerDemo {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void getScanner () {
		
		int a = sc.nextInt();
		System.out.println(a);
	}
	
	public void getString () {
		char sk = sc.next ().charAt(2);
		System.out.println(sk);
		
	}
	
	public void getfullString () {
		System.out.println("enter the number");
		String rr = sc.nextLine();
		System.out.println(rr);
		
	}
	
	
	
	 public static void main(String[] args) {
		ScannerDemo da = new ScannerDemo();
		da.getfullString();
		da.getScanner();
		da.getString();
		
	}
	 

}
