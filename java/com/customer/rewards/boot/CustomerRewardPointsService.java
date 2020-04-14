package com.customer.rewards.boot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.rewards.model.Customer;

@Service
public class CustomerRewardPointsService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(CustomerRewardPointsService.class);
	
	@Autowired
	private CustomerTransactionRepository customerRepository;
	
	
	public List<Customer> getCustomerAll() {
		LOGGER.info("Service details of customer");
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Integer customerId) {
		LOGGER.info("customer details of each one");
		return customerRepository.findById(customerId).orElse(null);
	}
	


}
