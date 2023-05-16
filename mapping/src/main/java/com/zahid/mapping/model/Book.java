package com.zahid.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    private Long ID;

    private String title;

    private String author;

    private String description;

    private String price;

    @ManyToOne
    private Student student;
}
