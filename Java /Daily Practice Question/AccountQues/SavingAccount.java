package com.CreateOwnException.AccountQues;

public class SavingAccount {
	private static String account;
	private static String HolderName;
	private static double balance;
	
	public SavingAccount(String accountNo, String userName, double userBalance) {
		// TODO Auto-generated constructor stub
		this.account = accountNo;
		this.HolderName=userName;
		this.balance=userBalance;
		
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount + " is added in you account " + "And now your balance is : " + balance);
	}
	
	public  void withdraw(int money) {
		
		try {
			if( money > balance) {
				throw new InsufficientBalanceException("Kya kar Raha hai tu your Balance is Insufficient!!!  Listen pahele kama fir nikal paisa...Get Out ");
			}
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	public static String getAccount() {
		return account;
	}

	public static void setAccount(String account) {
		SavingAccount.account = account;
	}

	public static String getHolderName() {
		return HolderName;
	}

	public static void setHolderName(String holderName) {
		HolderName = holderName;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		SavingAccount.balance = balance;
	}

	
	

}
