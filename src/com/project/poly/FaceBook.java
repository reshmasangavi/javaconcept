package com.project.poly;

public class FaceBook {
	
	public void searchUser (int userId) {
		
		System.out.println(userId);
	}
	
	public void searchUser (String firstName, String lastName) {
		
		System.out.println(firstName + lastName);
	}
	
	public void searchUser (String adress, String location, int pinCode) {
		
		System.out.println(adress + location + pinCode);
	}
	
	public static void main(String[] args) {
		
		FaceBook sk = new FaceBook();
		
		sk.searchUser(147);
		sk.searchUser("siva" , "karthikeyan");
		sk.searchUser("pallipet", "kumaramangam", 179);
		
	}

}

