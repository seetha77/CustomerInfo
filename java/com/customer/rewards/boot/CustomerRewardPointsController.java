package com.customer.rewards.boot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rewards.model.Customer;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CustomerRewardPointsController {

	private static final Logger LOGGER=LoggerFactory.getLogger(CustomerRewardPointsController.class);
	
	@Autowired
	private CustomerRewardPointsService rewardsService;

	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		LOGGER.info("All cusotmers details");
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		LOGGER.info("Cusotmers details by id");
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
}
