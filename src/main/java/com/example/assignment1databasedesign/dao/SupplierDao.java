package com.example.assignment1databasedesign.dao;

import com.example.assignment1databasedesign.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier,Integer> {
}
