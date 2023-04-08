package com.project.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		Set<Object> f = new HashSet<>();
		f.add(70);
		f.add("Chitra");
		f.add(true);
		f.add(143.70);
		f.add(3);
//		 System.out.println(f);
//		 System.out.println(f.size());
//		 System.out.println(f.contains(143.70));
//		 System.out.println(f.remove(70));
//		 System.out.println(f);
//		 Set<Object> rr = new HashSet<>();
//		 rr.addAll(f);
//       System.out.println(rr);
//		 f.clear();
//		 System.out.println(f);
//		 System.out.println(f.removeAll(f));
		 
		 Object[] array_set = f.toArray();
	     System.out.println(array_set[0]);
		 System.out.println(Arrays.toString(array_set));
		 
//		 List<Object> gl = new ArrayList<>();
//		 gl.addAll(f);
//		 System.out.println(gl);
//		 System.out.println(gl.get(3));
		
		Iterator<Object> sg = f.iterator();
		while(sg.hasNext()) {
			System.out.println(sg.next());
		}
		 
		 
	}

}
