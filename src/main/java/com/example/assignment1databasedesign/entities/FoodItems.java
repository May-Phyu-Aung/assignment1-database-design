package com.example.assignment1databasedesign.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Supplier supplier;

    public FoodItems() {
    }

    public FoodItems(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
