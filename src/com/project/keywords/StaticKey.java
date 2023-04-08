package com.project.keywords;

public class StaticKey {
	
	String name = "Reshma";
	
	public void employeeId () {
		System.out.println(name);
	}
	
	public void employeeName (String name) {
		this.employeeId();
		System.out.println(this.name);
	}
	
	public void userName () {
	System.out.println("username");
	
	}
	
	public static void salary (int salary) {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		StaticKey rd = new StaticKey();
		rd.employeeName("Dhayalan");
		rd.userName();
		StaticKey.salary(40000);
		
	}

}
