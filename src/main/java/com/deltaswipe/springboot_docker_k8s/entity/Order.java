package com.deltaswipe.springboot_docker_k8s.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDER_TBL")
public class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    int orderId;
    String orderName;
    int qty;
    double price;

}
