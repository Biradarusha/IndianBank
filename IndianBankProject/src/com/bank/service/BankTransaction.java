package com.bank.service;

import java.util.Scanner;

import com.bank.model.Customer;

public class BankTransaction {
	
	public void deposite(Customer customer, double Amount){
		
		
		double final_bal=customer.getBalance()+Amount;
		
		customer.setBalance(final_bal);
		
		
	}
	public boolean withdraw(Customer customer,double Amount){
		
		double bal=customer.getBalance();
		if(bal>=Amount) {
			bal=bal-Amount;
			customer.setBalance(bal);
			return true;
		}
		
		return false;
		
	}
	
	public boolean transfer(Customer sender,Customer receiver, double Amount){
		/*OTPGenerator gen=new OTPGenerator();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter OTP");
		int otp=scan.nextInt();
		if(otp==gen.generateOTP()) {*/
		double bal=sender.getBalance();
		if(bal>=Amount) {
			bal=bal-Amount;
			sender.setBalance(bal);
			bal=receiver.getBalance()+Amount;
			receiver.setBalance(bal);
			return true;
		}
		//}
		return false;
	}

}
