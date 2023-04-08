package com.project.veriables;

public class Veriables {
	
	static int e ;
	static int f ;
	static int add = e+f;
	
	int c ;
	int d ;
	int sum = c+d;
	
	public void addition () {
		int a = 10;
		int b = 10;
		int sum = a+b;
		System.out.println(sum);
				
	}
	
	public void classAdd() {
		
		System.out.println(sum = 10+20);
	}
	
	public static void staticAdd () {
		
		System.out.println(add = 20+30);
	}
	
	 public static void main(String[] args) {
		Veriables t = new Veriables();
		t.addition();
		t.classAdd();
		
		Veriables.staticAdd();
		
		
		
	}

}
