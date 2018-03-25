package com.switchstatements;

public class Main {

	public static void main(String[] args) {
		long l = 3;
		// switch (l) {}	// nope
		
		int i = 2; // bics

		switch (i) {
		case 2:			
			System.out.println(2);
			//break;
		default:
			System.out.println("d");
		}
	}

}
