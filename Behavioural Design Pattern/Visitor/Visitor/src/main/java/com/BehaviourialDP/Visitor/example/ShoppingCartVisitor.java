package com.BehaviourialDP.Visitor.example;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
