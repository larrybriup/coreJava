package com.briup.ch05;

public class OverLoadTest{

	public void print(int i){
		System.out.println("print(int)");
	}
	
	public int print(short s){
		System.out.println("print(short)");
		return 0;
	}
	
	public void print(Object obj){
		System.out.println("print(Object)");
	}
	
	public void print(String str){
		System.out.println("print(String)");
	}

	public void print(int a ,int b){
                System.out.println("print(int a,int b)");
        }
	
	public void print(int a ,double b){
                System.out.println("print(int a,double b)");
        }

	public void print(double b,int a){
                System.out.println("print(double b,int a)");
        }
	
	public void print(Student p){
		System.out.println("print(Student P)");
	}	
	public static void main(String[] args){
		OverLoadTest olt = new OverLoadTest();
		byte b = 10;
		olt.print(b);
		char c = 'a';
		olt.print(c);
		double d = 0.01;
		olt.print(d);
		long l = 254L;
		olt.print(l);
		olt.print(new Student("",12));
//		olt.print(null);
	}

}
