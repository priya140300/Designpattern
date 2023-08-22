package com.myproject.notifications;

public class SMSNotification implements NotificationSystem {
    @Override
    public void sendNotification(String channel, String subject, String message) {
        // Implement SMS notification logic here
        System.out.println("Sending SMS to " + channel + " - Subject: " + subject + ", Message: " + message);
    }
}
