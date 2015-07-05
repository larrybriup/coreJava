package com.briup.ch10;

public class Girl extends Thread {
	private Account account;

	public Girl(Account account, String name) {
		this.account = account;
		this.setName(name);
		this.start();
	}

	public void run() {
		while (true) {
			 double money=Math.random()*10000;
			account.withdraw(money);
			try {
				Thread.sleep((long) money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
