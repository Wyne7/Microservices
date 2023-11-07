package com.meb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meb.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel,Integer>{

	
}
