package com.example.remiges.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.remiges.model.Customer;
import com.example.remiges.repository.CustomerRepository;

import jakarta.annotation.PostConstruct;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void initilizeCustomerTable() {
		customerRepository
				.saveAll(Stream.of(new Customer("Ram", 10000), new Customer("Shyam", 11000), new Customer("Gita", 20000)

				).collect(Collectors.toList()));
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

}
