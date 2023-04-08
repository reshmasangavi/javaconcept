package com.project.array;

public class StringFunction {
	
	public static void main(String[] args) {
		//String s = "reshma dhayalan";
		//String s1 = "reshma dhayalan";		
		//String s2 = "raj kumar";
		
		//	System.out.println(s1.length());
		//	System.out.println(s.equals(s1));
		//System.out.println(s.equalsIgnoreCase(s2));
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		//System.out.println(s.startsWith("r"));
		//System.out.println(s.endsWith("n"));
		//System.out.println(s.contains("esh"));
		//System.out.println(s.indexOf("s"));
		//System.out.println(s2.lastIndexOf("a"));
		//System.out.println(s.charAt(4));
		//System.out.println(s.replace("s", "f"));
		//System.out.println(s.substring(1,4));
		//System.out.println(s.trim());
		//System.out.println(s.concat(s2));
		
		String s1 = "kavi reshma anitha";
		
		String[] split = s1.split(" ");
		for(int i=0;i<split.length;i++)
			System.out.println(split[i]);
		
	}
	
	
	
	
	
	
}
