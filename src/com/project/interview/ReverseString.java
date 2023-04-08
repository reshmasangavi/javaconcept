package com.project.interview;

public class ReverseString {   
//	public static void main(String[] args) {  // ordervise 
//		
//		String rev = "Java is a programing language"; 
//		
//		String [] split = rev.split(" ");
//		for(int i=0; i<split.length;i++) {
//			System.out.println(split[i]);
//		}
//		
//	}

	public static void main(String[] args) {
		String rev = "Java is a programing language";  // reverse 
		
		String [] sd = rev.split(" ");
		for(int i=sd.length-1;i>=0;i--) {
			System.out.println(sd[i]);
		}
	}
}
