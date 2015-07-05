package com.briup.ch05;

public class ArgsPassTest{


	public void pass(int num){
		num = 10;
		System.out.println("num in pass method is: "+num);
	}
	
	public void changeI(IChange ch){
		System.out.println("changeI befor change: "+ch.i);
		ch.setI(50);
		System.out.println("changeI after change: "+ch.i);
	}
	public static void main(String[] args){
		int num = 100;
		System.out.println("befor pass method is: "+num);
		ArgsPassTest a = new ArgsPassTest();
		a.pass(num);
		System.out.println("after pass method is: "+num);
		IChange ch = new IChange();
		ch.setI(500);
		System.out.println("befor main i: "+ch.i);
		a.changeI(ch);
		System.out.println("after main i: "+ch.i);
	}
}

class IChange{

	int i;
	
	public void setI(int i){
		this.i = i;
	}
}
