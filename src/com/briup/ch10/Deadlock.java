package com.briup.ch10;
//互斥锁，死亡锁
public class Deadlock extends Thread {
	private Resource r1, r2;
	public Deadlock(Resource r1,Resource r2){
		this.r1=r1;
		this.r2=r2;
	}
	public void run() {
		if(getName().equals("Thread-1")){
			read();
		}else{
			write();
		}
		
	}

	public int read() {
		synchronized (r1) {
			int v1 = r1.value;
			synchronized (r2) {
				int v2 = r2.value;
				return v1 + v2;
			}
		}
	}

	public void write() {
		synchronized (r2) {
			r2.value = 100;
			synchronized (r1) {
				r1.value = 200;
			}
		}
	}
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
//		Resource r3 = new Resource();
		new Deadlock(r1,r2).start();
		new Deadlock(r1,r2).start();
	}
}

class Resource {
	public int value;
}