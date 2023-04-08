package com.project.keywords;

public class Tester extends StaticKey {
	
	public void files () {
		super.employeeName("Anitha");
		System.out.println("files");
	}
	public void loginTest () {
		super.userName();
		this.files();
		System.out.println("login tester");
		
	}
	
	public static void main(String[] args) {
		Tester an = new Tester ();
		an.loginTest();
		
		
		
	}

}
