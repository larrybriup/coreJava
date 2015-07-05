package com.briup.ch07;

public class Account {
  private double balance;//余额
  private int id;
  public Account(){}
/**
 * @param balance
 * @param id
 */
public Account(double balance, int id) {
	super();
	this.balance = balance;
	this.id = id;
}
public void withdraw(double amount){//amount是总额，本利和的意思
	assert amount<balance:"amount is invalid,please checked!";
	balance-=amount;
}
public void deposit(double amount) throws AccountException{
	if(amount<0){
		throw new AccountException("amount is invalid in deposit action");
	}else
		balance+=amount;
}
public static void main(String[] args) {
	Account account = new Account(2000,12345);
    account.withdraw(100000);
    
    try {
    	account.deposit(-10);
    	//System.out.println(Account.balance);
	} catch (AccountException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    
	
	
	
}
}
