package com.bank.model;

public class Customer  {
	private String bankaccno; 
	private String pword;
	private double balance;
	
	public void setBankaccno(String bankaccno){
		this.bankaccno=bankaccno;
	}
	public String getBankaccno(){
		return bankaccno;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer(String bankaccno, String pword, double balance) {
		super();
		this.bankaccno = bankaccno;
		this.pword = pword;
		this.balance = balance;
	}
	
	
	

}
