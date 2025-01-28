package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	
	
	public List<Car> getAllCars() throws Exception {
		return carRepository.findAll();
	}
	
	
	//throws unhandled exceptions
	public Car checkCarAvailability (Integer car_id) {
		Optional<Car> carOptional = carRepository.findById(car_id);
		
		if(carOptional.isEmpty()) {
			throw new CarNotFoundException("Car with ID " + car_id + " is not found.");
		}
		
		Car car = carOptional.get();
		if(car.getNumOfCars() < 1) {
			throw new CarNotAvailableException("Car with ID " + car_id + " is not available.");
		}
		else return car;
	}
	
	public Car reduceNumberOfCars (Car car) {
		car.setNumOfCars(car.getNumOfCars()-1);
		return carRepository.save(car);		
	}

		
	public BuyCarResponse buyCar(Integer car_id) {
		
		Car car = checkCarAvailability(car_id);
		reduceNumberOfCars(car);		
		return new BuyCarResponse(car_id, car.getNumOfCars());
	}

}