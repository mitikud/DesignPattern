package com.BehaviourialDP.Strategy.example;

public class InsertionSort implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using insertion sort strategy");
    }
}
