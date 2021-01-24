package com.msobdev.kafka.restkafka.infrastructure.messaging.adapters;

import com.msobdev.kafka.restkafka.domain.messaging.ports.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer implements Consumer {

    @KafkaListener(topics = "users", groupId = "group_id")
    @Override
    public void consume(String message) {
        if (message.startsWith("foo")) {
            throw new RuntimeException("failed");
        }
        log.info(String.format("#### -> Consumed message -> %s", message));
    }

    @KafkaListener(id = "dltGroup", topics = "users.DLT")
    public void dltListen(String in) {
        log.info("Received from DLT: " + in);
    }
}
