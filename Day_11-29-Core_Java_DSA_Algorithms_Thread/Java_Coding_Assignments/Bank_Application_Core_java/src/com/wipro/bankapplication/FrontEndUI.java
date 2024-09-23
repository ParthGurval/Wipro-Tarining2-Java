package com.wipro.bankapplication;

public class FrontEndUI {

	public static void main(String[] args) {
		
        // instances of concrete implementations
        BankAccount savingsAccount = new SavingsAccount(500);
        BankAccount checkingAccount = new CheckingAccount(300);

        // BankAccountManager for each account type
        BankAccountManager savingsManager = new BankAccountManager(savingsAccount);
        BankAccountManager checkingManager = new BankAccountManager(checkingAccount);

        // Front-end simulation
        System.out.println("Savings Account:");
        savingsManager.deposit(150);  // Valid
        savingsManager.withdraw(50);  // Not supported

        System.out.println("\nChecking Account:");
        checkingManager.deposit(100); // Not supported
        checkingManager.withdraw(50); // Valid

        System.out.println("\nBalance Check:");
        System.out.println("Savings Account Balance: Rs." + savingsManager.getBalance());
        System.out.println("Checking Account Balance: Rs." + checkingManager.getBalance());
    }
}
