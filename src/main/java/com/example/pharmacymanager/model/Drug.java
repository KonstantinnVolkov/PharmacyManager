package com.example.pharmacymanager.model;


import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "drug")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Drug{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long drugID;
    private Integer dose;
    private Double price;
    private Integer amount;

    @OneToOne
    private DrugCategory drugCategory;
}
