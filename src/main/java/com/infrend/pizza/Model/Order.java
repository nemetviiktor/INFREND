package com.infrend.pizza.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="customername")
	private String customername;
	
	@Column(name="foodid")
	private int foodid;
	
	@Column(name="total")
	private int total;
	
	@Column(name="deliverytime")
	private int deliverytime;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(int deliverytime) {
		this.deliverytime = deliverytime;
	}
}
