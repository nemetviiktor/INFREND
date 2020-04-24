package com.infrend.pizza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infrend.pizza.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	List<Customer> findAll();
}
