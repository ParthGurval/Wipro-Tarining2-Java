package com.wipro.bankapplication;

public class BankAccountManager {
	
    private BankAccount bankAccount;

    public BankAccountManager(BankAccount bankAccount) {
    	
        this.bankAccount = bankAccount;
    }

    public void deposit(double amount) {
    	
        bankAccount.deposit(amount);
    }

    public void withdraw(double amount) {
    	
        bankAccount.withdraw(amount);
    }

    public double getBalance() {
    	
        return bankAccount.getBalance();
    }
}
