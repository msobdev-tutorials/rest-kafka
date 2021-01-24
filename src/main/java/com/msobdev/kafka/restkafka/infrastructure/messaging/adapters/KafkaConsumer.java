package com.msobdev.kafka.restkafka.infrastructure.messaging.adapters;

import com.msobdev.kafka.restkafka.domain.messaging.model.User;
import com.msobdev.kafka.restkafka.domain.messaging.ports.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer implements Consumer {

    @Override
    @KafkaListener(id = "fooGroup", topics = "users")
    public void consume(User user) {
        if (user.getName().startsWith("foo")) {
            throw new RuntimeException("failed");
        }
        log.info(String.format("#### -> Consumed message -> %s", user.getName()));
    }

    @KafkaListener(id = "dltGroup", topics = "users.DLT")
    public void dltListen(User in) {
        log.info("Received from DLT: " + in);
    }
}
