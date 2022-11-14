package com.example.producer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	@KafkaListener(topics = "test", groupId = "test-group")
	public void listener(String message) {
	    System.out.println("Received Message in group test-group: " + message);
	}
}
