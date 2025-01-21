package com.creational.builder.example1;

public class IndianMealBuilder implements MealBuilder{

    Meal meal;

    public IndianMealBuilder(){
        meal= new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Indian Starter");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Indian MainCourse");
    }

    @Override
    public void buildDesserts() {
        meal.setDesserts("Indian Desserts");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
