package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer getCustomer(Integer customer_id) {
		Optional<Customer> customerOptional = customerRepository.findById(customer_id);
		
		if(customerOptional.isEmpty()) {
			throw new CustomerNotFoundException("Customer with ID " + :customer_id + " is not available.");
		}
		
		Customer customer = customerOptional.get();
		return customer;
	}

}
