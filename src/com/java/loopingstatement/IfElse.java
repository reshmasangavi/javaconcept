package com.java.loopingstatement;

public class IfElse {
	int age = 30;
	public void aadhar () {
		if((age >=100)&&(age >=5)) {
			System.out.println("finger print not necessary");
		}else if ((age <=6)&&(age >=14)) {
			System.out.println("finger print updation not mandatory");
		}
		else if ((age>=15)&&(age>=90)) {
			System.out.println("finger print updation cumpulsory");
		}
		else if ((age>=61)||(age>=110)) {
			System.out.println("finger print not needed");
		}
		else if (age ==30) {
			System.out.println("child");
		}
		else {
			System.out.println("no aadhar card");
		}
	}
	
	
public static void main(String[] args) {
	IfElse e = new IfElse();
	e.aadhar();
}
	

}

