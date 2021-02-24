package com.meritamerica.assignment1;

public class CheckingAccount {
	//Default Constructor
	CheckingAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
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
		}
		else {
			return false;
		}
	}
	
	double futureValue(int years) {
		return balance*Math.pow((1+interestRate), years);
	}
	
	//To String Method
	@Override
	public String toString() {
		return 
				"Checking Account Balance: " + balance + 
				"\nChecking Account InterestRate: " + interestRate + 
				"Checking Account Balance in 3 years: ";
	}
	
	//Instance variables
	private double balance;
	private double interestRate = 0.0001; //0.01%	
	
}