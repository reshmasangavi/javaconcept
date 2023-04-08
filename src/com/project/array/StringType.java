package com.project.array;

public class StringType {
	public static void main(String[] args) {
//		//literal
//		String s = "reshma dhayalan";
//		String s1 = "anitha thangam";		
//		String s2 = "reshma dhayalan";
//		
//		System.out.println("s : "+ System.identityHashCode(s));
//		System.out.println("s1 : "+ System.identityHashCode(s1));
//		System.out.println("s2 : "+ System.identityHashCode(s2));
//		
//		String s3 = s.concat(s1);
//		System.out.println(s3);
//		System.out.println("s3 :" +System.identityHashCode(s3));
		
		// non literal
//		String s4 = new String("jeni");
//		String s5 = new String("baby");		
//		String s6 = new String("jeni");
//		
//		System.out.println("s4 : "+ System.identityHashCode(s4));
//		System.out.println("s5 : "+ System.identityHashCode(s5));
//		System.out.println("s6 : "+ System.identityHashCode(s6));
//		
//		String s7 = s4.concat(s5);
//		System.out.println(s7);
//		System.out.println("s7 :" + System.identityHashCode(s7));
		
		// String buffer
		StringBuffer sb1 = new StringBuffer("kalai");
		StringBuffer sb2 = new StringBuffer("sathya");		
		StringBuffer sb3= new StringBuffer("kalai");
	    
	    System.out.println("sb1 : "+ System.identityHashCode(sb1));
	    System.out.println("sb2 : "+ System.identityHashCode(sb2));
	    System.out.println("sb3: "+ System.identityHashCode(sb3));
	    
	    StringBuffer sb4 = sb2.append(sb3);
	    System.out.println(sb4);
	    System.out.println("sb4 : "+ System.identityHashCode(sb4));
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}