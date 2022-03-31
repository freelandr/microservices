package org.richard.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;

	public void registerCustomer(CustomerRegistrationRequest customerRequest) {
		Customer customer = Customer.builder()
				.firstname(customerRequest.getFirstname())
				.lastname(customerRequest.getLastname())
				.email(customerRequest.getEmail())
				.build();
		
		// TODO: check email valid
		// TODO: check email not taken
		repository.save(customer);
	}

}
