package com.carops.CarController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carops.Services.CarServices;
import com.carops.model.Car;
	
@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	CarServices carServices;
	
	@GetMapping("/allCars")
		public ResponseEntity<List<Car>> getAllCars() {
		List<Car> list = carServices.getAllCars();
		return ResponseEntity.ok(list);
			
	}
	
	@GetMapping("/{modelNumber}")
		public ResponseEntity<Car> getModelNumber(@PathVariable Integer modelNumber) {
		Car car = carServices.getModelNumber(modelNumber);
		return ResponseEntity.ok(car);
	}
	
	@PostMapping("/addCar")
		public ResponseEntity<Car> addCar(@RequestBody Car car) {
		Car c = carServices.addCar(car);
		return ResponseEntity.ok(c);
	}
	
	@PutMapping("/Update")
		public ResponseEntity updateCar(@RequestBody Car car) {
		carServices.updateCar(car);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/delete/{id}")
		public ResponseEntity deleteCar(@PathVariable Integer modelNumber) {
		carServices.deleteCar(modelNumber);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
}
