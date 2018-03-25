package com.unreachablecode.tryfinally;


public class Main {
public static void main(String[] args) {
	new Main().method();
}
	
	public int method() {
		try {
			return 1;
		} finally {
			System.out.println("Finally");
		}
	}

}

