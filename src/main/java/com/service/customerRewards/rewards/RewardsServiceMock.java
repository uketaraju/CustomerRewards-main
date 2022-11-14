package com.service.customerRewards.rewards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.service.customerRewards.model.Customer;
import com.service.customerRewards.model.MyTransaction;

@Service
public class RewardsServiceMock {

	private static List<MyTransaction> transactions = new ArrayList<MyTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new MyTransaction(index++, new Customer(1, "Joseph"), 100.0, "Purchase 1") );
		transactions.add( new MyTransaction(index++, new Customer(2, "Jimmy"), 50.0, "Purchase 2") );
		transactions.add( new MyTransaction(index++, new Customer(3, "Gramy"), 120.0, "Purchase 3") );
	
	}
	
	
	public List<MyTransaction> getAll() {
		return transactions;
	}
	
}
