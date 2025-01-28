package com.example.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private CustomerService customerService;

	
	
	public BookingResponse createBooking(BookingRequest bookingRequest) throws Exception {
		Integer car_id = bookingRequest.getCar_id();
		Integer customer_id = bookingRequest.getCustomer_id();
		LocalDate date = bookingRequest.getDate();
	    LocalTime time = bookingRequest.getTime();
	    Customer customer = customerService.getCustomer(customer_id);
	    
	    Car car = carService.checkCarAvailability(car_id);
	    
	    if (!checkBookingAvailability(date,time)) {
	    	throw new BookingUnavailableException("There is already a Booking for the chosen Date and Time.");
	    }
	    else {
	    	Car updatedCar = carService.reduceNumberOfCars(car);
			Booking booking = bookingRepository.save(new Booking(customer, updatedCar, date, time));
			return new BookingResponse(
					booking.getId(), date, time, customer_id, car_id);
		}
		
	}
	
	public boolean checkBookingAvailability(LocalDate date, LocalTime time) throws Exception{
		List<Booking> existingBookings = bookings();
		
	    for (Booking existingBooking : existingBookings) {
	        if (existingBooking.getDate().isEqual(date) &&
	        	existingBooking.getTime().equals(time)) {
	            return false;
	        }
	    }
        return true;
	}
	
	public List<Booking> bookings() throws Exception{
		return bookingRepository.findAll();
	}
	

}