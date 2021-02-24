package com.meritamerica.assignment1;

public class SavingsAccount {
	//Constructor
	SavingsAccount(double openingBalance){
		this.balance = openingBalance;
	}
	
	//Getters
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	//Withdraw method
	boolean withdraw(double amount) {
		if(amount<balance && amount>0) {
			balance-=amount;
			return true;
		}else {
			return false;
		}
	}
	
	boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}else {
			return false;
		}
	}
	
	double futureValue(int years) {
		return balance*Math.pow((1+interestRate), years);
	}

	@Override
	public String toString() {
		return "SavingsAccount Balance: " + balance + "\nInterestRate=" + interestRate;
	}
	
	//Instance variables
	private double balance;
	private double interestRate = 0.01; // 1%

}