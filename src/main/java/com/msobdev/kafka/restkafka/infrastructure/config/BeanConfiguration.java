package com.msobdev.kafka.restkafka.infrastructure.config;

import com.msobdev.kafka.restkafka.domain.messaging.ports.Consumer;
import com.msobdev.kafka.restkafka.domain.messaging.ports.Producer;
import com.msobdev.kafka.restkafka.infrastructure.messaging.adapters.KafkaConsumer;
import com.msobdev.kafka.restkafka.infrastructure.messaging.adapters.KafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Producer producer() {
        return new KafkaProducer();
    }

    @Bean
    public Consumer consumer() {
        return new KafkaConsumer();
    }
}
