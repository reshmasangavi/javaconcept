package com.java.concepts;

public class Student {
	
	int a = 10;
	
	int b =20;
	
	int c ;
	
public void add() {
	 c = a+b;
	 
	 System.out.println(" Sum of two numbers ; "+c);
	 
}

public void sub() {
	
	c = a-b;
	
	System.out.println(c);
	
}

	
public static void main(String[] args) {
	
	Student st = new Student();
	 st.add();
	 st.sub();
		
			
		}
		
	}

