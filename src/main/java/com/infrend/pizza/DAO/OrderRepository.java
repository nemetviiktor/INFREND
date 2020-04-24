package com.infrend.pizza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infrend.pizza.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	List<Order> findAll();
}
