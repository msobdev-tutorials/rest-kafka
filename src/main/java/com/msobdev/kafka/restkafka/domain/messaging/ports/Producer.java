package com.msobdev.kafka.restkafka.domain.messaging.ports;

public interface Producer {
    void sendMessage(String message);
}
