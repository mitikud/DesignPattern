package com.creational.builder.example1;

public class BuilderTest {
    public static void main(String[] args) {

        MealBuilder indianMealBuilder = new IndianMealBuilder();
        MealDirector mealDirector= new MealDirector(indianMealBuilder);
        mealDirector.constructMeal();
        Meal meal= mealDirector.getMeal();
        System.out.println("Requested meal is :" +meal);
    }
}
