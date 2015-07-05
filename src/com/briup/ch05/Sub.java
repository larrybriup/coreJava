package com.briup.ch05;

public class Sub extends Super{

	private String desc;
	/*
	this调用本类构造器补能和super调用父类构造器同时在一个构造器中显式出现
	可以隐式的调用super的默认构造器；
	public Sub(){
		super();
		this("this.is desc for sub");
	}
	public sub(String desc){
		this.desc = desc;
	}
	*/
	public void show(){
		//num = 10;
		setNum(10);
		str = "fdfsa";
		flag = true;
		salary = 10000.5;
		super.print();
		desc = "this is sub's desc";
		System.out.println("and desc is"+desc);
	}
	public static void main(String[] args){
		Sub s = new Sub();
		s.show();
		s.flag = false;
		s.print();
	}
}
