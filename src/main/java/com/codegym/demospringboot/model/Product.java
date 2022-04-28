package com.codegym.demospringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Varchar(50)", nullable = false)
    @NotEmpty
    private String name;

    @Column(nullable = false)
    @NotNull
    private double price;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    @NotNull
    private String description;

    private String image;


    @ManyToOne
    private Category category;

}