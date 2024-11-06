package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() { sendMsgOnMobile(userName, "product is in Stock hurry up!"); }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to: " + userName);
        // Send the actual Message on Mobile
    }
}
