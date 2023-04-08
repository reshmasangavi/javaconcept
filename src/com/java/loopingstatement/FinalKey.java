package com.java.loopingstatement;

public class FinalKey {
	
	final int a = 20;
	
	public void test1 () {
		int a = 50;
		System.out.println(a);
	}
	 public final void test2 () {
		 int a = 30;
	    System.out.println(a);
	}
	 public final void test2 (int a) {
		 System.out.println(a);
		 
	 }
    public static void main(String[] args) {
    	FinalKey f = new FinalKey();
    	f.test1();
    	f.test2();
    	f.test2(0);
}
    
}
