package com.aileen.myapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue 
    private long id;
    private String productName;
    private String description;
    private double price;
    private String url;

    Product(){}

    public Product(String productName, String description, double price, String url) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    //Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    public String getUrl() {
        return url;
    }

    

}
