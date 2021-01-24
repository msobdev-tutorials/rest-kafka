package com.msobdev.kafka.restkafka.infrastructure.messaging.adapters;

import com.msobdev.kafka.restkafka.domain.messaging.model.User;
import com.msobdev.kafka.restkafka.domain.messaging.ports.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer implements Producer {

    private static final String TOPIC = "users";

    private KafkaTemplate<Object, Object> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<Object, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(User user) {
        log.info(String.format("#### -> Producing message -> %s", user));
        kafkaTemplate.send(TOPIC, user);
    }


}
