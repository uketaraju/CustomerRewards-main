package com.service.customerRewards.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.customerRewards.model.Customer;
//import com.service.customerRewards.model.Reward;
import com.service.customerRewards.model.Rewards;

@Service
public class RewardsService {
	
	
	  @Autowired private CustomerRepository customerRepository;
	 
	
	@Autowired
	private RewardsRepository rewardsRepository;
	
	/*
	 * @PostConstruct public void initDb() { List<Rewards> rewards= new
	 * ArrayList<>(); rewards.add(new Rewards(1,"transaction <50", 0));
	 * rewards.add(new Rewards(2,"transaction >50 & transaction<100", 1));
	 * rewards.add(new Rewards(3,"transaction>100", 2));
	 * rewardsRepository.saveAll(rewards); }
	 */
	
	
	  public List<Customer> getCustomerAll() { return customerRepository.findAll();
	  }
	 
	 public Customer getCustomerById(Integer customerId) { return
	 customerRepository.findById(customerId).orElse(null); }
	 

	public List<Rewards> getRewardsAll() {
		return rewardsRepository.findAll();
	}
	

}
