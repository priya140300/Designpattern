package com.myproject;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String subject, String message) {
        for (Subscriber subscriber : subscribers) {
            String channel = subscriber.getChannel();
            NotificationFacade facade = new NotificationFacade();
            facade.sendNotification(channel, subject, message);
        }
    }
}
