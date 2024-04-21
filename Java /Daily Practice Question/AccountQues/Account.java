package com.CreateOwnException.AccountQues;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount user1 = new SavingAccount("1234","Tushar", 50000);
		user1.deposit(5000);
		user1.withdraw(500000);
		
		
		SavingAccount user2 = null;
		user2.setAccount("2345");
		user2.setBalance(457273);
		user2.setHolderName("Nik");
		
		
		
		

	}

}
