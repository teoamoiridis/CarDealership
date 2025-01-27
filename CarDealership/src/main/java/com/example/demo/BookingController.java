package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	

	@PostMapping("/create")
	public Booking createBooking(
			@RequestParam() int car_id,
			@RequestBody Customer customer) {
		return bookingService.createBooking(car_id, customer);
		
	}

}
