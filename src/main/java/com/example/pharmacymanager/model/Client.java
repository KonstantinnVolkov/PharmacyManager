package com.example.pharmacymanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long clientId;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_surname")
    private String surname;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "address")
    private String address;

    @OneToOne
    private ClientCategory clientCategory;
}
