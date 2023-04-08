package com.java.loopingstatement;

public class FinalTest extends ParentClass {
	
	    public void m4 () {
		System.out.println("method five");
	    }
      public static void main(String[] args) {
    	  FinalTest f = new FinalTest();
    	  f.m1();
    	  f.m2();
    	  f.m3();
    	  f.m4();
    	  
    	  ParentClass v = new  FinalTest();  // method override
    	  v.m4();
    	 
    	  
}
}