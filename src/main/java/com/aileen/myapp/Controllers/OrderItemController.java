package com.aileen.myapp.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aileen.myapp.Model.OrderItem;
import com.aileen.myapp.NotFoundException.OrderItemNotFoundException;
import com.aileen.myapp.Repository.OrderItemRepository;

@RestController
public class OrderItemController {

    OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/orderitems")
    public List<OrderItem> getOrderItems(){
        return repo.findAll();
    }

    @GetMapping("/orderitems/{id}")
    public OrderItem getOrderItem(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderItemNotFoundException(id));
    }

    @PostMapping("/orderitems/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem){
        repo.save(newOrderItem);
        return "A new order item is added.";

    }

    @DeleteMapping("/orderitems/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id){
        repo.deleteById(id);
        return "An order item is deleted.";
    }

}
