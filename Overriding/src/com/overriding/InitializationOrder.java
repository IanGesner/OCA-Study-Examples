package com.overriding;

public class InitializationOrder {
	
	public static void main(String[] args) {
		byte byteArr[] = new byte[5];
		System.out.println(byteArr.toString());
	
	}

}

class A1 {
	
	static int staticInt = 3;
	
	static {
		staticInt = 4;
	}
}


class B1 {
	
}