package com.deltaswipe.springboot_docker_k8s.service;

import com.deltaswipe.springboot_docker_k8s.entity.Order;
import com.deltaswipe.springboot_docker_k8s.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order addOrder(Order order){
        Order addOrder = orderRepository.save(order);
        return addOrder;
    }

    public Order getOrderById(int id){
        Order order = orderRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id: "+id));
        return order;
    }

    public List<Order> getAllOrder(){
        List<Order> orders = orderRepository.findAll();
        return orders;
    }
}
