package com.customer.rewards.boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.rewards.model.Customer;

@Repository
public interface CustomerTransactionRepository extends JpaRepository<Customer, Integer>{

}
