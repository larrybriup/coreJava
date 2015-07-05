package com.briup.ch11;

public class Singleton {
	/*volatile,關鍵字主要的作用是保障內存變量時期存儲數據
	 * 不會使用緩存數據，
	 * 是一把輕量級的鎖，
	 * 主要操作的是變量，
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
