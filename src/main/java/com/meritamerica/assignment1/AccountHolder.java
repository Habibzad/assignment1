package com.meritamerica.assignment1;
/**
 * This class contains the information pertaining to the account holder
 * @author Ahmad Habibzad
 *
 */
public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	//Default Constructor
	AccountHolder(){}
	//Parametarized Constructor
	public AccountHolder(
			String firstName, 
			String middleName, 
			String lastName, 
			String ssn,
			double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance) 
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	//Getters and Setters	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	//ToString Method
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMaximumFractionDigits(8);
		return " Name: " + firstName + " " + middleName + " " + lastName
				+"\n SSN: " + ssn 
				+"\n CheckingAccount Balance: $" + checkingAccount.getBalance() 
				+"\n CheckingAccount Interest Rate: " +df.format(checkingAccount.getInterestRate())  
				+"\n CheckingAccount Balance in 3 Years: " + df.format(checkingAccount.futureValue(3)) 
				+"\n SavingsAccount Balance: $" + savingsAccount.getBalance()
				+"\n SavingsAccount Interest Rate: " + savingsAccount.getInterestRate()
				+"\n SavingsAccount Balance in 3 years: " + df.format(savingsAccount.futureValue(3));
	}
}
