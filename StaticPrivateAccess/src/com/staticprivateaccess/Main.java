package com.staticprivateaccess;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello " + A.staticMethod());
	}
}

class A {
	private String privateMember = "World!";
	
	public static String staticMethod() {
		A a = new A();
		return a.privateMember;
	}
}
