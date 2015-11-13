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

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String customerName = "";
		
		BankSavingsAccount myAccount = new BankSavingsAccount("Z1234A", 0.0, .005);
		double currentBalance;
		
		System.out.println("Thank you for choosing Carolina Banking! "
				+ "Please enter your first and last name.");
		
		customerName = input.nextLine();
		
		System.out.printf("Greetings %s! How much money would you like to deposit in order to start your account?%n", customerName);
		double deposit = input.nextDouble();
		
		currentBalance = myAccount.getBalance(); 
		System.out.printf("The initial blanace in this account is: %.2f%n", currentBalance);
		
		myAccount.addToBalance(deposit);
		System.out.printf("The new balance after deposit is %.2f%n", myAccount.getBalance());
		
		System.out.println("Would you like to withdraw money from the account? (If no, just enter 0)");
		double withdrawl = input.nextDouble();
		
		myAccount.withdrawFromBalance(withdrawl);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("FINAL CUSTOMER BANK TRANSACTION");
		System.out.println("ACCOUNT NUMBER			BALANCE			RATE");
		System.out.println("---------------			-------			----");
		System.out.printf("%s 				%.2f 			%.2f%n", myAccount.getAccountNumber(), myAccount.getBalance(), myAccount.getRate());  
	}
	
	public static void applyInterest(BankSavingsAccount theAccount)
	{
		double currentBalance = theAccount.getBalance();
		double currentRate = theAccount.getRate();
		double interestEarned = currentBalance * currentRate;
		theAccount.addToBalance(interestEarned);
	}

}
