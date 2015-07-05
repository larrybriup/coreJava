package com.briup.ch10;

public class BlockTest extends Thread {
	@Override
	public void run() {
		boolean stop = false;
		
		for(int i=0;i<10&&!stop;i++){
			if(i>5){
				stop=true;
			}
			System.out.println(getName()+" running and i= "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//				System.out.println("is interrupted:"+isInterrupted());
				
			}
//			Thread.currentThread().interrupt();
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		BlockTest test = new BlockTest();
		test.start();
		BlockTest test2 = new BlockTest();
		test2.start();
		
		try {
			test.join();
			boolean isAlive=Thread.currentThread().isAlive();
			System.out.println(Thread.currentThread().getName()+" is Alive:"+isAlive);
			test2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main over!");
		
	}
}
