package com.example.consumer.model;

public class Subscriber {
    private String subscriberId;
    private String subscription;

    public Subscriber() {}

    public Subscriber(String subscriberId, String subscription) {
        this.subscriberId = subscriberId;
        this.subscription = subscription;
    }

    public String getSubscriberId() { return subscriberId; }
    public void setSubscriberId(String subscriberId) { this.subscriberId = subscriberId; }

    public String getSubscription() { return subscription; }
    public void setSubscription(String subscription) { this.subscription = subscription; }
}