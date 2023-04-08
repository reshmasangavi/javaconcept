package com.project.methodoverriding;

public class Phonepe extends Gpay {
	
	public void  payment (int rupees) {
	super.payment(2000);
	System.out.println("pay from phonepe : " + rupees);
	}
	
	public static void main(String[] args) {
		
		Phonepe m = new Phonepe ();
		m.payment(1000);
		m.pay();
		
	}

}
