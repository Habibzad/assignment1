package com.meritamerica.assignment1;
/**
 * This class contains the information pertaining to the account holder
 * @author Ahmad Habibzad
 *
 */
public class AccountHolder {
	//Default Constructor
	AccountHolder(){
		
	}
	//Parametarized Constructor
	/**
	 * 
	 * @param firstName First Name
	 * @param middleName Middle name
	 * @param lastName Last Name
	 * @param ssn	Social Security Number
	 * @param checkingAccountOpeningBalance
	 * @param savingsAccountOpeningBalance
	 */
	AccountHolder(
			String firstName, 
			String middleName, 
			String lastName, 
			String ssn, 
			double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn=ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	/* 
	 * =======
	 * Getters
	 * =======
	 */
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public CheckingAccount getCheckingAccount() {
		return new CheckingAccount(checkingAccountOpeningBalance);
	}
	
	public SavingsAccount getSavingsAccount() {
		return new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	/* 
	 * =======
	 * Setters
	 * =======
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
		
	//To String Method
	@Override
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName + "\n "
				+ "SSN: " + ssn + "\nChecking Account Balance: $" + checkingAccountOpeningBalance
				+ "\nSavings Account Balance: $" + savingsAccountOpeningBalance;
	}
	
	//instance variables
	private String firstName;
	private String middleName; 
	private String lastName; 
	private String ssn; 
	private double checkingAccountOpeningBalance; 
	private double savingsAccountOpeningBalance;
}