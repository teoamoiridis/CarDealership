package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Car {
	
	@Id
	@GeneratedValue
	private Integer id;                   //Car Table represents physical copy of Car and also Car model
	private String brand;                 //Weak Entity should be added in the future
	private String model;
	private String fuel;
	private String engine;
	private int seats;
	private int price;
	private String moreInfo;
	private int numOfCars;
	
	@OneToMany(mappedBy = "car")
    private List<Booking> bookings;
	
	@ManyToOne
	@JoinColumn(name = "dealership_id", referencedColumnName = "id")
	private Dealership dealership;

	
	
	public Car() {
	}
	
	
	public Car(String brand, String model, String fuel, String engine, int seats, int price, String moreInfo,
			int numOfCars) {
		this.brand = brand;
		this.model = model;
		this.fuel = fuel;
		this.engine = engine;
		this.seats = seats;
		this.price = price;
		this.moreInfo = moreInfo;
		this.numOfCars = numOfCars;
	}



	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public String getFuel() {return fuel;}
	public void setFuel(String fuel) {this.fuel = fuel;}

	public String getEngine() {return engine;}
	public void setEngine(String engine) {this.engine = engine;}

	public int getSeats() {return seats;}
	public void setSeats(int seats) {this.seats = seats;}

    public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public String getMoreInfo() {return moreInfo;}
	public void setMoreInfo(String moreInfo) {this.moreInfo = moreInfo;}

	public int getNumOfCars() {return numOfCars;}
	public void setNumOfCars(int numOfCars) {this.numOfCars = numOfCars;}

	public List<Booking> getBookings() {return bookings;}
	public void setBookings(List<Booking> bookings) {this.bookings = bookings;}

	public Dealership getDealership() {return dealership;}
	public void setDealership(Dealership dealership) {this.dealership = dealership;}


}