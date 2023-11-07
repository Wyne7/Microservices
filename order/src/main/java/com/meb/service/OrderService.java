package com.meb.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meb.dto.DataResponse;
import com.meb.dto.OrderDTO;
import com.meb.model.OrderModel;
import com.meb.persistence.OrderRepository;
import com.meb.serviceInterface.OrderServiceInterface;

import jakarta.transaction.Transactional;

@Service
public class OrderService implements OrderServiceInterface{

	@Autowired
	OrderRepository orderRepository;
	
	
	@Transactional
	public DataResponse saveOrder(OrderDTO dto) {
		
		DataResponse res=new DataResponse();
		OrderModel orderModel=new OrderModel();
		orderModel.setSyskey(1);
		orderModel.setQty(5);
		orderModel.setUnit_price(1.1);
		orderModel.setTotal_price(1.1);
		
		try {
			orderRepository.save(orderModel);
			res.setDescription("Success");  
	    } catch (Exception   e) {
	    	res.setDescription(e.getMessage());
	    }
		return res;
		
	}
}
