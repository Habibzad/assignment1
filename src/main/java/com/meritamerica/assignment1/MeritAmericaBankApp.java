package com.meritamerica.assignment1;
/*
 * File: MeritAmericaBankApp.java
 * ------------------------
 * This program allows account holders to have 1 checking account 
 * and 1 savings account. 
 */
public class MeritAmericaBankApp {
	public static void main(String[] Args) {
		AccountHolder someOne = new AccountHolder("John", "M", "Doe", "555-63-6985", 100,1000);
		System.out.println(someOne);
	}
}