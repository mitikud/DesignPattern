package com.BehaviourialDP.Strategy.example;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void arrange(int [] input){
        strategy.sort(input);
    }
}