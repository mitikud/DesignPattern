package com.creational.builder.example1;

public class JapaneseMealBuilder implements MealBuilder{
    Meal meal;

    public JapaneseMealBuilder() {
        meal= new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Japanese Starter");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Japanese Main Course");
    }

    @Override
    public void buildDesserts() {
        meal.setDesserts("Japanese Dessert");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
