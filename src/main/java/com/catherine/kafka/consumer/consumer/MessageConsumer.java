package com.catherine.kafka.consumer.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Value("${spring.kafka.consumer.topics}")
    private String topics;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @KafkaListener(topics = "missions", groupId = "mongodb-topics")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
