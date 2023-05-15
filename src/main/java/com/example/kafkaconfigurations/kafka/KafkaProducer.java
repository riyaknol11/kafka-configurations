package com.example.kafkaconfigurations.kafka;

import com.example.kafkaconfigurations.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    private KafkaConfig kafkaConfig;

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaConfig kafkaConfig, KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaConfig = kafkaConfig;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(kafkaConfig.getTopicName(), message);
    }
}