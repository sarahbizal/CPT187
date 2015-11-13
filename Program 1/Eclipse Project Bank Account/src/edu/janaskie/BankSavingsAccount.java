/**
 * FILE		:	BankSavingsAccount
 * PURP		:	Simulate a simple bank savings account that allows deposits and withdrawals
 * @author 		Sarah Janaskie
 *
 */


package edu.janaskie;

public class BankSavingsAccount 
{
	
	private String accountNumber;
	private double balance;
	private double rate;

	
	public BankSavingsAccount(String acctNo, double startingBalance, double startingRate)
	{
		accountNumber = acctNo;
		balance = startingBalance;
		rate = startingRate;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setAccountNumber(String newAcctNum)
	{
		accountNumber = newAcctNum; 
	}
	
	public void setRate(double newIntRate)
	{
		rate = newIntRate;
	}

	public void addToBalance(double amount)
	{
		balance +=amount;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void withdrawFromBalance(double amount)
	{
		balance -= amount;
	}
}
