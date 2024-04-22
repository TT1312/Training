package com.rentalcar;

public class Truck extends Vehical{
	
	private double cargoCapacity;
	private double isRentedWithDriver;

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public double getIsRentedWithDriver() {
		return isRentedWithDriver;
	}

	public void setIsRentedWithDriver(double isRentedWithDriver) {
		this.isRentedWithDriver = isRentedWithDriver;
	}

	public Truck(String vehicalID, String make, String model, int year, double rentleRate, double cargoCapacity, double isRentedWithDriver) {
		super(vehicalID, make, model, year, rentleRate);
		// TODO Auto-generated constructor stub
		this.cargoCapacity = cargoCapacity;
		this.isRentedWithDriver = isRentedWithDriver;
		
	}
	
	public double calculateRentalCost(int days) {
		return RentleRate * days;
	}

}
