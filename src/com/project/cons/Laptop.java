package com.project.cons;

public class Laptop {
	
	public Laptop() {
		System.out.println("default constructor");
	}
	
	private Laptop(int slno) {
		this();
		System.out.println("parameterized constructor");
		
	}
	protected Laptop(String s) {
		this((byte)19);
		System.out.println("non parameterized");
	}
	
	public Laptop (byte b) {
		this(17);
		System.out.println("byte constructor");
	}
	
	public static void main(String[] args) {
		Laptop sk = new Laptop("siva");
		
				
	}
		
	
		

	}


