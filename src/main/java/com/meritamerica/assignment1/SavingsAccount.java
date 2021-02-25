package com.meritamerica.assignment1;
/*
 * File: SavingsAccount.java
 * -------------------------
 * Requirements:
 * A savings account has a balance, and an annual interest rate of 1.00%. 
 * It is possible to withdraw and deposit funds into the account which affects its balance. 
 * It is also possible to determine the future value of the account balance 
 * based on the interest calculation given N months.
 * 
 * It should not be possible to withdraw a negative amount 
 * nor more than the available balance in a bank account. 
 * It should not be possible to deposit a negative amount.
 */

public class SavingsAccount {
	/*
	 * Default constructor makes sure that the opening balance is not negative
	 */
	SavingsAccount(double openingBalance){
		setBalance(openingBalance);
	}
	
	//Getters
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	//Setter
	
	void setBalance(double amount) {
		if(amount>0) {
			balance+=amount;
		}
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
	//Deposit method
	boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * Future Value Method:
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

	@Override
	public String toString() {
		return "SavingsAccount Balance: " + balance + "\nInterestRate=" + interestRate;
	}
	
	//Instance variables
	private double balance;
	private double interestRate = 0.01; // 1%

}