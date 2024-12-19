package com.bank;

public class Currentaccount extends Bank {

	public Currentaccount(String account_holder_name, double balance) {
		super(account_holder_name, balance);
		
	}

	private double overdraftlimit = 5000;
  
	@Override
	public void deposite(double ammount) {
		balance = balance + ammount;
		System.out.println(ammount +    
		  "is succesfully deposite in your account");
		System.out.println(balance);

	}

	@Override
	public void widthdrawal(double ammount) {
		if (balance - ammount >= -overdraftlimit) {
			balance = balance - ammount;

			System.out.println("total balance is :" +  balance);

		} else {
			System.out.println("overdraftlimit exceed");
		}
	}

}
