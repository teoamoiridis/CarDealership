package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	

	@PostMapping("/create")
	public BookingResponse createBooking(
			@RequestBody BookingRequest bookingRequest) throws Exception {
		return bookingService.createBooking(bookingRequest);
		
	}

}
