package com.carops.model;

public class Car {
	
	public Integer modelNumber;
	public String carMaker;
	public String carName;
	public String fuelType;
	public Car(Integer modelNumber, String carMaker, String carName, String fuelType) {
		super();
		this.modelNumber = modelNumber;
		this.carMaker = carMaker;
		this.carName = carName;
		this.fuelType = fuelType;
	}
	public Car() {
		super();
	}
	public Integer getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(Integer modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getCarMaker() {
		return carMaker;
	}
	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "CarModel [modelNumber=" + modelNumber + ", carMaker=" + carMaker + ", carName=" + carName
				+ ", fuelType=" + fuelType + "]";
	}
	
	
}
