package com.polymerphismBank;

public class SBI extends BankVariable {
	float getBankInterest() {
		return 8.1f;
	}

	@Override
	public String toString() {
		return "SBI getBankInterest = " + getBankInterest() ;
	}

	
}
