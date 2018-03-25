package com.scratchpad;

class A {
	int lowAccess = 4;
	public int highAccess;
	
	int lowAccessMethod() { return lowAccess;}
	public void highAccessMethod() {}
}
