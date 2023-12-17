package com.carops.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.carops.model.Car;

@Repository
public interface CarRepository {
	
	public List<Car> getAllCars();

	public Car getModelNumber(Integer modelNumber);

	public Car addCar(Car car);

	public void updateCar(Car car);

	public void deleteCar(Integer modelNumber);
}
