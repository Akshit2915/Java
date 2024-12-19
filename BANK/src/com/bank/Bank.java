package com.bank;

abstract public class Bank {

	String account_holder_name;
	double balance;

	public Bank(String account_holder_name,double balance) {
    this.account_holder_name=account_holder_name;
    this.balance=balance;
	}

	public abstract void deposite(double ammount);

	public abstract void widthdrawal(double ammount);

	public void displaybalance() {
		System.out.println(account_holder_name);
		System.out.println(balance);
	}
}
