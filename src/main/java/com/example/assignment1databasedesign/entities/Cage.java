package com.example.assignment1databasedesign.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int cageNo;
    private String location;

    @OneToOne
    private Animals animals;

    public Cage() {
    }

    public Cage(int cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }
}
