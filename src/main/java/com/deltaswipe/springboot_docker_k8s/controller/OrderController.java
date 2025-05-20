package com.deltaswipe.springboot_docker_k8s.controller;

import com.deltaswipe.springboot_docker_k8s.entity.Order;
import com.deltaswipe.springboot_docker_k8s.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/message")
    public String getMessage(){
        return "Successfully containerized and orchestrated SpringBoot Application with MySQL Database Instance!";
    }

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order){
        Order addOrder = orderService.addOrder(order);
        return addOrder;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        Order getOrder = orderService.getOrderById(id);
        return getOrder;
    }

    @GetMapping("/all")
    public List<Order> getAllOrders(){
        List<Order> orders = orderService.getAllOrder();
        return orders;
    }
}
