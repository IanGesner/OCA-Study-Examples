package com.scratchpad;

import java.util.ArrayList;

public class ScratchPad02 {

	public static void main(String[] args) {
    	Object obj = new Object[][]{ {"aaa"}, {new String("hello")}, {new ArrayList<Integer>().add(1)}, {"str", "like", "this"} };
    	
    	System.out.println(((Object[][])obj)[0][0]);
    	System.out.println(((Object[][])obj)[1][0]);
    	System.out.println(((Object[][])obj)[2][0]);
    	System.out.println(((Object[][])obj)[3][0]);
    	System.out.println(((Object[][])obj)[3][1]);
    	System.out.println(((Object[][])obj)[3][2]); 	
    	
//    	Object[] obj1 = new Object[]{ {} }; // invalid, must be 2D array
    	Object[][] obj2 = new Object[][] { {}, {} }; // like this
    	}
	}

