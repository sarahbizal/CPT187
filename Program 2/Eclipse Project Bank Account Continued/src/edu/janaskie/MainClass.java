/**
 * FILE		:	MainClass
 * PURP		:	Simulate a real bank savings account using the class BankSavingsAccount
 * @author 		Sarah Janaskie
 *
 */

package edu.janaskie;

import java.util.Scanner;

public class MainClass 
{
	public static char getChar(Scanner input)
	{
		char inputChar = input.next().charAt(0);
		return Character.toUpperCase(inputChar);
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String customerName = "";
		char runDeposit = ' ';
		char runWithdrawl = ' ';
		
		
		BankSavingsAccount myAccount = new BankSavingsAccount("Z1234A", 5000.00, 0.003);
		double currentBalance;
		
		System.out.println("Thank you for choosing Carolina Banking! "
				+ "Please enter your first and last name.");
		
		customerName = input.nextLine();
		
		System.out.printf("Greetings %s!%n", customerName);
		
		currentBalance = myAccount.getBalance(); 
		System.out.printf("The initial blanace in this account is: %.2f%n", currentBalance);
		
		System.out.println("Would you like to make a deposit today? If yes, enter Y. If no, enter N.");
		runDeposit = getChar(input);
		
		while(runDeposit != 'N' && runDeposit != 'Y')
		{
			System.out.printf("\n%s", "This is an invalid entry. Please enter Y to enter a deposit or N to continue.");
			runDeposit = getChar(input);
		}
		
		if (runDeposit == 'Y')
		{
			System.out.printf("How much would you like to deposit today, %s?%n", customerName);
			double deposit = input.nextDouble();
			
			myAccount.addToBalance(deposit);
			System.out.printf("The new balance after deposit is %.2f%n", myAccount.getBalance());

		}
		
		System.out.println("Would you like to withdraw money from the account? If yes, enter Y. If no, enter N.");
		runWithdrawl = getChar(input);
		
		while (runWithdrawl != 'N' && runWithdrawl != 'Y')
		{
			System.out.printf("\n%s", "This is an invalid entry. Please enter Y to enter a deposit or N to continue.");
			runWithdrawl = getChar(input);
		}
		
		if (runWithdrawl == 'Y')
		{
			System.out.printf("How much would you like to withdraw, %s?%n", customerName);
			double withdrawl = input.nextDouble();
			
			myAccount.withdrawFromBalance(withdrawl);
			System.out.printf("The new balance after withdrawl is %.2f%n", myAccount.getBalance());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("FINAL CUSTOMER BANK TRANSACTION");
		System.out.printf("%-20s%10s%10s%n", "ACCOUNT NUMBER", "BALANCE", "RATE");
		System.out.printf("%-20s%10s%10s%n", "--------------", "-------", "----");
		System.out.printf("%-20s%10.2f%10.3f%n", myAccount.getAccountNumber(), myAccount.getBalance(), myAccount.getRate());  
	
		
		System.out.printf("%-10s%20s%20s%20s%n", "MONTH", "STARTING BALANCE", "INTEREST EARNED", "ENDING BALANCE");
		System.out.printf("%-10s%20s%20s%20s%n", "-----", "----------------", "---------------", "--------------");
		
		double startingBalance = 0.0;
		double endingBalance = 0.0;
		double interestEarned = 0.0;
		
		int month = 1;
		while (month <= 12)
		{
			startingBalance = myAccount.getBalance();
			applyInterest(myAccount);
			endingBalance = myAccount.getBalance();
			
			interestEarned = endingBalance - startingBalance;
			
			System.out.printf("%-10d%20.2f%20.2f%20.2f%n", month, startingBalance, interestEarned, endingBalance);
			month++; 
		}
	}
	
	public static void applyInterest(BankSavingsAccount theAccount)
	{
		double currentBalance = theAccount.getBalance();
		double currentRate = theAccount.getRate();
		double interestEarned = currentBalance * currentRate;
		theAccount.addToBalance(interestEarned);
	}

	
}
