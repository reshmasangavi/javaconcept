package com.java.hierarchical;

public class Chennai extends Ipl{
	


	
	public void caption () {
		
		System.out.println("dhoni is caption");
	}
	
	void viceCaption () {
		
		System.out.println("raina is vice caption");
	}
	
public static void main(String[] args) {
		
		Chennai ch = new Chennai();
		ch.over();
		ch.drinkBreak();
		ch.caption();
		ch.viceCaption();
		
		Mumbai rr = new Mumbai();
		rr.caption();
		rr.viceCaption();
		rr.over();
		rr.drinkBreak();

	}
	
	

}
