package com.project.practies;

public class StringManipulations {
	
	public static void countofEachCharacters() {
		String s= "wElcomE To @SuNday$143";
		int small = 0;
		int caps =0;
		int count =0;
		int special =0;
		
		for(int i=0; i<s.length(); i++) {
			if('a' <= s.charAt(i) &&  s.charAt(i) <='z') {
				small++;
			}else if ('A' <= s.charAt(i) &&  s.charAt(i) <='Z') {
				caps++;
			}else if('0' <= s.charAt(i) &&  s.charAt(i) <='9') {
				count++;
			}else {
				special++;
			}
			
		}
		System.out.println(small);
		System.out.println(caps);
		System.out.println(count);
		System.out.println(special);
	}
	public static void initCap() {
//		String s = "string maniplations programs";
//		String capitalize = WordUtils.capitalize(s);
//		String uncapitalize =WordUtils.uncapitalize(s);
//		System.out.println(capitalize);
//		System.out.println(uncapitalize);
}
	public static void main(String[] args) {
		countofEachCharacters();
		initCap();
	}

}
