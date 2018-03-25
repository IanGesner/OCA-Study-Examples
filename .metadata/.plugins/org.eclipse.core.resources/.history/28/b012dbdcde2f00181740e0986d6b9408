package com.exceptions;

class ExceptionTest {
	public void method() throws Exception {
		throw new Exception();
	}
}

class RuntimeExceptionTest {
	public void method() {
		throw new RuntimeException();
	}
}

class ErrorTest {
	public void method() {
		throw new Error();
	}
}

class SpecificException extends Exception {
	private static final long serialVersionUID = 1L;
}

public class CheckedUncheckedError {

	public static void main(String[] args) {
		try {
			new RuntimeExceptionTest().method();
		} finally {
		} // try-finally is okay for runtime exceptions

		try {
			new ExceptionTest().method();
		}
		catch (Exception e) {
		} // checked exception requires catch
		// catch (SpecificException e) {} // unreachable - compile-time error
		

		try {
			new ErrorTest().method();
		} finally {
		} // checked exception requires catch
	}

}
