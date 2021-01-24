package com.msobdev.kafka.restkafka.domain.messaging.ports;

import com.msobdev.kafka.restkafka.domain.messaging.model.User;

public interface Producer {
    void sendMessage(User user);
}
