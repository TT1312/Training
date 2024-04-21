package com.polymerphismBank;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankVariable bank;
		bank = new SBI();
		System.out.println(bank);
		
		bank = new ICICI();
		System.out.println(bank);

	}

}
