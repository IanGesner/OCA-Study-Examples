package com.scratchpad;

public class ScratchPad1 {
	static public final void main(String[] args) {
		A a = new A();
		a.lowAccess = 4;
		System.out.println(a.lowAccess);
		System.out.println(a.lowAccessMethod());
	}
	
	

}

// class A {
// int lowAccess = 4;
// public int highAccess;
//
// int lowAccessMethod() { return lowAccess;}
// public void highAccessMethod() {}
// }

// class B extends A {
//
// static final private int lowAccess = 1;
//
// @Override
// public int lowAccessMethod() {
// // TODO Auto-generated method stub
// return super.lowAccessMethod();
// }
//
// @Override
// public void highAccessMethod() {
// // TODO Auto-generated method stub
// super.highAccessMethod();
// }

// }