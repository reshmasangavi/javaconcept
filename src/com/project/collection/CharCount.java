package com.project.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
	
	public static void main(String[] args) {
		String name  = "kowsalya";
		char[] all_char = name.toCharArray();
//		System.out.println(all_char[0]);
		int lenght = name.length();
//		System.out.println(name.length());
		
		Map<Character,Integer> map = new LinkedHashMap<>();
			for(char each_char : all_char){
//		for (int i = 0; i<all_char.length;i++)
			System.out.println(map.get(each_char));
			if(map.containsKey(each_char)) {
				Integer count = map.get(each_char);
				map.put(each_char, count+1);
			}
			else {
				map.put(each_char, 1);
			}
			
		}
				System.out.println(map);
		
		
	}

}
