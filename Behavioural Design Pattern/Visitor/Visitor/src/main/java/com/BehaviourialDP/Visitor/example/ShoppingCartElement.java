package com.BehaviourialDP.Visitor.example;

public interface ShoppingCartElement {

    public int accept(ShoppingCartVisitor visitor);
}
