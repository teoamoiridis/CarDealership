package com.example.demo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dealership {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String dname;
	@Column(unique=true)
	private String email;
	private String password;
	
	@OneToMany(mappedBy="dealership")
	private List<Car> cars;
	
	
	
	public Dealership() {
		
	}
	
	public Dealership(String dname, String email, String password) {
		this.dname = dname;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getDname() {return dname;}
    public void setDname(String dname) {this.dname = dname;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public List<Car> getCars() {return cars;}
	public void setCars(List<Car> cars) {this.cars = cars;}
	
	
}
