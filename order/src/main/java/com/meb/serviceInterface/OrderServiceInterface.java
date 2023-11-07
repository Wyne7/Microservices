package com.meb.serviceInterface;

import com.meb.dto.DataResponse;
import com.meb.dto.OrderDTO;

public interface OrderServiceInterface {

    DataResponse saveOrder(OrderDTO dto);
}