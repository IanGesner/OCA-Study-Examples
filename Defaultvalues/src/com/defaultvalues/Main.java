package com.defaultvalues;

public class Main {

	int j;

	public static void main(String[] args) {
		Defaults d = new Defaults();
		d.printMemberInt();
		d.printMemberIntArray();
		d.printMemberStrArray();

		// System.out.println(j);
		// System.out.println(i);
		int[] i = new int[10];
		for (int j : i) {
			System.out.println(j);
		}
	}

}

class Defaults {
	int memberInt;
	int[] memberIntArray = new int[5];
	String[] memberStrArray = new String[5];
	
	public void printMemberInt() {
		System.out.println(memberInt);
	}
	
	public void printMemberIntArray() {
		for (int i : memberIntArray) {
			System.out.println(i);
		}
	}
	
	public void printMemberStrArray() {
		for (String string : memberStrArray) {
			System.out.println(string);
		}
	}
	
	public void printUninitializedLocalVars() {
		int j;
		String str;
		int staticInt;
		
		//System.out.println(j); // Nope
		//System.out.println(str); // Nope
	}
}
