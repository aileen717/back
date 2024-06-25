package com.aileen.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aileen.myapp.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
