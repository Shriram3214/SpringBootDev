package com.example.remiges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.remiges.model.Customer;
import com.example.remiges.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	//This method accessed by user whose role is user
	@GetMapping("/getCustById/id")
	public ResponseEntity<Customer> getCustmoreById(@PathVariable("id") int custId){
		return ResponseEntity.ok(customerService.getCustomerById(custId));
	}
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomerData(){
		return ResponseEntity.ok(customerService.getAllCustomers());
	}
	
	
}
