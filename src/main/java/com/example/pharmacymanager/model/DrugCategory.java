package com.example.pharmacymanager.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "drug_category")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrugCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long drugCategoryId;

    @Column(name = "drug_category_name")
    @Enumerated(EnumType.STRING)
    private DrugCategoryEnum drugCategoryEnum;
}
