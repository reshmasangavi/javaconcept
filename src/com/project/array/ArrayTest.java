package com.project.array;

public class ArrayTest {
	public void family () {
		String[] name = new String[10];
		name[0] = "Dhayalan";
		name[1] = "Bhakya";
		name[3] = "Kavi";
		name[5] = "Reshma";
		name[8] = "Chitra";
//		System.out.println(name[1]);
		
//		for (int i=0; i<name.length;i++) {
//			System.out.println(name[i]);
//		}
//		for (String names : name) {
	//		System.out.println(names);
//		}
		
	}
		public void friends() {
			String[] f = {"kalai","jeni","sathya","praveen"};
			System.out.println(f.length);
			
			for(String raji : f) {
				System.out.println(raji);
			}
			
		}
	
	
	public static void main(String[] args) {
		ArrayTest s = new ArrayTest ();
//		s.family();
		s.friends();
	}

}
