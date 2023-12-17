package com.carops.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.carops.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository{

	List<Car> list;
	public List<Car> getCarList() {
		list = new ArrayList<>();
		list.add(new Car(258741, "Suzuki", "Vitara", "Petrol"));
		list.add(new Car(258963, "Citreon", "C3", "Diesel"));
		list.add(new Car(369741, "Mahindra", "Scorpio", "Petrol"));
		list.add(new Car(102345, "Toyota", "Innova", "Diesel"));
		list.add(new Car(547896, "Toyota", "Fortuner", "CNG"));
		return list;
	}
	
	@Override
	public List<Car> getAllCars() {
		
		return getCarList();
	}

	@Override
	public Car getModelNumber(Integer modelNumber) {
		Car cr = null;
		list = getCarList();
		cr = list.stream().filter(c->c.getModelNumber()== modelNumber).findAny().get();
		return cr;
	}

	@Override
	public Car addCar(Car car) {
		list = getCarList();
		list.add(car);
		return car;
	}

	@Override
	public void updateCar(Car car) {
		List<Car> cars = getCarList();
			for (Car cr : cars) {
				if (cr.getModelNumber()== car.getModelNumber()) {
					if(car.getCarName()!= null) {
						cr.setCarName(car.getCarName());
					}
					if(car.getCarMaker()!= null) {
						cr.setCarMaker(car.getCarMaker());
					}
					if(car.getFuelType()!= null) {
						cr.setFuelType(car.getFuelType());
					}
				}
			}
		
	}

	@Override
	public void deleteCar(Integer modelNumber) {
		List<Car> car = getCarList();
		Car cr = null;
		for(Car c : car) {
			if(c.getModelNumber() == modelNumber) {
				cr = c;
			}
		}
		car.remove(car.indexOf(cr));
	}

	

	
}
