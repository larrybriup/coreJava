package com.briup.ch07;

public class AssertTest {
	public void div(int a, int b) {
		int res = 0;
		//if(b!=0)
		assert b!=0:"this is assertion test";
		res = a / b;
		System.out.println("res=" + res);
	}

	public static void main(String[] args) {
			AssertTest test = new AssertTest();
			test.div(10,0);
	}
}
