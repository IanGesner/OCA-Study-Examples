package com.test;

public class Main {

	public static void main(String[] args) {
		// A narrowing primitive conversion may be used if all of the following
		// conditions are satisfied:
		// i. The expression is a compile time constant expression of type byte, char,
		// short, or int.
		// ii. The type of the variable is byte, short, or char.
		// iii. The value of the expression (which is known at compile time, because it
		// is a constant expression)
		// is representable in the type of the variable

		byte var1;
		short var2;
		char var3;

		// all variables can be assigned to a byte literal
		var1 = 0xa;
		var2 = 0xa;
		var3 = 0xa;

		// all variables can be assigned to a char literal
		var1 = 'a';
		var2 = 'a';
		var3 = 'a';

		// all variables can be assigned to a short literal
		var1 = 1;
		var2 = 1;
		var3 = 1;
		
		// all variables can be assigned to a short literal
		var1 = (short) 1;
		var2 = (short) 1;
		var3 = (short) 1;
		
//		int j = 3 * 4;
//		var1 = j;
//		var2 = j;
//		var3 = j;
		// none work
		
//		char c = 'c';
//		var1 = c;
//		var2 = c;
//		var3 = c;
		// none but the char work
		
		//byte b = 128; nope
		
	}

}
