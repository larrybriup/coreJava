package com.briup.ch10;

import java.util.concurrent.ThreadFactory;

public class Animal2 implements Runnable{
	private int s;
	private int v;
	public void run() {
		// TODO Auto-generated method stub
		while(true){//dead loop
			v=(int)(Math.random()*10);
			s+=v;
			System.out.println("Now is "+Thread.currentThread().getName()+"and v is "+v+" and s is "+s);
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(s>500){
				System.out.println("Winner is :"+Thread.currentThread().getName());
				//stop();//过时的方法
				System.exit(1);
			}
		}
	}
	public static void main(String[] args) {
		Thread dog = new Thread(new Animal2());
		dog.setName(" oude ");
		Thread pig = new Thread( new Animal2());
		dog.start();
		pig.start();
//		new Thread(dog).start();
//		new Thread(pig).start();
	}

}
