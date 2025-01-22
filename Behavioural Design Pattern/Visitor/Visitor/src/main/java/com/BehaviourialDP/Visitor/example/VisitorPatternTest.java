package com.BehaviourialDP.Visitor.example;

public class VisitorPatternTest {

    public static void main(String[] args) {

        ShoppingCartElement[] items = new ShoppingCartElement[]{new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ShoppingCartElement[] items) {

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ShoppingCartElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}