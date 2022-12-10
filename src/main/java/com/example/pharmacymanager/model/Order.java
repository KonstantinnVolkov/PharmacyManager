package com.example.pharmacymanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long orderId;

    @Column(name = "price")
    private Double price;

    @Column(name = "order_date")
    private Date orderDate;

    @OneToOne
    private Recipe recipe;

    @OneToOne
    private Client client;

}
