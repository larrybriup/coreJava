package com.briup.ch05;

public class ParameterPass{
	// 方法的参数列表中的变量都是此方法的局部变量
	public void change(int i){
		i = 100;
		System.out.println("i in change(int i)="+i);
	}

	public void changeIntA(IntA intA){
		intA.i = 1000;
		System.out.println("i in changeIntA="+intA.i);
	}


	public static void main(String[] args){
		ParameterPass parpass = 
			new ParameterPass();
		int i = 1;
		parpass.change(i);
		System.out.println(" after change(int) i="+i);
		
		IntA intA = new IntA(999);
		parpass.changeIntA(intA);
		System.out.println("after changIntA() intA.i="+intA.i);
	}
}

class IntA{
	public int i;
	public IntA(int i){
		this.i = i;
	}
	public IntA(){}

	public void setI(int i){
		this.i = i;
	}
	public int getI(){
		return i;
	}
}
