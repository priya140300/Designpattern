package com.myproject;

public class UserSubscriber implements Subscriber {
    private String channel;
    private String contact;

    public UserSubscriber(String channel, String contact) {
        this.channel = channel;
        this.contact = contact;
    }

    @Override
    public String getChannel() {
        if ("Email".equalsIgnoreCase(channel)) {
            return contact;
        } else if ("SMS".equalsIgnoreCase(channel)) {
            return "SMS to " + contact;
        } else {
            throw new IllegalArgumentException("Invalid channel: " + channel);
        }
    }
}
