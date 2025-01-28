package com.example.demo;

public class BuyCarResponse {
	
	private Integer id;
	private int numOfCars;
	
	
	
	public BuyCarResponse(Integer id, int numOfCars) {
		this.id = id;
		this.numOfCars = numOfCars;
	}
	
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	public int getNumOfCars() {return numOfCars;}
	public void setNumOfCars(int numOfCars) {this.numOfCars = numOfCars;}
	
	
}
