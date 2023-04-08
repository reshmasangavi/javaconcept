package com.project.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest { 
	public void arrayList () {
		List<Object> sr = new ArrayList<>();
		sr.add("Reshma");
		sr.add(1103);
		sr.add(true);
		sr.add(77.90);
		sr.add('a');
		sr.add(1103);
		
//		System.out.println(sr);
//	    System.out.println(sr.get(2));
// 	    System.out.println(sr.contains(77.90));
// 	    sr.set(0, "Reshma Dhayalan");
// 	    System.out.println(sr);
// 	    sr.remove(4);
//		sr.remove("Reshma");
//		System.out.println(sr);
//		System.out.println(sr.removeAll(sr));
//		System.out.println(sr);
//		System.out.println(sr.indexOf(1103));
//		System.out.println(sr.lastIndexOf('a'));
//		List<Object> kk = new ArrayList<>();
//		kk.addAll(sr);
//		System.out.println(kk);
//		System.out.println(sr.size());
		
//		for(Object rr : sr) {
//			System.out.println(rr);
		
		ListIterator<Object> ani = sr.listIterator();
		while(ani.hasNext()) {
			System.out.println(ani.next());
		}
		while(ani.hasPrevious()) {
			System.out.println(ani.previous());
		}
	}
	
	public static void main(String[] args) {
		CollectionTest sk = new CollectionTest();
		sk.arrayList();
		
	}
}
