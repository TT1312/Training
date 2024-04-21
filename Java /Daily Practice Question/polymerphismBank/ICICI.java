package com.polymerphismBank;

public class ICICI extends BankVariable {
	float getBankInterest() {
		return 9.7f;
	}

	@Override
	public String toString() {
		return "ICICI getBankInterest = " + getBankInterest() ;
	}

}
