package com.example.consumer.model;

public class SubscriberOptionDto {
    private String subscriberId;
    private String subscription;
    private String option;

    public SubscriberOptionDto() {}

    public String getSubscriberId() { return subscriberId; }
    public void setSubscriberId(String subscriberId) { this.subscriberId = subscriberId; }

    public String getSubscription() { return subscription; }
    public void setSubscription(String subscription) { this.subscription = subscription; }

    public String getOption() { return option; }
    public void setOption(String option) { this.option = option; }
}