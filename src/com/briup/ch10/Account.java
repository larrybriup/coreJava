package com.briup.ch10;

public class Account {
	private double balance;

	// public Account(){}
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	synchronized public void withdraw(double amount) {
		while (amount > balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		balance -= amount;
		System.out.println(Thread.currentThread().getName() + " consume "
				+ amount + "￥ and balance is " + balance);
	}

	synchronized public void deposit(double amount) {
		balance+=amount;
		System.out.println(Thread.currentThread().getName() + " earn "
				+ amount + "￥ and balance is " + balance);
		notifyAll();
	}
}
