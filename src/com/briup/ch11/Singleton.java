package com.briup.ch11;

public class Singleton {
	/*volatile,�P�I����Ҫ�������Ǳ��σȴ�׃���r�ڴ惦����
	 * ����ʹ�þ��攵����
	 * ��һ���p�������i��
	 * ��Ҫ��������׃����
	 * */
	private volatile static Singleton ton;
	private Singleton(){
		
	}
synchronized public static  Singleton getInstance(){
	if(ton==null)
		ton=new Singleton();
	return ton;
		
	}
public static void main(String[] args) {
	
}
}
