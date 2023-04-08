package com.project.veriables;

public class Gpay {
	String s = "james";
	
	static String str = "selenium";
	
	int a;
	public void payment () {
		a = 10;
		int b = 20;
		int sub = a-b;
		System.out.println("payment" +sub+ s + str);
	}
	
	public void pay () {
		 s = "gosling";
		 s = "jave";
		 
		System.out.println(s);
	}
	
	public static void m1 () {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Gpay e = new Gpay();
		e.payment();
		e.pay();
		
		Gpay.m1();
	}
	
	

}
