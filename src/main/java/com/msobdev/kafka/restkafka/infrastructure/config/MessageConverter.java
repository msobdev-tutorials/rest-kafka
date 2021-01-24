package com.msobdev.kafka.restkafka.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class MessageConverter {

    @Bean
    public RecordMessageConverter converter() {
        return new StringJsonMessageConverter();
    }
}
