package com.example.assignment1databasedesign.service;

import com.example.assignment1databasedesign.dao.*;
import com.example.assignment1databasedesign.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ZooService {

    @Autowired
    private CageDao cageDao;
    @Autowired
    private AnimalsDao animalsDao;
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private SupplierDao supplierDao;
    @Autowired
    private FoodItemsDao foodItemsDao;



    @Transactional
    public void createDb(){
        Cage cage1=new Cage(1,"Area 1");
        Cage cage2=new Cage(2,"Area 4");
        Cage cage3=new Cage(3,"Area 5");

        Animals animals1 = new Animals("Snake",20);
        Animals animals2 = new Animals("Cow",30);
        Animals animals3 = new Animals("Swallow",35);
        Animals animals4 = new Animals("Pig",35);
        Animals animals5 = new Animals("Swift",35);


        Supplier supplier1= new Supplier("Mg Mg","345-232-234","Yangon");
        Supplier supplier2= new Supplier("Mg Soe","000-232-234","Mdy");

        FoodItems foodItems1= new FoodItems("Potato",200);
        FoodItems foodItems2= new FoodItems("Carrot",100);
        FoodItems foodItems3= new FoodItems("Broccoli",300);
        FoodItems foodItems4= new FoodItems("Cabbage",200);

        Category category1= new Category();
        category1.setCategoryType("Mammals");

        Category category2= new Category();
        category2.setCategoryType("Birds");

        Category category3= new Category();
        category3.setCategoryType("Reptiles");



        cage1.setAnimals(animals1);
        cage2.setAnimals(animals2);
        cage3.setAnimals(animals3);

        animalsDao.save(animals1);
        animalsDao.save(animals2);
        animalsDao.save(animals3);
        cageDao.save(cage1);
        cageDao.save(cage2);
        cageDao.save(cage3);

        foodItems1.setSupplier(supplier1);
        foodItems2.setSupplier(supplier1);
        foodItems3.setSupplier(supplier2);
        foodItems4.setSupplier(supplier2);

        supplierDao.save(supplier1);
        supplierDao.save(supplier2);
        foodItemsDao.save(foodItems1);
        foodItemsDao.save(foodItems2);
        foodItemsDao.save(foodItems3);
        foodItemsDao.save(foodItems4);


        animals1.setCategory(category3);
        animals2.setCategory(category1);
        animals3.setCategory(category2);
        animals4.setCategory(category1);
        animals5.setCategory(category2);

        categoryDao.save(category1);
        categoryDao.save(category2);
        categoryDao.save(category3);

        animalsDao.save(animals1);
        animalsDao.save(animals2);
        animalsDao.save(animals3);
        animalsDao.save(animals4);
        animalsDao.save(animals5);

        animals1.addFoodItems(foodItems1);
        animals2.addFoodItems(foodItems1);
        animals2.addFoodItems(foodItems2);
        animals3.addFoodItems(foodItems4);
        animals4.addFoodItems(foodItems3);
        animals4.addFoodItems(foodItems2);
        animals4.addFoodItems(foodItems4);
        animals5.addFoodItems(foodItems2);




    }
}
