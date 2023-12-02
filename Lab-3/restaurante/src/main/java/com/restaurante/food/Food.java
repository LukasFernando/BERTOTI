package com.restaurante.food;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_food")
@Entity(name = "tb_food")
@NoArgsConstructor
@Getter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    @Column(columnDefinition = "varchar(21000)")
    private String image;
    
    public Food(DTOFood dtoFood){
        this.name = dtoFood.name();
        this.description = dtoFood.description();
        this.price = dtoFood.price();
        this.image = dtoFood.image();
    }
}
