package com.restaurante.food;

import jakarta.persistence.*;

@Table(name = "tb_food")
@Entity(name = "tb_food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private String image;
}
