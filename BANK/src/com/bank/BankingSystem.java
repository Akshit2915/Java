package com.bank;

public class BankingSystem {

	public static void main(String[] args) {
		Bank saving = new Savingaccount("kk",8000);
		Bank curr = new Currentaccount("suchit",8900);

//		//saving.account_holder_name = "kk";
//		saving.balance = 5000;
		saving.displaybalance();

	saving.deposite(5000);
	saving.widthdrawal(9999);
	}

}
