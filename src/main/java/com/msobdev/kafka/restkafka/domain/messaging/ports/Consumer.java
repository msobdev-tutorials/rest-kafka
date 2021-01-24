package com.msobdev.kafka.restkafka.domain.messaging.ports;

import com.msobdev.kafka.restkafka.domain.messaging.model.User;

public interface Consumer {
    void consume(User user);
}
