package com.example.kafkaconfigurations.kafka;

import com.example.kafkaconfigurations.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class KafkaConsumer {
    private KafkaConfig kafkaConfig;

    public KafkaConsumer(KafkaConfig kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    @KafkaListener(topics = "${kafka.topicName}", groupId = "${kafka.groupId}")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}