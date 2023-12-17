package com.carops.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carops.Repository.CarRepository;
import com.carops.model.Car;

@Service
public class CarServicesImpl implements CarServices{

	@Autowired
	CarRepository carRepository;
	
	@Override
	public List<Car> getAllCars() {
		return carRepository.getAllCars();
	}

	@Override
	public Car getModelNumber(Integer modelNumber) {
		return carRepository.getModelNumber(modelNumber);
	}

	@Override
	public Car addCar(Car car) {
		return carRepository.addCar(car);
	}

	@Override
	public void updateCar(Car car) {
		carRepository.updateCar(car);
		
	}

	@Override
	public void deleteCar(Integer modelNumber) {
		carRepository.deleteCar(modelNumber);
		
	}

}
