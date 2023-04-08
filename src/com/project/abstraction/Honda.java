package com.project.abstraction;

public class Honda extends Hero {

	@Override
	public void body() {
		System.out.println("honda by engine");
		
	}
	
	public static void main(String[] args) {
		Honda hr = new Honda ();
		hr.engine();
		hr.body();
	}

}
