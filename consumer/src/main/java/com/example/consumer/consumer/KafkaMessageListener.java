package com.example.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaMessageListener(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "demo-topic", groupId = "demo-group")
    public void listen(String message) throws Exception {
        String newMessage = message + " This is addon on message.";
        kafkaTemplate.send("demo-topic-core", newMessage);
        System.out.println("Transformed and forwarded: " + newMessage);
    }
}
