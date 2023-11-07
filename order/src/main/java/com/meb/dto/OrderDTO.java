package com.meb.dto;
import lombok.Data;

@Data
public class OrderDTO {

    private int id;
	private int syskey;
	private int stock_syskey;
	private int qty;
	private double unit_price;
	private double total_price;
    private boolean deleteStatus ;
}
