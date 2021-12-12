package com.example.assignment1databasedesign.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String categoryType;

    public Category() {
    }

    public Category(String categoryType) {
        this.categoryType = categoryType;
    }
}
