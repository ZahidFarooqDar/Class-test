package com.zahid.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;

    private String age;

    private String phoneNumber;

    private String branch;

    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    @ManyToMany(mappedBy = "students")
    private List<Course> courses = new ArrayList<>();
}
