package com.BehaviourialDP.Template.example;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        PurchaseOrderTemplate online= new OnlinePurchaseOrder();
        online.processOrder();
        PurchaseOrderTemplate offline= new StorePurchaseOrder();
        offline.processOrder();
    }
}
