package com.meritamerica.assignment1;
/*
 * File: CheckingAccount.java
 * --------------------------
 * A checking account has a balance, and an annual interest rate of 0.01%. 
 * It is possible to withdraw and deposit funds into the account which affects its balance. 
 * It is also possible to determine the future value of the account balance 
 * based on the interest calculation given N years.
 */

public class CheckingAccount {
	/*
	 * Default constructor makes sure that the opening balance is not negative
	 */
	CheckingAccount(double openingBalance) {
		setBalance(openingBalance);
	}
	
	//Getters
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	//Setters
	
	void setBalance(double amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	
	//Withdraw Method
	boolean withdraw(double amount) {
		if(amount<balance && amount>0) {
			balance-=amount;
			return true;
		}else {
			return false;
		}
	}
	
	//Deposit Method
	boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * * Future Value Method:
	 * --------------------
	 * The formula for future value is FV = PV(1+i) to the power of n
	 * FV: future value
	 * PV: present value
	 * i: interest rate
	 * n: number of periods/years
	 */
	
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