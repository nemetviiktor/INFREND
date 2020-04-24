package com.infrend.pizza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infrend.pizza.Model.Oven;

public interface OvenRepository extends JpaRepository<Oven, Integer>{

	List<Oven> findAll();
}
