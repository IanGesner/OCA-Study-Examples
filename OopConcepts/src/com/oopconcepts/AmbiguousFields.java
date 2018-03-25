package com.oopconcepts;

public class AmbiguousFields implements A, B {

	int method() {
		return ((A)this).field;
	}
}

interface A {
	int field = 1;
}

interface B  {
	int field = 2;
}
