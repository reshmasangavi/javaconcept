package com.project.methodoverriding;

public class Daughter extends Father {
	

	public void buyPhone (String name) {
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Father sk = new Father();
				
		sk.buyPhone("samsung");
		
		Daughter sr = new Daughter();
		
		sr.buyPhone("vivo");
	
	
	Father sa = new Daughter();
	    sa.buyPhone("vivo");
	}

}

	

	

	
	
	