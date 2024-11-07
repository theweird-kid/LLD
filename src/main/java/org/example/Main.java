package org.example;

import DecoratorPattern.BasePizza;
import DecoratorPattern.VegDelight;
import DecoratorPattern.decorator.ExtraCheese;
import DecoratorPattern.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {

        /*
        // Observer Pattern
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver obv1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obv2 = new MobileAlertObserverImpl("Sean", iphoneStockObservable);
        NotificationAlertObserver obv3 = new EmailAlertObserverImpl("jake@outlook.com", iphoneStockObservable);

        iphoneStockObservable.add(obv1);
        iphoneStockObservable.add(obv2);
        iphoneStockObservable.add(obv3);

        iphoneStockObservable.setStockCount(10);
        */

        // Decorator Pattern
        BasePizza plainPizza = new VegDelight();
        System.out.println("plain Veg Pizza: $" + plainPizza.cost());

        BasePizza pizzaWithCheese = new ExtraCheese(new VegDelight());
        System.out.println("pizza with extra Cheese: $" +pizzaWithCheese.cost());

        BasePizza pizzaWithCheeseAndMushroom = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("pizza with mushroom & Extra cheese: $" + pizzaWithCheeseAndMushroom.cost());
    }
}