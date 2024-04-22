package com.rentalcar;

public class MotorCycle extends Vehical{
	
	private double engineDisplacement;
	private boolean isHealmetProvided;

	public MotorCycle(String vehicalID, String make, String model, int year, double rentleRate, double engineDisplacement, boolean isHealmetProvided) {
		
		super(vehicalID, make, model, year, rentleRate);
		// TODO Auto-generated constructor stub
		
		this.engineDisplacement = engineDisplacement;
		this.isHealmetProvided = isHealmetProvided;
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public boolean isHealmetProvided() {
		return isHealmetProvided;
	}

	public void setHealmetProvided(boolean isHealmetProvided) {
		this.isHealmetProvided = isHealmetProvided;
	}
	
	public double calculateRentalCost(int days) {
		return RentleRate * days;
	}

}
