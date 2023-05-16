package com.zahid.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String landmark;

    private String zipcode;

    private String district;

    private String state;

    private String country;

    @OneToOne(mappedBy = "address")
    private Student student;

}
