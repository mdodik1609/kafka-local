package com.example.consumer.model;

public class SubscriberOption {
    private String subscriberId;
    private String optionId;

    public SubscriberOption() {}

    public SubscriberOption(String subscriberId, String optionId) {
        this.subscriberId = subscriberId;
        this.optionId = optionId;
    }

    public String getSubscriberId() { return subscriberId; }
    public void setSubscriberId(String subscriberId) { this.subscriberId = subscriberId; }

    public String getOptionId() { return optionId; }
    public void setOptionId(String optionId) { this.optionId = optionId; }
}