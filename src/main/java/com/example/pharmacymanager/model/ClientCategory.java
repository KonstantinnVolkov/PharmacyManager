package com.example.pharmacymanager.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "client_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long clientCategoryId;

    @Column(name = "client_category_name")
    @Enumerated(EnumType.STRING)
    private ClientCategoryEnum clientCategoryEnumCategory;
}
