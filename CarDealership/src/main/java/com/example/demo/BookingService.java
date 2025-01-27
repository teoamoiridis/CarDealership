package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	public Booking createBooking(int car_id, Customer customer) {
		Booking customBooking = checkBooking(car_id, customer);
		Optional<>
		
	}
	
	public Booking checkBooking(Car car_id, Customer customer) {
		if(numberofcars >0) {
			Booking customBooking = new Booking(car_id,customer);
		}
	}
	

}