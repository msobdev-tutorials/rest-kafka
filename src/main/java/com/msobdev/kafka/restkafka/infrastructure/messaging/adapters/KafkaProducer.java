package com.msobdev.kafka.restkafka.infrastructure.messaging.adapters;

import com.msobdev.kafka.restkafka.domain.messaging.ports.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
public class KafkaProducer implements Producer {

    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        log.info(String.format("#### -> Producing message -> %s", message));
        kafkaTemplate.send(TOPIC, message);
    }
}
