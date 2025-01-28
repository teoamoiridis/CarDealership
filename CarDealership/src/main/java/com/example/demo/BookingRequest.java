package com.example.demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingRequest {
	
	private LocalDate date;
	private LocalTime time;
	private Integer customer_id;
	private Integer car_id;
	
	
	
	public BookingRequest(LocalDate date, LocalTime time, Integer customer_id, Integer car_id) {
		this.date = date;
		this.time = time;
		this.customer_id = customer_id;
		this.car_id = car_id;
	}



	public LocalDate getDate() {return date;}
	public void setDate(LocalDate date) {this.date = date;}

	public LocalTime getTime() {return time;}
	public void setTime(LocalTime time) {this.time = time;}
	
	public Integer getCustomer_id() {return customer_id;}
	public void setCustomer_id(Integer customer_id) {this.customer_id = customer_id;}

	public Integer getCar_id() {return car_id;}
	public void setCar_id(Integer car_id) {this.car_id = car_id;}
	

}
