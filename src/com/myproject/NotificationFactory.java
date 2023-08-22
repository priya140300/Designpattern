package com.myproject;

import com.myproject.notifications.EmailNotification;
import com.myproject.notifications.NotificationSystem;
import com.myproject.notifications.SMSNotification;

public class NotificationFactory {
    public NotificationSystem createNotification(String channel) {
        if ("Email@example.com".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        } else if (channel.startsWith("SMS")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Invalid notification channel: " + channel);
    }
}
