package com.creational.builder.example1;

public class MealDirector {
    private MealBuilder mealBuilder = null;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildStarter();
        mealBuilder.buildMainCourse();
        mealBuilder.buildDesserts();
    }

    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
}
