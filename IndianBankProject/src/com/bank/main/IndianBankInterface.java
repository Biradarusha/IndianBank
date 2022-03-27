package com.bank.main;

import java.util.Scanner;

import com.bank.model.Customer;
import com.bank.service.BankTransaction;

public class IndianBankInterface {
	static Customer customer=new Customer("HDFC1011","Ramesh@123",1000);
	 static Customer customer1=new Customer("Axis1980","Swati@123",2000);
	 static BankTransaction transaction=new BankTransaction();
	
	public static void main(String[] args) {
		double Amount;
		
		
		//Enter Account no and password
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Account no");
		String accountno=scan.nextLine();
		System.out.println("Enter your password");
		String password=scan.nextLine();
		//call validate method to check credentials
		int option;
		String choice;
		if(validate(accountno,password, customer)){
			do {
			showMenu();
			option=scan.nextInt();
			scan.nextLine();
			switch(option) {
			case 1:System.out.println("Enter amount to be deposite");
	 				Amount=scan.nextInt(); 
	 				transaction.deposite(customer,Amount);
					System.out.println("Your Final balance::"+customer.getBalance());
					break;
					
			case 2:System.out.println("Enter amount to be Withdrawn");
			 		Amount=scan.nextInt(); 
			 		if(transaction.withdraw(customer, Amount))
					System.out.println("Your Final balance::"+customer.getBalance());
					else
						System.out.println("Insufficient Amount in Account");
			   break;
			case 3: System.out.println("Enter account no of receiver");
					String acc_no=scan.nextLine();
					System.out.println("Enter amount to be trasfered");
					 Amount=scan.nextInt();
					if(acc_no.equals(customer1.getBankaccno())) {
					if(transaction.transfer(customer,customer1,Amount))
					System.out.println("Your Final balance::"+customer.getBalance());
					else
					System.out.println("Insufficient Amount in Account");
					}
					else
						System.out.println("Wrong Receiver's Account no");
					break;
			case 0: break;	
			
			}
			System.out.println("Do you want to do any other transaction");
			 choice=scan.nextLine();
			}while(choice.equals("yes"));
		}
		else
			System.out.println("Wrong Account number or Password");
		
	}
	
	private static boolean validate(String accountno, String password,Customer customer) {
		if(customer.getBankaccno().equals(accountno) && customer.getPword().equals(password)) {
			return true;
		}
		return false;
	}
	
	private static void showMenu() {
		
			
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawl");
			System.out.println("3. Transfer");
			System.out.println("0. Logout");
			System.out.println("-----------------------------------------------");
	}

}

