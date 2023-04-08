package com.project.collection;

public class SwapUsingTemp {
	
	public static void main(String[] args) {
		int a = 10;      // variable declaration with initialization
		int b = 20;
		System.out.println("before Swaping "+a+" "+b);
		int temp = a;    // using temporary variable to swap
		
		a = b;          // assigning value to the variable
		b = temp;
		System.out.println("after swaping "+a+" "+b);
		
// without using temporary  variables		
		int i = 150;
		int j = 200;
		
		i = i+j;  // 150+200=350
		j = i-j;  //350-200=150
		i = i-j;   //350-150=200
		System.out.println(i+" "+j);
		
		
	}

}
