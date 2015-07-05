package com.briup.ch10;
	public class ThreadTest implements Runnable{
		
		/*A.sleep(1000)     InterruptedException
		B.sleep(1000)     InterruptedException
		C.Thread.sleep(1000)     RuntimeException
		D.Thread.sleep(1000)     InterruptedException*/
		
		public static void main(String[] args) {
			ThreadTest t = new ThreadTest();
			Thread tt = new Thread(t);
			tt.start();
		}
		public void run() {
//			for (int i = 0; i < 100; i++) {
			while(true){
				System.out.println("Hello!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
