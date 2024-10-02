package com.example.remiges.service;

import java.util.List;

import com.example.remiges.model.Customer;

public interface CustomerService {
	
	public Customer getCustomerById(int id);
	
	public List<Customer> getAllCustomers();

}
