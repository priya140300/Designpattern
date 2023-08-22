package com.myproject.notifications;

public class EmailNotification implements NotificationSystem {
    @Override
    public void sendNotification(String channel, String subject, String message) {
        // Implement email notification logic here
        System.out.println("Sending Email to " + channel + " - Subject: " + subject + ", Message: " + message);
    }
}
