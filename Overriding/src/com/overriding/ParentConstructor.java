package com.overriding;

public class ParentConstructor {

	// does not declare no-arg constructor

	public ParentConstructor(int someValue) {

	}

}

class ChildConstructor extends ParentConstructor {
	public ChildConstructor() {
		super(1);
	}
}
