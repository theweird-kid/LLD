package org.example;

import observerPattern.observable.IphoneObservableImpl;
import observerPattern.observable.StockObservable;
import observerPattern.observer.EmailAlertObserverImpl;
import observerPattern.observer.MobileAlertObserverImpl;
import observerPattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        // Observer Pattern
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver obv1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obv2 = new MobileAlertObserverImpl("Sean", iphoneStockObservable);
        NotificationAlertObserver obv3 = new EmailAlertObserverImpl("jake@outlook.com", iphoneStockObservable);

        iphoneStockObservable.add(obv1);
        iphoneStockObservable.add(obv2);
        iphoneStockObservable.add(obv3);

        iphoneStockObservable.setStockCount(10);

    }
}