package com.project.collection;

public class VariableTest {
	
	public int a = 10;  // class variable with initialization
    String str;         // class variable without initialization
   public void m1() {
	  a=20;
	   System.out.println(a);
	   System.out.println(str);
   }
   public void m2() {
	   int a=50;
	   int b=100;
	   System.out.println(a);
	   System.out.println(b);
   }
   public static void main(String[] args) {
	VariableTest sk = new VariableTest();
	sk.m1();
	sk.m2();
}
	

}
