package com.infrend.pizza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infrend.pizza.Model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{
	
	List<Menu> findAll();
}
