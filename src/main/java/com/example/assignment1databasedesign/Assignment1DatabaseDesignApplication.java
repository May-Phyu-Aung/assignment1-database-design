package com.example.assignment1databasedesign;

import com.example.assignment1databasedesign.service.ZooService;
import com.example.assignment1databasedesign.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1DatabaseDesignApplication implements CommandLineRunner {

    @Autowired
    private ZooService zooService;

    public static void main(String[] args) {
        SpringApplication.run(Assignment1DatabaseDesignApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        zooService.createDb();

        JPAUtil.checkData("select * from cage");
        JPAUtil.checkData("select * from animals ");
        JPAUtil.checkData("select * from supplier");
        JPAUtil.checkData("select * from food_items");
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from animals_food_items");

    }
}
