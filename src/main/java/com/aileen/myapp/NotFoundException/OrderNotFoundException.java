package com.aileen.myapp.NotFoundException;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id){
        super("Could not find product with "  + id);
    }
}