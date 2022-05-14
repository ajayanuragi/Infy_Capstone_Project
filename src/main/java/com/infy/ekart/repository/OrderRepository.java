package com.infy.ekart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.ekart.dto.OrderDTO;
import com.infy.ekart.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
  
	// add methods if required
	 List<OrderDTO> findOrdersByCustomerEmailId(String emailId);
	
}
