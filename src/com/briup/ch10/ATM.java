package com.briup.ch10;

public class ATM {
public static void main(String[] args) {
	Account account = new Account(1000);
	Boy boy = new Boy(account, "jack");
	Girl lili = new Girl(account, "lili");
	lili.setPriority(Thread.MAX_PRIORITY);
	Girl yanyan = new Girl(account, "yanyan");
	
	
}
}
