package com.carops.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carops.model.Car;

@Service
public interface CarServices {
	
	public List<Car> getAllCars();
	public Car getModelNumber(Integer modelNumber);
	public Car addCar(Car car);
	public void updateCar(Car car);
	public void deleteCar(Integer modelNumber);
}
