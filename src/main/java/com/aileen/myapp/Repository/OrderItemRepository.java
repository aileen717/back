package com.aileen.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aileen.myapp.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

