package com.example.demo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String lastname;
	@Column(unique=true)
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<Booking> bookings;

	
	
	public Customer() {
	}
	
	
	public Customer(String name, String lastname, String email, String password) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	

	public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getLastname() {return lastname;}
	public void setLastname(String lastname) {this.lastname = lastname;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public List<Booking> getBookings() {return bookings;}
	public void setBookings(List<Booking> bookings) {this.bookings = bookings;}
	

}