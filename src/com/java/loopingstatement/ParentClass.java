package com.java.loopingstatement;

public class ParentClass {
	public void m1 () {
		System.out.println("method one");
	}
	public void m2 () {
		System.out.println("method two");
	}
	public void m3 () {
		System.out.println("method three");
	}
	public void m4 () {
		System.out.println("method four");
	}
    public static void main(String[] args) {
    	ParentClass e = new ParentClass();
    	e.m1();
    	e.m2();
    	e.m3();
    	e.m4();
    }
		
	}
