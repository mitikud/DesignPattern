package com.BehaviourialDP.Strategy.example;

public class StrategyPatternTest {

    public static void main(String[] args) {

        int[] nums= {6, 9, 7, 4, 8};

        //We can provide any strategy to do the sorting
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(nums);

        //We can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(nums);
    }
}