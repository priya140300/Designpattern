package com.myproject;

import com.myproject.notifications.NotificationSystem;

public class NotificationFacade {
    private NotificationFactory factory = new NotificationFactory();

    public void sendNotification(String channel, String subject, String message) {
        NotificationSystem notification = factory.createNotification(channel);
        notification.sendNotification(channel, subject, message);
    }
}
