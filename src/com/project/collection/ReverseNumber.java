package com.project.collection;

public class ReverseNumber {
	public static void main(String[] args) {
		int a= 123456;
		int n=a;
		int rev=0;
		
		while(a>0) {
			int i=a%10;      //i=6     //i=5    //i=4  //i=3 //i=2  // i=1
			rev=i+(rev*10);  // rev=6  //rev=65 //rev=654 // rev=6543 //rev=65432 // rev=654321
			a= a/10;        //a=12345   //a=1234  //a=123 //a=12  // a=1 // a=0
			
			System.out.println(rev);
			
//			if(n==rev) {
//				System.out.println("palindrome");
//			}else {
//				System.out.println("not an palindrome");
//			}
		}
		System.out.println(a);
		System.out.println(n);
		System.out.println(rev);
		
		if(n==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not an palindrome");
		}
	}
		
	
}
