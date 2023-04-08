package com.project.inter;

public class Sbi implements BankData,Electronics {

	@Override
	public void withdraw() {
		
		System.out.println("withdraw by sbi");
		}

	@Override
	public void deposit() {
		
		System.out.println("deposit by sbi");
		}

	@Override
	public void mobile() {
		
		System.out.println("pay by cash");
		}

	@Override
	public void fan() {
		
		System.out.println("pay by card");
		}

	@Override
	public void ac() {
		
		System.out.println("pay by emi");
		}
	public static void main(String[] args) {
		Sbi an = new Sbi();
		an.withdraw();
		an.deposit();
		an.mobile();
		an.fan();
		
	}

	
	
	

}
