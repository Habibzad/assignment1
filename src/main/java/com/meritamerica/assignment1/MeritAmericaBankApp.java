package com.meritamerica.assignment1;
/*
 * File: MeritAmericaBankApp.java
 * ------------------------
 * This program allows account holders to have 1 checking account 
 * and 1 savings account. 
 */
public class MeritAmericaBankApp {
	public static void main(String[] Args) {
		AccountHolder accountHolder1 = new AccountHolder("John", "M", "Doe", "555-63-6985", 100,1000);
		System.out.println(accountHolder1);
		accountHolder1.getCheckingAccount().deposit(500);
		accountHolder1.getSavingsAccount().withdraw(800);
		accountHolder1.getCheckingAccount().futureValue(3);
		accountHolder1.getSavingsAccount().futureValue(3);
		System.out.println("========================================");
		AccountHolder accountHolder2 = new AccountHolder("Lisa", "", "Jphnson", "888-52-0052", 200,500);
		accountHolder2.getCheckingAccount().deposit(500);
		accountHolder2.getSavingsAccount().withdraw(600);
		System.out.println(accountHolder2);
	}
}