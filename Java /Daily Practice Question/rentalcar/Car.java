package com.rentalcar;

public class Car extends Vehical{
	
	private int numSeats;
	private String fuelType;
	
	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelTyoe(String fuelType) {
		this.fuelType = fuelType;
	}

	public Car(String vehicalID, String make, String model, int year, double rentleRate, int numSeats, String fuelType) {
		super(vehicalID, make, model, year, rentleRate);
		// TODO Auto-generated constructor stub
		this.numSeats = numSeats;
		this.fuelType = fuelType;
	}
	
	public double calculateRentalCost(int days) {
		return RentleRate * days;
	}
	
	
	

}
