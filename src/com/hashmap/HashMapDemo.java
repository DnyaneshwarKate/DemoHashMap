package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Amit", 2546);
		hashMap.put("Abhishekh", 4578);
		hashMap.put("Sanket", 4859);
		hashMap.put("Rutik", 4756);
		
		System.out.println(hashMap);
	}
}
