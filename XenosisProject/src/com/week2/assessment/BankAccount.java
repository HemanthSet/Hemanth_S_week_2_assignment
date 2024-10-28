package com.week2.assessment;

public class BankAccount {

	private double balance;

	public BankAccount(double initialBalance) {

		this.balance = initialBalance;

	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}

		else {
			System.out.println("Insufficient Balance.");
		}

	}

	public void withdrawl(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}

		else {
			System.out.println("Insufficient Balance.");
		}

	}

	public void displayBalance() {

		System.out.println("Current Balance: " + balance);

	}

	public static void main(String[] args) {

		BankAccount obj = new BankAccount(10000);
		obj.displayBalance();
		obj.deposit(500);
		obj.displayBalance();
		obj.withdrawl(200);
		obj.displayBalance();

	}

}
