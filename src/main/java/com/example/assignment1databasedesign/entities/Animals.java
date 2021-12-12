package com.example.assignment1databasedesign.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String animalType;
    private int totalNumber;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

    @ManyToMany
    private List<FoodItems> foodItems=
            new ArrayList<>();

    public void addFoodItems(FoodItems foodItem){
        foodItems.add(foodItem);
    }

    public Animals() {
    }

    public Animals(String animalType, int totalNumber) {
        this.animalType = animalType;
        this.totalNumber = totalNumber;
    }
}
