package com.devpb.orderService.controller.repository;

import com.devpb.orderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
