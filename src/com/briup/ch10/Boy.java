package com.briup.ch10;

public class Boy implements Runnable {
private Account account;
public Boy(Account account,String name){
this.account = account;
Thread t = new Thread(this);
t.setName(name);
t.start();

}
	public void run() {
		while(true){
			double money=Math.random()*10000;
			account.deposit(money);
			try {
				Thread.sleep((long)money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	 
}
