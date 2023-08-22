package com.myproject.notifications;

public interface NotificationSystem {
    void sendNotification(String channel, String subject, String message);
}
