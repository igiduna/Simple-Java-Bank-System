package main;

import java.util.Scanner;

public class Money extends Account{
	
	static Scanner scnr = new Scanner(System.in);
	static Account a = new Account();
	public float deposit, withdraw;

	Money(String accountName, float balance, float deposit, float withdraw){
		super(accountName, balance);
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	
	public Money() {
	}
	public float deposit() {
		a.depositAccount();
		System.out.print("Deposit Money: ");
		deposit = scnr.nextFloat();
		System.out.println("Deposited: " + deposit);
		a.balance += deposit;
		System.out.println("Your Balance: " + a.balance);
		return a.balance;
	}
	public float withdraw() {
		a.withdrawAccount();
		System.out.print("\nWithdraw Money: ");
		withdraw = scnr.nextFloat();	//WITHDRAW AMOUNT
		while(withdraw > a.balance) {
			System.out.println("Insufficient Money.");
			System.out.print("\nWithdraw Money: ");
			withdraw = scnr.nextFloat();
		}
		System.out.println("Money Withdrew: " + withdraw);
		a.balance -= withdraw;
		return a.balance;
	}
}
