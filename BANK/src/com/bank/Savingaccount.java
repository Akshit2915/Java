package com.bank;

public class Savingaccount extends Bank {

	protected double interest = 0.03;
    
	Savingaccount(String account_holder_name,double ammount){
		super("kk",8000);
	}
	
	@Override
	public void deposite(double ammount) {
		balance = balance + ammount;
		System.out.println(ammount +   "ammount is succesfully deposited");
		System.out.println("total balance is :" +  balance);

	}

	@Override
	public void widthdrawal(double ammount) {
		if (balance - ammount >= 0) {
			balance = balance - ammount;
			System.out.println("widthdrawal ammount is :" +   ammount);
			System.out.println("total balance is :" + balance);
		} else {
			System.out.println("insuffisient balance");
		}

	}

	public void applyIntrest() {

		balance = balance * interest;

	}
    }

