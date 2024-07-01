package com.aileen.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aileen.myapp.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
