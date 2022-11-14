package com.service.customerRewards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.customerRewards.dao.RewardsService;
import com.service.customerRewards.model.Customer;
import com.service.customerRewards.model.Rewards;

@RestController
public class RewardsController {

	@Autowired
	private RewardsService rewardsService;

	@GetMapping("/Rewards/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@GetMapping("/transactions")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	 
	@GetMapping("/Rewards")
	public List<Rewards> getAllRewards() {
		return rewardsService.getRewardsAll();
	}

}
