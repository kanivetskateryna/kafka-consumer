package com.catherine.kafka.consumer.controller;

import com.catherine.kafka.consumer.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test-kafka/")
@RequiredArgsConstructor
public class KafkaController {

    private final MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("missions", message);
        return "Message sent: " + message;
    }
}
