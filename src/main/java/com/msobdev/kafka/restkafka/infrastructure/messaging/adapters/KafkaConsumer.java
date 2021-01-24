package com.msobdev.kafka.restkafka.infrastructure.messaging.adapters;

import com.msobdev.kafka.restkafka.domain.messaging.ports.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

@Slf4j
public class KafkaConsumer implements Consumer {

    @KafkaListener(topics = "users", groupId = "group_id")
    @Override
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
