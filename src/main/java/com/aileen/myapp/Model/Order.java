package com.aileen.myapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ordertbl")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private Long userId;
    private double total;
    private String status;

    Order(){}

    public Order(Long userId, double total, String status) {
        this.userId = userId;
        this.total = total;
        this.status = status;
    }

    //getters

    public Long getId(){
        return id;
    }
    public Long getUserId() {
        return userId;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    //setters

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotal (double total) {
        this.total = total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}