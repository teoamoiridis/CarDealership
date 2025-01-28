package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	
	@GetMapping("/cars")
	public List<Car> getAllCars() throws Exception{
		return carService.getAllCars();
	}
	
	@PostMapping("/buy")
	public BuyCarResponse buyCar(
			@RequestParam Integer car_id) {
		return carService.buyCar(car_id);
	}
	

}
