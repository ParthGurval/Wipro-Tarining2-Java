package com.wipro.bankapp;

import java.util.Scanner;
/*
 * @Author: Shubham UI Developer
 * 
 * Desp: UI for End user 
 */

public class AtmUI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IBank bank = BankUtil.getObject();  // abstraction

		boolean flag = true;

		while (flag) {

			System.out.println("*****Welcome to SBI ATM*****");
			System.out.println("1. Deposit Cash");
			System.out.println("2. Withdraw Cash");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				// deposit

				bank.deposit();

				break;
			case 2:
				// withdraw

				bank.withdraw();

				break;
			case 3:

				flag = false;

				System.out.println("Thank You ! Visit Again...");

				break;

			default:

				System.err.println("Invalid Option");

				break;
			}

		}

	}

}
