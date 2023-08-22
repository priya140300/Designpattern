package com.myproject;

public class Main {
    public static void main(String[] args) {
        // Create a notification publisher
        NotificationPublisher publisher = new NotificationPublisher();
       
        // Mocked subscribers (users who have subscribed for notifications)
        Subscriber user1 = new UserSubscriber("Email", "Email@example.com");
        Subscriber user2 = new UserSubscriber("SMS", "1234567890");


        



        // Add subscribers to the publisher
        publisher.addSubscriber(user1);
        publisher.addSubscriber(user2);

        // Send notifications
        publisher.notifySubscribers("Important Update", "This is an important notification.");
    }
}
