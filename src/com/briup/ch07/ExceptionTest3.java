package com.briup.ch07;

public class ExceptionTest3 {
public static void div() throws Exception{
	int a = 10,b=0;
	try {
		int c= a/b;
	} catch (ArithmeticException e) {
		// TODO: handle exception
		e.printStackTrace();
		throw new Exception(e);
	}
	
}
public static void main(String[] args) {
	try {
		div();	
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
