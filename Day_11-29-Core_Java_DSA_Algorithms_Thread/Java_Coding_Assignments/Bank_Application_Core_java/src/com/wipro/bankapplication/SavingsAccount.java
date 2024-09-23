package com.wipro.bankapplication;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
    	
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
    	
        if (amount > 0) {
        	
            balance += amount;
            
            System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
            
        } 
        
        else {
        	
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
    	
        System.out.println("Withdrawal not supported for SavingsAccount.");
    }
}
