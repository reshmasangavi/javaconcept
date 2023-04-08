package com.project.collection;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int a=371;
		int n = a;
		int j = 0;
		while(a>0) {        
			int i = a%10;  //i=1      //i=7   // i=3
			j = j+(i*i*i); // j=1     //j=344  // j=371
			a = a/10;      // a=37   //a= 3   //  a=0
		}
		System.out.println(a);
		System.out.println(j);
		System.out.println(n);
		
		if (n==j) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not an armstrong number");
		}
		
	}

}
