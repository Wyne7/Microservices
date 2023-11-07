package com.meb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class OrderModel 
{
	public OrderModel() {}
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
    @Column(name = "syskey", nullable = true)
	private int syskey;
	private int stock_syskey;
	private int qty;
	private double unit_price;
	private double total_price;
    private boolean deleteStatus ;
	
}
