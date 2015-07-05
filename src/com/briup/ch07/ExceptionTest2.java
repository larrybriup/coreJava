package com.briup.ch07;

public class ExceptionTest2 {
	public int div(int a, int b) throws ArithmeticException,
			ClassCastException, divException {
		int res = 0;
		res = a / b;
		return res;
	}

	public static void main(String[] args) throws divException {
		ExceptionTest2 test = new ExceptionTest2();
		try {
			test.div(10, 0);
		} /*catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new divException("this is my definition Exception");
		}finally{
			System.out.println("finally block");
		}
		System.out.println("this is exception test");
	}
}

class divException extends Exception {

	/**
	 * 
	 */
	public divException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public divException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public divException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public divException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}