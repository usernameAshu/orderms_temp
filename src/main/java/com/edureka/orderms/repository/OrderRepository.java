package com.edureka.orderms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.edureka.orderms.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Order findByOrderId(@Param("order_id") long orderId);
}
