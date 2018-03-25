package com.ian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		interfaceTests();
		
		System.out.println();
		hashMapTests();
		
		System.out.println();
		hashSetTests();
		
		treeSetTests();
	}
	
	public static void interfaceTests() {
		Iterable<String> iter = new ArrayList<String>();
			
	}
	
	public static void treeSetTests() {
		Set<String> set = new TreeSet<String>();
		//Set<Object> set = new TreeSe
		set.add("A");
		set.add("c");
		set.add("a");
		set.add("z");
		set.add("y");
		set.add("x");
		set.add("w");
		set.add("v");
		set.add("t");
		set.add("s");
		set.add("C");
		set.add("B");
		
		for (String string : set) {
			System.out.println(string);
		}
	}
	
	
	public static void hashSetTests() {
		Set<String> set = new HashSet<String>();
		
//		1. Putting a redundant key will overwrite existing key/value pair.
//		2. When iterating over keys/values, they will be received in the order they were inserted.
//		3. Overwriting an element will keep it's original order.
		
		set.add("Some null");
		set.add("Two b's");
		set.add("Two a's");
		set.add("Three a's");
		set.add("Two a's2");
		set.add("Some null2");
		set.add(null);	
		
		for (String value : set) {
			System.out.println(value);
		}
	}
	
	public static void hashMapTests() {
		Map<String, String> map = new HashMap<String,String>();
		
//		1. Putting a redundant key will overwrite existing key/value pair.
//		2. When iterating over keys/values, they will be received in the order they were inserted.
//		3. Overwriting an element will keep it's original order.
//		4. Iterating keys or values both yield the same order of key/value pairs.
	
		map.put(null, "null 1");
		map.put("aa", "aa");
		map.put("a", "a");
		map.put(null, null);
		map.put("aaa", "aaa");
		map.put("aa", "aa");
		map.put(null, "null 2");

		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}
