package com.rentalcar;

public class Vehical {
	
	private String make;
	private String model;
	private int year;
	protected double RentleRate;
	private String VehicalID;
	
	public Vehical(String vehicalID, String make, String model, int year, double rentleRate) {
		super();
		this.VehicalID = vehicalID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.RentleRate = rentleRate;
		}
	
	public boolean checkAvailbility() {
		return true;
	}
	
	public double calculateRentalCost(int days) {
		return getRentleRate() * days;
	}

	public double getRentleRate() {
		return RentleRate;
	}

	public void setRentleRate(double rentleRate) {
		RentleRate = rentleRate;
	}
	
	

}
