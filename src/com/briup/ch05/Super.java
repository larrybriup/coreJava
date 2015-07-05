package com.briup.ch05;

public class Super{

	private int num;
	protected String str;
	public boolean flag;
	double salary;
	
	public Super(){
		
	}

	public Super(int num,String str){
		this.num = num;
		this.str = str;
	}
	
	public void setNum(int num){
		this.num = num;
	}

	public void print(){
		System.out.println("num = "+num+"\tstr = "+str+"\tsalary = "+salary+"\tflag = "+flag);
	}
}
