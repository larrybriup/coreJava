package com.briup.ch10;

public class Animal extends Thread {
	private int s;
	private int v;
	
	public void run() {
		while(true){//dead loop
			v=(int)(Math.random()*10);
			s+=v;
			System.out.println("Now is "+Thread.currentThread().getName()+"and v is "+v+" and s is "+s);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(s>=500){
				System.out.println("Winner is :"+this.getName());
				//stop();//过时的方法
				System.exit(1);
			}
		}
	}
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setPriority(Thread.MAX_PRIORITY);
		System.out.println(dog.isDaemon());
		dog.setDaemon(true);
		dog.setName(" oude ");
		Animal pig = new Animal();
		pig.setPriority(Thread.MAX_PRIORITY);
		//dog.start();
		dog.start();
		pig.start();
		
	}
}











