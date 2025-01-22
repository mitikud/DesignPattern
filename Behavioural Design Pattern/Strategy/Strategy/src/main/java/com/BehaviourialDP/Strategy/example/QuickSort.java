package com.BehaviourialDP.Strategy.example;

public class QuickSort implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using quick sort strategy");
    }
}
