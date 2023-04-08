package com.project.interview;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest {
	public static void main(String[] args) {
		//initializing array value
		String friends[] = {"kavi","resh","chitra","anitha","jeni","kalai","sathya","sangavi","banu","priya"};
		//ArrayList declaration
		ArrayList <String> hm= new ArrayList<String>();
		
		for(int i=0;i<friends.length;i++) {
			hm.add(friends[i]);
		}
		Collections.sort(hm); // converting sort // arraylist method
		
		for(String sort :hm) {
			System.out.println(sort);
		}
		System.out.println("********************************");
		
		Collections.sort(hm, Collections.reverseOrder()); // converting to reverse
		
		for(String rev:hm) {
			System.out.println(rev);
		}
	
	}
	
}
