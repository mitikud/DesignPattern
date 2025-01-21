package com.creational.builder.example1;

public interface MealBuilder {
    public void buildStarter();
    public void buildMainCourse();
    public void buildDesserts();

    public Meal getMeal();
}
