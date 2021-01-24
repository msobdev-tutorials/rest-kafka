package com.msobdev.kafka.restkafka.domain.messaging.ports;

import java.io.IOException;

public interface Consumer {
    void consume(String message) throws IOException;
}
