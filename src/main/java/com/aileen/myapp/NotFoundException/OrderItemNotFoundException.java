package com.aileen.myapp.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Long id){
        super("Could not find product with "  + id);
    }
}
