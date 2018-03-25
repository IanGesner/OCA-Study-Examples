package com.oopconcepts.acoverriding;

public class AcOverriding {

}

class A {
	void method() {
		System.out.println("A method()");
	}
	
	void parentMethodDoesNotThrow() {
		
	}
}

abstract class B extends A {
	abstract void method();
	
	void parentMethodDoesNotThrow() /*throws Exception*/{ // This is only okay with unchecked exceptions
		
	}
}
