package com.service.customerRewards.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.customerRewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
