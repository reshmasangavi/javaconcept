package com.project.practies;

import java.util.Scanner;

public class ArmstrongNumber {
//	public static void main(String[] args) {
//		int a,n,i = 0, j=0;
//		Scanner ak = new Scanner(System.in);
//		System.out.println("Enter a number");
//		n=ak.nextInt();
//		a=n;
//		
//		while(a>0) {
//			i = a%10;
//			j= j+(i*i*i);
//			a = a/10;
//		}
//		if(n==j) {
//			System.out.println("Armstrong number");
//		}else {
//			System.out.println("not armstrong number");
//			
//		}
//	}
    public static void count() {
    // count and print of armstrong number from 0 to 1000	
    	int c=0;
    	for(int n=1; n<1000; n++) {
    		
    		int a,i,j=0;
    		a=n;
    		while(a>0) {
    			i= a%10;
    			j=j+(i*i*i);
    			a=a/10;
    		}
    		if(j==n) {
    			System.out.println("armstrong number is = "+j);
    			c++;
    		}}
    			System.out.println("counts of armstrong number is = "+c);
    		}
    public static void main(String[] args) {
		count();
		
	}
}

    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	
    	
    	
	


