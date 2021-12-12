package com.example.assignment1databasedesign.dao;

import com.example.assignment1databasedesign.entities.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemsDao extends JpaRepository<FoodItems,Integer> {
}
