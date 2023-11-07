package com.meb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meb.dto.DataResponse;
import com.meb.dto.OrderDTO;
import com.meb.service.OrderService;
import com.meb.serviceInterface.OrderServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class OrderController {
    @Autowired
    private OrderServiceInterface orderServiceInterface;

    @PostMapping(value="/orderSave")
    public DataResponse saveOrder(@RequestBody OrderDTO dto)
    {
        DataResponse res=orderServiceInterface.saveOrder(dto);
        return  res;
        
    }
}
