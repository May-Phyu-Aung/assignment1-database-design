package com.example.assignment1databasedesign.dao;

import com.example.assignment1databasedesign.entities.Cage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CageDao extends JpaRepository<Cage,Integer> {
}
