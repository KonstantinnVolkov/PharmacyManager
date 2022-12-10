package com.example.pharmacymanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recipe")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long recipeId;

    private String doctorName;
    private String doctorSurname;
    private Date issueDate;

    @OneToOne
    private Drug drug;

}
