package com.deltaswipe.springboot_docker_k8s.repository;

import com.deltaswipe.springboot_docker_k8s.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
