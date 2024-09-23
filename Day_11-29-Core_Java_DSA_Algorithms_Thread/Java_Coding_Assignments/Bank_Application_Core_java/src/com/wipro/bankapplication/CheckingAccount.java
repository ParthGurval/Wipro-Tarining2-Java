package com.wipro.bankapplication;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
    	
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
    	
        System.out.println("Deposit not supported for CheckingAccount.");
    }

    @Override
    public void withdraw(double amount) {
    	
        if (amount > 0 && amount <= balance) {
        	
            balance -= amount;
            
            System.out.println("Withdrew Rs." + amount + ". New balance: Rs." + balance);
            
        } 
        
        else {
        	
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
