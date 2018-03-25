package com.overriding;

// 1. Static parent.x can be declared as instance child.x
// 2. Instance parent.x can be declared as static child.x
// 3. Instance parent.x can be declared as instance child.x
// 3. Instance parent.method() cannot be hidden as static child.method()
// 4. Static parent.method() cannot be redeclared as instance child.method()
// Interfaces
// 1. Static method can be redeclared as default in child
// 2. Default can override default
// 3.

public class Main {

	public static void main(String[] args) {

	}

}

interface A {
	String str = "A"; 
	
	default void A() {
		System.out.println("A");
	}
	void B();
	
	//static void printStr(); - must have body - can't override a static
	//static String str; - not allowed without inline initialization
	//static {} - not allowed
}

interface B extends A {
	default void A() {
		System.out.println("B");
	}
}

class C implements B {

	public int x;
	
	@Override
	public void A() {
		System.out.println("C");
		
	}

	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}
	
	public void C() {
		System.out.println("C.C()");
	}
	
}

class D extends C {
	public int x;
	
//	public static void C() {
//		
//	}
}

// Static methods must always have bodies because they can't be overriden


// You cannot hide an instance meth
