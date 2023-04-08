package com.java.loopingstatement;

public class Looping {
	
	public void name () {
		for (int i = 20; i >=0; i--) {
			System.out.println("reshma" + i);
		}
	}
	public static void while1 () {
		int i = 0;
		while (i < 30) {
			System.out.println(i);
			i++;
			
		}
	}
	public static void dowhile () {
		
		int i = 50;
		do {
			System.out.println(i);
			i++;
		
		}while(i>=20) ;
	}
	
	public static void main(String[] args) {
		Looping ss = new Looping();
		ss.name();
		
		Looping.while1();
		Looping.dowhile();
		
		
	
		
	}

}



	

	









