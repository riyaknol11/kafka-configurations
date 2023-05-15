package com.example.kafkaconfigurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaConfigurationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConfigurationsApplication.class, args);
	}

}
